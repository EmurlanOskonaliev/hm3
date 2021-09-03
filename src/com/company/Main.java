package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		double[] digit = {-7.4, 6.8, -5.2, -4.9, 3.7, -2.6, 1.5, -4.8, 1.7, -2.9, 3.1, 4.6, -5.1, 6.8, 7.3};
		for (int i = 0; i < digit.length; i++) {
			if (digit[i] < 0) {
				continue;
			}
			double result = 0;
			for (double d : digit) {
				result += d;
			}

			System.out.println(Arrays.deepToString(new double[][]{digit}) + " = " + "(" + result / digit.length + ")");
		}

	}
}