import java.util.*;
/* PROBLEM: Decide if two strings are anagrams. */
public class AnagramOrNot {
	/* In order for two strings to be anagrams, they must have
	the same letter set and the same frequency for each letter.
	The number of spaces/case of letters do not matter, i.e.
	"abcd" and "d Bc A" are anagrams. This uses two HashMaps to 
	store each string's letters/frequencies, then compares them. 
	Time: O(n); Limitation: while spaces are considered irrelevant,
	other non-alphabetic characters are not. So "wouldn't" and 
	"wouldnt" are not considered anagrams. */
	public static boolean isAnagram(String s, String t) {
		//Makes everything lowercase and removes spaces
		s = s.toLowerCase();
		s = s.replaceAll("\\s","");
		t = t.toLowerCase();
		t = t.replaceAll("\\s","");

		//Lengths must be equal
		if (s.length() != t.length()) return false;

		HashMap <Character, Integer> first = new HashMap<Character, Integer>();
		HashMap <Character, Integer> second = new HashMap<Character, Integer>();


		// Traverse strings simultaneously, adding characters to map
		for (int i = 0; i < s.length(); i++) {
			if (first.containsKey(s.charAt(i))) //update frequency
				first.put(s.charAt(i), (int)(first.get(s.charAt(i))) + 1);
			else //First occurrence, add to keys
				first.put(s.charAt(i), 1);

			if (second.containsKey(s.charAt(i)))
				second.put(s.charAt(i), (int)(second.get(s.charAt(i))) + 1);
			else
				second.put(s.charAt(i), 1);
		}

		// Test for character and frequency equality
		for (int i = 0; i < s.length(); i++) {
			// The character is in the first string, but not the second
			if (!second.containsKey(s.charAt(i)))
				return false;
			// The character is in both, but the frequency is different
			else if (first.get(s.charAt(i)) != second.get(s.charAt(i)))
				return false;
		}

		return true;
	}

	public static void main(String [] args) {
		System.out.println(isAnagram("mile", "lime"));
		System.out.println(isAnagram("william shakespeare", "i am a weakish speller"));
		System.out.println(isAnagram("abcdefgh", "bcdefgh"));
	}
}