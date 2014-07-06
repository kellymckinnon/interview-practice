/* PROBLEM: Calculate factorial of number */

public class Factorial {
	//Uses recursion due to nature
	public static int fact(int i) {
		if (i <= 1) return 1; //0! = 1! = 1
		else return i * fact(i-1);
	}

	public static void main(String[] args) {
		System.out.println(fact(5));
	}
}