/* Check if t is a rotation of s (i.e. "waterbottle" is a rotation
of "erbottlewat"). */
public class CheckIfRotation {

	/* Concatenate t with itself, then check if s is a substring 
	of it using contains method. The string must be the same length. */
	public static boolean isRotation(String s, String t) {
		if (s.length() != t.length()) return false;

		t = t + t;
		return t.contains(s);
	}

	public static void main (String[] args) {
		System.out.println(isRotation("erbottlewat","waterbottle"));
		System.out.println(isRotation("hello","olleh"));

	}
}