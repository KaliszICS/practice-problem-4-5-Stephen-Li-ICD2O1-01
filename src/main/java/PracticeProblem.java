/*
File: Lesson 4.5 - Counters, Accumulators and Nesting
Author: Stephen Li
Date Created: April 14, 2026
Date Last Modified: April 14Z, 2026
*/

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String triangle(int num1) {
		String triangle = "";
		for (int i = 0; i < num1; i++) {
			for (int j = 0; j <= i; j++) {
				triangle += "*";
			}
			triangle += "\n";
		}
		return triangle;
	}
	 
	public static String pyramid(int num1) {
		String pyramid = "";
		for (int i = 0; i < num1; i++) {
			for (int j = 0; j < num1 - i - 1; j++) {
				pyramid += " ";
			}
			for (int j = 0; j <= i; j++) {
				pyramid += "*";
				if (j < i) {
					pyramid += " ";
				}
			}
			pyramid += "\n";
		}
		return pyramid;
	}

	public static String multiplicationTable(int num1) {
		String table = "";
		String row = "";
		for (int i = 1; i <= num1; i++) {
			for (int j = 1; j <= num1; j++) {
				row += i * j;
				if (j != num1) {
					row += " ";
				}
			}
			table += row + "\n";
			row = "";
		}
		return table;
	}
}
