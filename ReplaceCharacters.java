public class ReplaceCharacters {
	public static String replaceChar(String s, char toReplace, String replacement) {
		if (s == null)
			throw new IllegalArgumentException("String cannot be null.");

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < s.length(); i ++) {
			if (s.charAt(i) == toReplace)
				result.append(replacement);
			else
				result.append(s.charAt(i));
		}

		return result.toString();
	}

	public static void main(String[] args) {
		System.out.println(replaceChar("I am a llama.", ' ', "%20"));
		System.out.println(replaceChar(null, ' ', "%20"));
	}
}