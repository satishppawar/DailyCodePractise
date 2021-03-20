package solution.core.java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Problem :
 * https://www.hackerrank.com/challenges/java-static-initializer-block/problem
 */
public class StaticDemo {
	static int H;
	static int B;
	static boolean flag = true;
	static {
		Scanner scanner = new Scanner(System.in);
		B = scanner.nextInt();
		H = scanner.nextInt();
		if (B <= 0 || H <= 0) {
			flag = false;
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}// end of main

}// end of class
