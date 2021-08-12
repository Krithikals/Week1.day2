package week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 0, 14, 9, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

		int length = arr.length;
		//System.out.println("Length of the array is " + length);
		

		for (int i = 0; i < length-1; i++) {
			
			int count = 0;
			
			for (int j = i+1; j < length-1; j++) 
			{
				if (arr[j] == arr[i]) 
				{
					count++;
			    }
			}	
			
			if (count > 0) {
					System.out.println("Duplicate number is " + arr[i]);
				}
			}

		}

	}


