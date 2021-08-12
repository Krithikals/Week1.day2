package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "changeme";
		char[] char1 = str.toCharArray();

		for (int i = 0; i < char1.length; i++) {

			if (i % 2 != 0) {
				char1[i] = Character.toUpperCase(char1[i]);
			}

		}
		String str2 = new String(char1);
		System.out.println("Revised text post of changing oddindex to upper case of " + str + " is " + str2);

	}

}
