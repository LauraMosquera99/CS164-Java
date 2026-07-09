
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVParser {
	private static Shape parseLine(String line) {
		Shape out = null;
		try {
			String[] parts = line.split(",");

			String shapeName = parts[0].trim().toLowerCase();
			try {
				switch (shapeName) {
					case "Rectangle": {
						double width = Double.parseDouble(parts[1]);
                		double height = Double.parseDouble(parts[2]);
                		return new Rectangle(width, height);
					}
						
					case "Box":{
						double width = Double.parseDouble(parts[1]);
                		double height = Double.parseDouble(parts[2]);
                		double depth = Double.parseDouble(parts[3]);
                		return new Box(width, height, depth);
					}
					case "Sphere": {
						double radius = Double.parseDouble(parts[1]);
                		return new Sphere(radius);
					}
					default:
						System.out.println("Invalid Shape");
						return null;
				}
			} catch (Exception e) {
				return null;
				//e.printStackTrace();
			}
		} finally {
		}
	
	}
	public static ArrayList<Shape> parseFile(String filename) {
		// Open the Given file
		ArrayList<Shape> shapes = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			String line;
			while ((line = br.readLine()) != null) {
				if (line.trim().isEmpty()){
					continue;
				}
				
				Shape shape = parseLine(line);
				if (shape != null) {
					shapes.add(shape);

				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// The file is a CSV in the following format
		// Shape Name, Radius/Height, Width, Depth
		// Create a new instance appropriate to each Shape
		return shapes;
	}
}
