package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = { 3, 2, 11, 4, 6, 7 };
		Arrays.sort(data);
		int c = data.length - 2;
		//int d = data.length - 1;

		System.out.println("The second larget number is " + data[c]);
		//System.out.println("The first larget number is " + data[d]);

	}

}
