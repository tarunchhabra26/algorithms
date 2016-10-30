package csc505;

import java.util.Arrays;

public class LNS {
	public static void main(String args[]) {
		int a[] = { 3, 45, 23, 9, 3, 99, 108, 76, 12, 77, 16, 18, 4 };
		int len[] = new int[a.length];
		int sortarr[] = new int[a.length];
		int seq[][] = new int[a.length][a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++)
				seq[i][j] = -1;
		}
		len[0] = 1;
		seq[0][0] = a[0];
		for (int i = 1; i < a.length; i++) {
			int k = 0;
			int max = Integer.MIN_VALUE;
			int m = 0;
			for (int j = 0; j < i; j++) {
				if (a[j] <= a[i]) {
					seq[i][m] = a[j];
					m++;
				}
				if (a[j] > max && a[j] <= a[i]) {
					max = a[j];
					k = j;
				}
			}
			for (int j = k + 1; j <= i; j++)
				if (a[j] <= a[i])
					len[i]++;
			seq[i][m] = a[i];
			if (max != Integer.MIN_VALUE)
				len[i] = len[i] + len[k];
		}
		System.out.println(Arrays.toString(len));
		for (int i = 0; i < a.length; i++) {
			for (int m = 0; m < a.length; m++)
				sortarr[m] = -1;
			for (int j = 0; j < a.length; j++) {
				if (seq[i][j] != -1)
					System.out.print(seq[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
