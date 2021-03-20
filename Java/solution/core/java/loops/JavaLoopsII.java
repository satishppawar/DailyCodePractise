package solution.core.java.loops;

import java.util.*;
import java.io.*;

/*
 * Problem details: https://www.hackerrank.com/challenges/java-loops/problem
 */
class JavaLoopsII{
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			int previousResult=a;
			for(int step=0;step<n;step++) {
				previousResult=computeNext(previousResult,step,b);
			}
			System.out.println();
		}
		in.close();
	}

	private static int computeNext(int previousResult, int step, int b) {
		previousResult=(int) (previousResult+Math.pow(2, step)*b);
		System.out.print(previousResult);
		System.out.print(" ");
		return previousResult;
	}

}