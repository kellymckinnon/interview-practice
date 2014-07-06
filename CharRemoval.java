/* PROBLEM: Remove given characters from string. */

public class CharRemoval {
	/* We have lots of options for doing this, but it's best to use
	a character array and manipulate it. If we remove characters in 
	place right away, we will be left with many gaps and lots of moving
	necessary. Instead, we scan for characters to be removed, then loop
	through, copying characters only if they aren't flagged */
	public static String removeChars(String s, String remove) {
		char[] str = s.toCharArray();
		char[] r = remove.toCharArray();
		boolean[] delete = new bool[128]; //Basic ASCII assumed
		int dest = 0;
		int src = 0;

		for (src = 0; src < s.length(); src++) {
			delete[r[src]] = true;
		} 

		src = 0;

		while (src < s.length()) {
			if (!delete[(int)s[src]]) {
				s[dest++] = s[src];
			}
			++src;
		}

		return new String(s, 0, dest);
	}
}