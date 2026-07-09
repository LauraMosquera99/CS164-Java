public class Recursion {
	//Returns the Factorial of "n". Which is the result of n*n-1*n-2*...*1
	// Example: 3! == 3*2*1 == 6
	// Example: 4! == 4*3*2*1 == 24
	// Example: 0! == 1
	public static int nSum(int n) {
		if (n <= 0)
			return 0;
		else 
			return n + nSum(n - 1);
	}
	
	public static long factorial(int n) {
		if (n <= 0)
			return 1;
		else
			return n * factorial(n - 1); 
	}
	//Takes a String and returns the Reveresed String
	// Example: "Tree" returns "eerT"
	public static String reverseString(String in) {
		if (in.length() <= 1)
			return in;
		else
			return reverseString(in.substring(1)) + in.charAt(0);
		
	}
	
	//Returns the Sum of the cannonballs in a stack of height n.
	// At each level the number of cannonballs in the stack is n*n
	// Example: cannonballStack(3) == 9+4+1 == 14
	// Example: cannonballStack(0) == 0
	public static long cannonballStack(int n) {
		if (n <= 0){
			return 0;	
		}
		return (n * n) + cannonballStack(n - 1);
	}

	//Returns the result of taking the base to the given exponential power
	// An exponent of 0 always returns 1. If given a negative exponent also return a value of 1
	// Example power(2,3) == 8
	// Example power(100, 0) == 1
	public static long power(int base, int exponent) {
		if (exponent <= 0){
			return 1;
		}
		if (base == 0){
			return 0;
		}
		return base * power(base, exponent -1);
	}

	//Returns whether the given string is a Palindrome. 
	// A Palindrome is a string that when reversed is the same forwards and backwards
	// Example: isPalindrome("racecar") == true
	// Example: isPalindrome("bed") == false
	// Example: isPalindrome("") == true
	// Example: isPalindrome("a") == true
	// Example: isPalindrome("aa") == true
	public static boolean isPalindrome(String palin) {
		if(palin.length() <= 1){
			return true;
		}
		if (palin.charAt(0) != palin.charAt(palin.length()-1)) {
			return false;
		}
		return isPalindrome(palin.substring(1, palin.length()-1));
		
	}
	public static void main(String[] args) {
		System.out.println(power(2, 0));
		System.out.println(isPalindrome("matom"));
		System.out.println("nSum Tests:P");
        System.out.println(Recursion.nSum(3));   // 6
        System.out.println(Recursion.nSum(0));   // 0
		//factorial
		System.out.println(Recursion.factorial(1));  // 1
        System.out.println(Recursion.factorial(0));  // 1
		//cb test
		System.out.println(Recursion.cannonballStack(0));  // 0
        System.out.println(Recursion.cannonballStack(-3)); // 0
		//power
		System.out.println(Recursion.power(2, 3));
		//palindrome
		System.out.println(Recursion.isPalindrome("racecar")); 


	}
}