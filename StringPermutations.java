import java.util.*;

/* PROBLEM: Return all possible orderings of characters in a string.
The characters should be considered distinct, such that there are 
six permutations of "aaa". */

public class StringPermutations {
	/* A recursive approach is used. Permutations can be found by inserting
	a character into all places in the string without that character. For
	example, if you have the string "abc", permutations can be found by going:
	a -> ab, ba -> cab, acb, abc, cba, bca, bac 
	Runtime: O(n!), since there are n! permutations
	*/
	public static Set<String> getPerms(String s) {
		Set<String> perms = new HashSet<String>();
		if (s == null) return null;
		else if (s.length() == 0) { 
			perms.add(s); 
			return perms;
		}

		char first = s.charAt(0);
		String remainder = s.substring(1);
		Set<String> oldPerms = getPerms(remainder);

		for(String str : oldPerms) {
			for (int i = 0; i <= str.length(); i++) {
				perms.add(str.substring(0, i) + first + 
					str.substring(i));
			}
		}

		return perms;

	}

	public static void main(String[] args) {
		System.out.println(getPerms("abcdefg"));
	}

}