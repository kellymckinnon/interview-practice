import java.util.*;
/* PROBLEM: Return all possible combinations of the characters in 
a string. Note that "21" = "12"; they should not both be returned. */

public class StringCombinations {
	/* Start at the first letter and add it to the set. If it's
	not the last letter, move to the next and generate remaining
	combinations with adding the new letter to the previous
	combinations and making new combinations starting with the
	new letter */
	public static Set<String> getCombos(String s) {
		Set<String> combos = new HashSet<String>();
		int length = s.length();
		char[] input = s.toCharArray();
		StringBuilder output = new StringBuilder();

		return combine(combos, input, output, s.length(), 0, 0);
	}

	public static Set<String> combine(Set<String> combos, char[] input, StringBuilder output, int length,
		int level, int start){
		for (int i = start; i < length; i++) {
			output.append(input[i]);
			combos.add(output.toString());

			if(i < length - 1) {
				combine(combos, input, output, length, level+1, i+1);
			}

			output.setLength(output.length()-1);
		}
		return combos;
	}

	public static void main(String[] args) {
		System.out.println(getCombos("abcd"));
	}
}