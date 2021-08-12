package week1.day2;

import java.util.Arrays;

public class Anagram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String text1 = "stops";
				String text2 = "potss";
				int count = 0;

				if (text1.length() == text2.length()) 
				{
					char[] char1 = text1.toCharArray();
					char[] char2 = text2.toCharArray();
					Arrays.sort(char1);
					Arrays.sort(char2);
					for (int i = 0; i < char1.length; i++) 
					{
						if (char1[i] != char2[i]) 
						{
							break;
						}
						count++;
				     }
					if(count==text1.length())
					{
					System.out.println(text1 + " & " + text2 + " are anagram");
					}
					else System.out.println(text1 + " & " + text2 + " are NOT anagram");
				}
				else
					System.out.println(text1 + " & " + text2 + " are NOT anagram as length differs");
					
				}
			}

	
