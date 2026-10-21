package com.sachin.dsa.arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 122, 22, 34, 54, 67, 78, 96, 122 };
		int target = 96;
		System.out.println(binarySearch(arr, target));

	}

	/**
	 * 
	 * @param arr    input array
	 * @param target element to be searched
	 * @return index if found else -1
	 */
	static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			// can also be written as int mid = start + (end - start) / 2; when start + end
			// exceeds range of int;
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else
			// if (arr[mid]== target) this is optional
			{
				return mid;
			}
		}

		return -1;
	}

}
