package week1.day2;

public class ReverseEvenWords2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";

		String[] splitAry = test.split(" ");
		for (int i = 0; i < splitAry.length; i++) {
			if (i % 2 != 0) {
				char[] charAry = splitAry[i].toCharArray();
				int charlength = splitAry[i].length();
				int c = charlength - 1;
				char charAry2[] = new char[charlength];
				int k = 0;
				for (int j = c; j >= 0; j--) {
					charAry2[k] = charAry[j];
					k++;
				}
				//String str = new String(charAry2);
				String str= String.valueOf(charAry2);
				splitAry[i] = str;
			}
		}
		for (int l = 0; l < splitAry.length; l++) {
			System.out.print(splitAry[l] + " ");

		}

	}

}
