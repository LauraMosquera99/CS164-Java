import java.io.*;
import java.util.Scanner;

public class MazeSolver {
    
    //DO NOT MODIFY THIS METHOD
    //Q1) What will be the character at index [3][2]?
    // it would be G
    //Q2) What will the array access to get the bottom right most character of our maze be? Assume the array name is "maze"
    //maze[4][3]
    // How to test your code
    // Compile using the command line "javac MazeSolver.java"
    public static void main(String[] args) throws IOException {
        try {
            String input_file = args[0];
            System.out.println("Reading File: " + input_file);
            char[][] maze = readMaze(input_file);
            String path = solveMaze(maze);
            System.out.println("Maze Solved Result: \""+path+"\"");
            writePath(path, new File(input_file).getName());
        } catch (FileNotFoundException e) {
            System.out.println("Error: file not found");
        } catch (IOException io) {
            System.out.println("Error: Target File Cannot be Written to");
        }
    }
    // DO NOT MODIFY THIS METHOD
    public static void writePath(String path, String filename) throws IOException {
        File outputDir = new File("output");
        if (!outputDir.exists()) {
            outputDir.mkdirs();
        }
        String outputPath = "output" + File.separator + filename;
        PrintWriter writer = new PrintWriter(new FileWriter(outputPath));
        if (path != null) {
            writer.println(path);
        } else {
            writer.println("No path found");
        }
        writer.close();
    }
    
    public static char[][] readMaze(String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filename));
        //Scanners Given to streamline process

        // read height and W
        int height = scanner.nextInt();
        int width = scanner.nextInt();

        scanner.nextLine();

        // create 2d array
        char[][] maze = new char[height][width];

        //fill the array with a for loop
        for (int row = 0; row < height; row++) {
            String line = scanner.nextLine();
            String[] elements = line.trim().split("\\s+");

            for (int col = 0; col < width; col++){
                maze[row][col] = elements[col].charAt(0);
            }
        }
        scanner.close();
        return maze;
    }
    
    public static int[] findStart(char[][] maze) {
        for (int row = 0; row < maze.length; row++) {
            for (int col = 0; col < maze[row].length; col++) {
                if (maze[row][col] == 'S') {
                    return new int[]{row, col};
                }
            }
        }
        return null; 
    }
    
    public static String solveMaze(char[][] maze) {
        //Make sure to update the recursive call with the correct values for the starting point
        if (maze.length == 0 || maze[0].length == 0 ) {
            return null;
        }
        //start position 
        int[] start = findStart(maze);

        // if start not found

        if (start == null){
            return null;
        }
            
        return solveMazeHelper(maze, start[0], start[1]);
    }
    //Check if the index you are at would be out of bounds
    private static String solveMazeHelper(char[][] maze, int row, int col) {
        if (row < 0 || col < 0 || row >= maze.length  || col >= maze[0].length) {
            return null;
        }
        //Next check if you are in a valid cell
        if (maze[row][col] == '-' || maze[row][col] == 'X') {
            return null;
        }
        if( maze[row][col] == 'G'){
            return "G";
        }
        //save OG character
        char original = maze[row][col];
        maze[row][col] = 'X';

        //Now attempt to solve the maze
        // this is the order UP, Right, Down, Left


        String pathUp = solveMazeHelper(maze, row - 1, col);
        if (pathUp != null) {
            return "U" + pathUp;
        
        }
        String pathRight = solveMazeHelper(maze, row, col +1);
        if (pathRight != null) {
            return "R" + pathRight;
        }
        String pathDown = solveMazeHelper(maze, row + 1, col);
        if(pathDown != null){
            return "D" + pathDown;
        }
         String pathLeft = solveMazeHelper(maze, row, col -1 );
        if (pathLeft != null) {
            return "L" + pathLeft;
        }

            maze[row][col] = original; 

        return null;
    }
}