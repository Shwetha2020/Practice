package javaproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MergeArrays {

	int[] array1 = { 12, 23, 34, 45 };
	int[] array2 = { 56, 67, 78, 89 };

	static MergeArrays mergeArrays = new MergeArrays();

	public static void main(String[] args) {
		// mergeArrays.inbuildMerge();
		mergeArrays.sortArrayWithoutInbuilt();
	//	mergeArrays.sortArrayWitout3rdVariable();

	}
	//quick sort
	// Time complexity = O(n+m) ??
	public void sortArrayWithoutInbuilt() {
		int array3[] = new int[array1.length + array2.length];
		int i;
		for (i = 0; i < array1.length; i++) {
			array3[i] = array1[i];
		}
		i = 0;
		for (int j = array1.length; j < array3.length; j++) {
			array3[j] = array2[i];
			i++;
		}
		for (i = 0; i < array3.length; i++) {
			System.out.println(array3[i]);
		}

	}
	// you cannot merge 2 arrays without temperory variable if it has same length

	/*
	 * Input: ar1[] = {1, 5, 9, 10, 15, 20}; ar2[] = {2, 3, 8, 13}; Output: ar1[] =
	 * {1, 2, 3, 5, 8, 9} ar2[] = {10, 13, 15, 20}
	 */

	int ar1[] = { 1, 5, 9, 10, 15, 20 };
	int ar2[] = { 2, 3, 8, 13 };

	// 1,2,9

	/*public void sortArrayWitout3rdVariable() {

		for (int i = 0; i < ar1.length; i++) {
			for (int j = 0; j < ar2.length; j++) {
				if (ar2[j] < ar1[i]) {
					int temp = ar1[i];
					ar1[i] = ar2[j];
					// ar2[j] = temp;

					for (int k = ar2.length-1; k >= 0; k--) {
						if (temp < ar2[k]) {
							int temp1 = temp;
							ar2[k] = ar2[k - 1];
							ar2[k - 1] = temp1;
							break;
						}
					}

				}
				break;
			}
		}
		for (int j = 0; j < ar1.length; j++) {
			System.out.println("ar1 :" + ar1[j]);
		}
		for (int j = 0; j < ar2.length; j++) {
			System.out.println("ar2 :" + ar2[j]);
		}
	}
*/
	/*
	 * public void inbuildMerge() { HashMap<Integer,Integer> map1 = new
	 * HashMap<Integer,Integer>(); for (int i = 0; i < array1.length; i++) {
	 * map1.put(i, array1[i]); } HashMap<Integer,Integer> map2 = new
	 * HashMap<Integer,Integer>(); int j=0; for (int i = array1.length; i <
	 * array2.length; i++) { map2.put(i, array2[j]); j++; }
	 * 
	 * //map2.putAll(map1); System.out.println(map1.entrySet());
	 * System.out.println(map2.entrySet());
	 * 
	 * List list = new ArrayList(); list.add("abc"); list.add(2);
	 * System.out.println(list.get(0) instanceof Object);
	 * System.out.println(list.get(1) instanceof Integer); }
	 */

}
