package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr1[]= {3,2,11,4,6,7};
     int arr2[]= {1,12,8,14,9,7};
     
     for (int i = 0; i < arr1.length; i++) {
    	 
    	 for (int j = 0; j < arr2.length; j++) {
    		 
    		 if(arr1[i]==arr2[j]) {
    			 System.out.println("Macthing number is "+arr2[j]);
    			 break;
    		 }
			
		}
		
	}
	}

}
