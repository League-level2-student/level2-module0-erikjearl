package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] sList = {"thing 1", "thing 2","thing 3","thing 4","thing 5"};
		
		
		//2. print the third element in the array
		System.out.println(sList[2]);
		//3. set the third element to a different value
		sList[2] = "Thing Three";
		//4. print the third element again
		System.out.println(sList[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i< sList.length; i++) {
			System.out.println(sList[i]);
		}
		
		//6. make an array of 50 integers
		int[] iList = new int[50];
		
		//7. use a for loop to make every value of the integer array a random number
		Random r = new Random();
		int smallest = 999999999;
		int big =     -999999999;
		
		for (int i = 0; i< iList.length; i++) {
			iList[i] = r.nextInt(999);
			if( iList[i] < smallest) {
				smallest = iList[i];
			}
			
			if( iList[i] > big) {
				big = iList[i];
			}
			System.out.println(iList[i]);
		}
		//8. without printing the entire array, print only the smallest number in the array
		System.out.println("The smallest number is " +smallest);
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
		System.out.println("The biggest number is " + big);
	}
}
