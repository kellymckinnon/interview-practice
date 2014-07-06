/* PROBLEM: Implement an algorithm to determine if a string has
all unique characters. */

public class AllUniqueChars {

	/* Time and space complexity = O(n). If we wanted
	to take up no space, we could use a nested for loop
	to check every letter with every other letter. This
	would take O(n^2) time, but no space. */
	public static boolean hasUniqueChars (String s) {
		boolean [] chars = new boolean[256];
		char end = str;

		if (s.length() < 2) return true;
		//Assumes ASCII. Else, size must be > 256

		for (int i = 0; i < s.length(); i++) {
			//Boolean has already been set (repeat)
			if (chars[s.charAt(i)]) return false;
			//Add to list of characters in string
			else chars[s.charAt(i)] = true;
		}

		return true;
	}

	// Test harness
	public static void main (String [] args) {
		System.out.println(hasUniqueChars("Kelly"));
		System.out.println(hasUniqueChars("acbnghjek"));
	}
}