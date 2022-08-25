package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] stringArr = new String[5];
		//2. print the third element in the array
		System.out.println(stringArr[3]);
		//3. set the third element to a different value
		stringArr[3] = "AAUAHIUGAIUYAGI";
		//4. print the third element again
		System.out.println(stringArr[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i< stringArr.length; i++) {
			System.out.println(stringArr[i]);
		}
		
		//6. make an array of 50 integers
		int[] intArr = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random r = new Random();
		int e;
		for (int i = 0; i < intArr.length; i++) {
			e = r.nextInt(100);
			intArr[i] = e;
		}
		//8. without printing the entire array, print only the smallest number in the array
		System.out.println(intArr[]);
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}
