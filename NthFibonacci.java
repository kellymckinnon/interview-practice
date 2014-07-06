/* PROBLEM: Generate the nth Fibonacci number. */

public class NthFibonacci {

	/* The 0th and 1st Fibonacci numbers are 0 and 1, 
	respectively, so n can just be returned. For greater
	numbers, we just use recursion to add the previous two
	numbers, per the Fibonacci algorithm. */
	public static int getFib(int n) {
		if (n < 0)
			throw new IllegalArgumentException("n must be positive");

		if (n < 2) return n; 
		else return getFib(n-1) + getFib(n-2);
	}

	public static void main(String[] args) {
		System.out.println(getFib(8));
		System.out.println(getFib(2));
		System.out.println(getFib(1));
	}
}