package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "MadaM";
		char char1[] = str.toCharArray();
		int c = char1.length - 1;
		char char2[] = new char[char1.length];
		int j = 0;

		for (int i = c; i >= 0; i--) {

			char2[j] = char1[i];
			// System.out.println(char2[j]);
			j++;
		}

		// String str1 = new String(char2); -- Can use either of these methods.
		String str1 = String.valueOf(char2);

		if (str1.equals(str)) {
			System.out.println(str + " --- Word is palindrome");
		} else
			System.out.println(str + "--- Word is not palindrome");

	}
}
