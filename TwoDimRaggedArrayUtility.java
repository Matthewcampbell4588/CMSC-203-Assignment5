/*
 * Class: CMSC203 
 * Instructor:Khandan Monshi
 * Description: (Give a brief description for each Class)
 * Due: 4/27/2023
 * Platform/compiler:
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Matthew Campbell
*/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class TwoDimRaggedArrayUtility {
	
	public static double getAverage(double[][] a) {
		
		int count = 0;
		double total = 0;
		for (int i = 0; i < a.length; i++) {
			for (int c = 0; c < a[i].length; c++) {
				total += a[i][c];
				count++;
			}
		}
		return total / count;
	}

	public static double getColumnTotal(double[][] a, int c) {
		double total = 0;

		
		for (int i = 0; i < a.length; i++) {
			// Checks
			if (a[i].length <= c || c < 0) { continue; }

			
			total += a[i][a[i].length == 1 && c == 1 ? c-1 : c];
		}
		return total;
	}
	public static double getHighestInArray(double[][] a) {

		double highest = 0;

	
		for (int i = 0; i < a.length; i++) {
			for (int c = 0; c < a[i].length; c++) {
			
				double value = a[i][c];

				if (value > highest) { highest = value; }
			}
		}

		return highest;
	}

	
	public static double getHighestInColumn(double[][] a, int c) {
		
		double highest = 0;

	
		for (int i = 0; i < a.length; i++) {
			// Checks
			if (a[i].length <= c || c < 0) { continue; }
			if (a[i][c] > highest) { highest = a[i][c]; }
		}

		return highest;
	}

	public static int getHighestInColumnIndex(double[][] a, int c) {
		// Variables
		double highest = 0;
		int index = 0;

		// Loops (Row => Column[c]) {
		for (int i = 0; i < a.length; i++) {
			// Checks
			if (a[i].length <= c || c < 0) { continue; }
			if (a[i][c] > highest) {
				highest = a[i][c];
				index = i;
			}
		}
		return index;
	}
	public static double getHighestInRow(double[][] a, int r) {
		// Checks
		if (a.length < r || r < 0) { return 0; }
		double highest = 0;

	
		for (int i = 0; i < a[r].length; i++) {
		
			if (a[r][i] > highest) { highest = a[r][i]; }
		}


		return highest;
	}

	
	public static int getHighestInRowIndex(double[][] a, int r) {
	
		if (a.length < r || r < 0) { return 0; }

		
		double highest = 0;
		int index = 0;

		
		for (int i = 0; i < a[r].length; i++) {
		
			if (a[r][i] > highest) {
				highest = a[r][i];
				index = i;
			}
		}

		return index;
	}


	public static double getLowestInArray(double[][] a) {

		double lowest = 0;

		for (int i = 0; i < a.length; i++) {
			for (int c = 0; c < a[i].length; c++) {
				if (lowest == 0 || a[i][c] < lowest) { 
					lowest = a[i][c]; 
					}
			}
		}

		
		return lowest;
	}


	public static double getLowestInColumn(double[][] a, int c) {
		double lowest = 0;

		for (int r = 0; r < a.length; r++) {
			if (a[r].length <= c || c < 0) { continue; }
			if (lowest == 0 || a[r][c] < lowest) {
				lowest = a[r][c]; 
				}
		}

		return lowest;
	}

	public static int getLowestInColumnIndex(double[][] a, int c) {
	
		double lowest = 0;
		int index = 0;
		for (int r = 0; r < a.length; r++) {
			// Checks
			if (a[r].length <= c || c < 0) { continue; }
			if (lowest == 0 || a[r][c] < lowest) {
				lowest = a[r][c];
				index = r;
			}
		}

		return index;
	}
	public static double getLowestInRow(double[][] a, int r) {
		// Checks
		if (a.length < r || r < 0) { return 0; }

		// Variables
		double lowest = 0;

		// Loops
		for (int i = 0; i < a[r].length; i++) {
			if (lowest == 0 || a[r][i] < lowest) { 
				lowest = a[r][i]; 
				}
		}

		// Return
		return lowest;
	}
	public static int getLowestInRowIndex(double[][] a, int r) {
		// Checks
		if (a.length < r || r < 0) { return 0; }
		double lowest = 0;
		int index = 0;
		for (int i = 0; i < a[r].length; i++) {
			if (lowest == 0 || a[r][i] < lowest) {
				lowest = a[r][i];
				index = i;
			}
		}
		return index;
	}
	public static double getRowTotal(double[][] a, int r) {
		double total = 0;
		for (int i = 0; i < a[r].length; i++) {
			total += a[r][i];
		}
		return total;
	}
	public static double getTotal(double[][] a) {
	
		double total = 0;

		for (int i= 0; i < a.length; i++) {
			for (int k = 0; k < a[i].length; k++) {
				total += a[i][k];
			}
		}

		
		return total;
	}

	public	static double[][] readFile(File f) throws FileNotFoundException {
		double a[][] = null;
		Scanner scanner1, scanner2;
		int rows = 0;
		int currentRow = 0;
		scanner1 = new Scanner(f);

		while (scanner1.hasNextLine()) { 
			rows++; scanner1.nextLine();
		}
		scanner1.close();
		a = new double[rows][];
		scanner2 = new Scanner(f);
		while (scanner2.hasNextLine()) {
	
			String line = scanner2.nextLine();
			String columns[] = line.trim().split(" ");
			a[currentRow] = new double[columns.length];

			for (int i = 0; i < columns.length; i++) {
				a[currentRow][i] = Double.parseDouble(columns[i]);
			}
			currentRow++;
		}
		scanner2.close();

		return a;
	}

	public static void writeToFile(double[][] a, File f) throws IOException {

		FileWriter file = new FileWriter(f);
		for (int i = 0; i < a.length; i++) {
			for (int c = 0; c < a[i].length; c++) {
				file.write(a[i][c] + " ");
			}
			file.write("\n");
		}

		file.close();
	}

	
}