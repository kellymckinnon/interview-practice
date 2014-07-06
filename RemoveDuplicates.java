/* PROBLEM: Remove duplicate characters in a string */
public class RemoveDuplicates {
	
	/* Logic for checking for duplicates is the same as in 
	AllUniqueChars: create a boolean array, one slot for each
	character, and set to true once character found in string.
	If false, then make it true, and add it to the new string
	since it is the first occurrence. I used StringBuilder 
	so it wouldn't have to create a new copy of the string each
	time it appends a new character. */
	public static String remove(String s) {
		if (s.length() < 2) return s;

		boolean[] chars = new boolean[256];
		StringBuilder str = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			if (!chars[s.charAt(i)]) {
				chars[s.charAt(i)] = true;
				str.append(s.charAt(i));
			}
		}
		return str.toString();
	}

	public static void main(String[] args) {
		System.out.println(remove("kelly"));
		System.out.println(remove("abcdefghijk"));
	}
}