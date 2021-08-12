package week1.day2;

public class FindTypes {

	/*
	 * i) Character.isLetter ii) Character.isDigit iii)Character.isSpaceChar iv)
	 * else -> consider as special character
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 22nd Class of Automation $$";

		int letter = 0, space = 0, num = 0, specialChar = 0;
		char[] char1 = test.toCharArray();
	

		for (int i = 0; i < char1.length; i++) {

			if (Character.isLetter(char1[i])) {
				letter = letter + 1;
			}
			else if (Character.isDigit(char1[i])) {
				num = num + 1;
			}
			else if (Character.isSpaceChar(char1[i])) {
				space = space + 1;
			}
			else {
				specialChar = specialChar + 1;
			}

		}
		System.out.println("Letter :" + letter);
		System.out.println("Digit :" + num);
		System.out.println("Space :" + space);
		System.out.println("Special Character :" + specialChar);
	}

}
