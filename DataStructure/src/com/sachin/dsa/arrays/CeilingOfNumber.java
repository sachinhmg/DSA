package com.sachin.dsa.arrays;

public class CeilingOfNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 9, 14, 18, 25, 36, 45, 54, 58, 62, 67, 77 };
//		int[] arr = {5};
		int num = 7;
//		int num = 8;
		int ceiling = ceiling(arr, num);
		System.out.println(ceiling);

		int ceiling1 = ceiling1(arr, num);
		System.out.println(ceiling1);
	}

	static int ceiling(int[] arr, int num) {
		if (arr.length < 1) {
			return -1;
		}
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (num == arr[mid]) {
				return arr[mid];
			}
			if (num > arr[mid]) {
				start = mid + 1;
			} else if ((mid - 1) > -1 && num > arr[mid - 1]) {
				return arr[mid];
			} else {
				end = mid - 1;
			}

		}

		return num < arr[0] ? arr[0] : -1;
	}

	static int ceiling1(int[] arr, int num) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (num == arr[mid]) {
				return arr[mid];
			}

			if (num > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return start < arr.length ? arr[start] : -1;
	}

}
