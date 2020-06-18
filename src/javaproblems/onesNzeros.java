package javaproblems;

import java.util.Arrays;

public class onesNzeros {

	public static void sortArray(int[] arr) {
		int zeros = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0)
			zeros++; 
		}
		for (int i = 0; i < zeros; i++) {
			arr[i] = 0;
		}
		for (int i = zeros; i < arr.length; i++) {
			arr[i] = 1;
		}
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1,0,1,0,1,0,1,0,1,0};
		sortArray(arr);
		System.out.println(Arrays.toString(arr));
	}

}
