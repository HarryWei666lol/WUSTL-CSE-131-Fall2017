package exercises5;

public class StringMethods {
	
	
	//
	// Below are the methods defined for this exercise
	//   The names are not prescribed in the assignment, so choose
	//   names you like (that are meaningful)
	//
	
	//
	// First one is completed for you:
	//
	/**
	 * Returns a string concatenated with itself
	 * @param in the input string
	 * @return the concatenation of in and in
	 */
	public static String dup(String in) {
		//return in + in;
		//reduce this to a call to copies
		return copies(in,2);
	}

	
	/**
	 * Return n copies of s
	 * @param s the input string
	 * @param n the number of copies
	 * @return n copies of s
	 */
	public static String copies(String s, int n) {
//		String ans = "";
//		for (int i = 0; i < n; ++i) {
//			ans = ans +s;
//		}
//		return ans;
		String[] array = new String[n];
		for( int i=0; i < n; ++i) {
			array[i]=s;
		}
		// each index of array has a copy of s
		return join(array, " ");
	}
	
//	public static void main (String[]args) {
//		System.out.println(copies("hi", 3));
//	}
	
	public static String join(String[] array, String joiner) {
		// special case, array is of 0 length
		if (array.length == 0) {
			return "";
		}
		String ans = array[0];
		for(int i = 1; i < array.length; i++) {
			ans = ans + joiner + array[i];
		}
		return ans;
	}
	public static void main(String[]args) {
		System.out.println(dup("hello"));
		for ( int i = 0; i < 5; ++i) {
			System.out.println(copies("comp sci", i));
		}
		String s = "I like computer sicence!";
		String [] words = s.split(" ");
		for (String w : words) {
			System.out.println("A word: " + w );
		}
		System.out.println("Back together: " + join(words, "<<>>"));
	}
	

//	public static String selfConcat(String s) {
//		return s + s;
//	}
//	
//	public static void main(String[] args) {
//		
//		//
//		// Testing the methods
//		//
//		System.out.println(selfConcat("echo"));
//	}

}
