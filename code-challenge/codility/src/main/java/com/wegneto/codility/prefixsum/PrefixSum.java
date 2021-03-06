package com.wegneto.codility.prefixsum;

public class PrefixSum {

	private int[] getPrefixSum(int[] array) {
		int n = array.length;
		int[] P = new int[n + 1];

		for (int i = 1; i < P.length; i++) {
			P[i] = P[i - 1] + array[i - 1];
			System.out.print(P[i] + " ");
		}

		System.out.println(" ");

		return P;
	}

	private int countTotal(int[] P, int x, int y) {
		return P[y + 1] - P[x];
	}

	public static void main(String[] args) {
		PrefixSum prefixSum = new PrefixSum();
		int[] P = prefixSum.getPrefixSum(new int[] { 6, 7, 8, 9, 10, 11, 12 });
		System.out.println(prefixSum.countTotal(P, 0, 6));
	}

}
