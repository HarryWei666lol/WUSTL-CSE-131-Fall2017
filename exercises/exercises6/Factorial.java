package exercises6;

public class Factorial {
	public static int factorial(int n) {
		if (n <= 0) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
	}

}
