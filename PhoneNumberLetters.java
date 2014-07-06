import java.util.*;
/* PROBLEM: Return all possible combinations of letters for a given phone number.
Don't worry about z: pretend 9 only has WXY */

public class PhoneNumberLetters {
	/* To generate all combinations, note that when a digit changes, all possible
	values for the next digit are found before changing the first digit again (if
	you're going in alphabetical order) i.e. for 23, you would have AD, then AE,
	then AF before BD, BE, BF. We simply put this in recursive form */

	public static Set<String> getWords(int[] phoneNumber) {
		Set<String> result = new HashSet<String>();
		char[] combo = new char[phoneNumber.length];
		return getWords(result, phoneNumber, 0, combo);
	}

	public static Set<String> getWords(Set<String> result, int[] phoneNumber, int digit, char[] combo) {
		if (digit == phoneNumber.length) {
			result.add(new String(combo)); //full combination
			return result;
		}

		//3 possibilities for each number (not including z)
		for (int i = 1; i <= 3; i++) {
			combo[digit] = getCharKey(phoneNumber[digit], i);
			getWords(result, phoneNumber, digit+1, combo);
			if(phoneNumber[digit] == 0 || phoneNumber[digit] == 1) return result;
		}

		return result;
	}
 
	//Helper method to get letter given # and place i.e. (2, 1) = A, (2, 2) = B
	public static char getCharKey(int telephoneKey, int place) {switch (telephoneKey) {
		case 2:
			switch (place) {
			case 1:
				return 'A';
			case 2:
				return 'B';
			case 3:
				return 'C';
			}
			break;

		case 3:
			switch (place) {
			case 1:
				return 'D';
			case 2:
				return 'E';
			case 3:
				return 'F';
			}
			break;

		case 4:
			switch (place) {
			case 1:
				return 'G';
			case 2:
				return 'H';
			case 3:
				return 'I';
			}
			break;

		case 5:
			switch (place) {
			case 1:
				return 'J';
			case 2:
				return 'K';
			case 3:
				return 'L';
			}
			break;

		case 6:
			switch (place) {
			case 1:
				return 'M';
			case 2:
				return 'N';
			case 3:
				return 'O';
			}
			break;

		case 7:
			switch (place) {
			case 1:
				return 'P';
			case 2:
				return 'R';
			case 3:
				return 'S';
			}
			break;

		case 8:
			switch (place) {
			case 1:
				return 'T';
			case 2:
				return 'U';
			case 3:
				return 'V';
			}
			break;

		case 9:
			switch (place) {
			case 1:
				return 'W';
			case 2:
				return 'X';
			case 3:
				return 'Y';
			}
			break;
		}
		return ' ';

	}

	public static void main(String[] args) {
		int[] number = {2, 3, 4};
		System.out.println(getWords(number));
	}
}