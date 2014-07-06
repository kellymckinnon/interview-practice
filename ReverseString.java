/* PROBLEM: Reverse a string in place. */

public class ReverseString {
	
	/* The easiest option is just to create a new string,
	then start from the end and add letters to the new string one at a 
	time. However, this takes O(n) space and thus is not in place. 
	Instead we could convert the string to char array, then swap the last 
	with first, second to last with second, etc. but this still takes O(n)
	space UNLESS we make the char array the parameter. */
	public static char[] reverse(char[] string) {
		for (int i = 0; i < string.length/2; i++) {
			char c = string[i];
			string[i] = string[string.length-1-i];
			string[string.length-1-i] = c;
		}
		return string;
	}

	public static void main(String[] args) {
		System.out.println(reverse("hello".toCharArray()));
	}
}