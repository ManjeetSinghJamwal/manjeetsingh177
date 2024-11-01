package java_practice.one;

import java.util.Arrays;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 3, 3, 4, 4, 5, 6, 6, 7 };
		int len = arr.length;
		int tem[] = new int[arr.length];
		int p = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = -1;
				}
			}
			if (arr[i] != -1) {
				tem[p] = arr[i];
				p++;
			}
		}
		int r[] = new int[p];
		for (int i = 0; i < r.length; i++) {
			r[i] = tem[i];
		}
		System.out.println(Arrays.toString(r));
	}

}
