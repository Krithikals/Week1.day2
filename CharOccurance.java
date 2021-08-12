package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		int a=0;
		char[] char1 = str.toCharArray();
		int c=char1.length;
		for (int i = 0; i < c; i++) {
			
			if(char1[i]=='e')
			{
			a= a + 1;
			}
			
		}
		System.out.println("Number of occurences of ' e ' is in sentence" + " ' " + str +" ' "+ " is " + a);
		
	}

}
