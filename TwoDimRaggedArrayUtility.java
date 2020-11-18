/*
 * PROGRAMMER: ALAN DUONG
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class TwoDimRaggedArrayUtility.
 */
public class TwoDimRaggedArrayUtility {
	
	/**
	 * Instantiates a new two dim ragged array utility.
	 */
	public TwoDimRaggedArrayUtility() {
		
	}
	
	/**
	 * Read file.
	 *
	 * @param files the files
	 * @return the double[][]
	 * @throws FileNotFoundException the file not found exception
	 */
	public static double[][] readFile(File file) throws FileNotFoundException {
		String[][] input = new String[10][10];
		Scanner files = new Scanner(file);
		int row = 0, column = 0;
		while (files.hasNextLine()) {
			String[] currentRow = files.nextLine().split(" ");
			for (column = 0; column < currentRow.length; column++) {
				input[row][column] = currentRow[column];
			}
			row++;
		}
		files.close();
		double[][] sales = new double[row][];
		for (row = 0; row < sales.length; row++) {
			for (column = 0; input[row][column] != null; column++) {	
			}			
			sales[row] = new double[column];
			for (column = 0; column < sales[row].length; column++) {
				sales[row][column] = Double.parseDouble(input[row][column]);
			}
		}
		return sales;
	}
	
	/**
	 * Write to file.
	 *
	 * @param data the data
	 * @param outputFile the output file
	 * @throws FileNotFoundException the file not found exception
	 */
	public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException {
		PrintWriter file = new PrintWriter(outputFile);
		for (int row = 0; row < data.length; row++) {
			for (int column = 0; column < data[row].length; column++) {
				file.print((column != 0) ? " " + data[row][column] : data[row][column]);
			}
			file.println();
		}
		file.close();
	}
	
	/**
	 * Gets the total.
	 *
	 * @param data the data
	 * @return the total
	 */
	public static double getTotal(double[][] data) {
		double total = 0;
		for (int row = 0; row < data.length; row++) {
			for (int column = 0; column < data[row].length; column++) {
				total += data[row][column];
			}
		}
		return total;
	}
	
	/**
	 * Gets the average.
	 *
	 * @param data the data
	 * @return the average
	 */
	public static double getAverage(double[][] data) {
		int count = 0;
		double total = 0;
		for (int row = 0; row < data.length; row++) {
			for (int column = 0; column < data[row].length; column++) {
				total += data[row][column];
				count++;
			}
		}
		return total/count;
	}
	
	/**
	 * Gets the row total.
	 *
	 * @param data the data
	 * @param row the row
	 * @return the row total
	 */
	public static double getRowTotal(double[][] data, int row) {
		double rowTotal = 0;
		for (int column = 0; column < data[row].length; column++) {
			rowTotal += data[row][column];
		}
		return rowTotal;
	}
	
	/**
	 * Gets the column total.
	 *
	 * @param data the data
	 * @param col the col
	 * @return the column total
	 */
	public static double getColumnTotal(double[][] data, int col) {
		double columnTotal = 0;
		for (int row = 0; row < data.length; row++) {
			if (col < data[row].length) {
				columnTotal += data[row][col];
			}
		}
		return columnTotal;
	}
	
	/**
	 * Gets the highest in row.
	 *
	 * @param data the data
	 * @param row the row
	 * @return the highest in row
	 */
	public static double getHighestInRow(double[][] data, int row) {
		int columnChecker = 0;
		double highest = data[0][0];
		while (columnChecker < data.length) {
			if (columnChecker < data[row].length) {
				highest = data[row][columnChecker];
				break;
			} else {
				columnChecker++;
			}
		}
		for (int column = 0; column < data[row].length; column++) {
			if (data[row][column] > highest) {
				highest = data[row][column];
			}
		}
		return highest;
	}
	
	/**
	 * Gets the highest in row index.
	 *
	 * @param data the data
	 * @param row the row
	 * @return the highest in row index
	 */
	public static int getHighestInRowIndex(double[][] data, int row) {
		int highest = 0;
		int columnChecker = 0;
		double highestInRow = data[0][0];
		while (columnChecker < data.length) {
			if (columnChecker < data[row].length) {
				highestInRow = data[row][columnChecker];
				break;
			} else {
				columnChecker++;
			}
		}
		for (int column = 0; column < data[row].length; column++) {
			if (data[row][column] > highestInRow) {
				highestInRow = data[row][column];
				highest = column;
			}
		}
		return highest;
	}
	
	/**
	 * Gets the lowest in row.
	 *
	 * @param data the data
	 * @param row the row
	 * @return the lowest in row
	 */
	public static double getLowestInRow(double[][] data, int row) {
		int columnChecker = 0;
		double lowest = data[0][0];
		while (columnChecker < data.length) {
			if (columnChecker < data[row].length) {
				lowest = data[row][columnChecker];
				break;
			} else {
				columnChecker++;
			}
		}
		for (int column = 0; column < data[row].length; column++) {
			if (data[row][column] < lowest) {
				lowest = data[row][column];
			}
		}
		return lowest;
	}
	
	/**
	 * Gets the lowest in row index.
	 *
	 * @param data the data
	 * @param row the row
	 * @return the lowest in row index
	 */
	public static int getLowestInRowIndex(double[][] data, int row) {
		int lowest = 0;
		int columnChecker = 0;
		double lowestInRow = data[0][0];
		while (columnChecker < data.length) {
			if (columnChecker < data[row].length) {
				lowestInRow = data[row][columnChecker];
				break;
			} else {
				columnChecker++;
			}
		}
		for (int column = 0; column < data[row].length; column++) {
			if (data[row][column] < lowestInRow) {
				lowestInRow = data[row][column];
				lowest = column;
			}
		}
		return lowest;
	}
	
	/**
	 * Gets the highest in column.
	 *
	 * @param data the data
	 * @param col the col
	 * @return the highest in column
	 */
	public static double getHighestInColumn(double[][] data, int col) {
		int rowChecker = 0;
		double highest = data[0][0];
		while (rowChecker < data.length) {
			if (col < data[rowChecker].length) {
				highest = data[rowChecker][col];
				break;
			} else {
				rowChecker++;
			}
		}
		for (int row = 0; row < data.length; row++) {
			if (col < data[row].length)  {
				if (data[row][col] > highest) {
					highest = data[row][col];
				}
			}
		}
		return highest;
	}
	
	/**
	 * Gets the highest in column index.
	 *
	 * @param data the data
	 * @param col the col
	 * @return the highest in column index
	 */
	public static int getHighestInColumnIndex(double[][] data, int col) {
		int highest = 0;
		int rowChecker = 0;
		double highestInColumn = data[0][0];
		while (rowChecker < data.length) {
			if (col < data[rowChecker].length) {
				highestInColumn = data[rowChecker][col];
				break;
			} else {
				rowChecker++;
			}
		}
		for (int row = 0; row < data.length; row++) {
			if (col < data[row].length) {
				if (data[row][col] > highestInColumn) {
					highestInColumn = data[row][col];
					highest = row;
				}
			}

		}
		return highest;
	}
	
	/**
	 * Gets the lowest in column.
	 *
	 * @param data the data
	 * @param col the col
	 * @return the lowest in column
	 */
	public static double getLowestInColumn(double[][] data, int col) {
		int rowChecker = 0;
		double lowest = data[0][0];
		while (rowChecker < data.length) {
			if (col < data[rowChecker].length) {
				lowest = data[rowChecker][col];
				break;
			} else {
				rowChecker++;
			}
		}
		for (int row = 0; row < data.length; row++) {
			if (col < data[row].length) {
				if (data[row][col] < lowest) {
					lowest = data[row][col];
				}
			}
		}
		return lowest;
	}
	
	/**
	 * Gets the lowest in column index.
	 *
	 * @param data the data
	 * @param col the col
	 * @return the lowest in column index
	 */
	public static int getLowestInColumnIndex(double[][] data, int col) {
		int lowest = 0;
		int rowChecker = 0;
		double lowestInColumn = data[0][0];
		while (rowChecker < data.length) {
			if (col < data[rowChecker].length) {
				lowestInColumn = data[rowChecker][col];
				break;
			} else {
				rowChecker++;
			}
		}
		for (int row = 0; row < data.length; row++) {
			if (col < data[row].length) {
				if (data[row][col] < lowestInColumn) {
					lowestInColumn = data[row][col];
					lowest = row;
				}
			}
		}
		return lowest;
	}
	
	/**
	 * Gets the highest in array.
	 *
	 * @param data the data
	 * @return the highest in array
	 */
	public static double getHighestInArray(double[][] data) {
		double highest = data[0][0];
		for (int row = 0; row < data.length; row++) {
			for (int column = 0; column < data[row].length; column++) {
				if (data[row][column] > highest) {
					highest = data[row][column];
				}			
			}
		}
		return highest;
	}
	
	/**
	 * Gets the lowest in array.
	 *
	 * @param data the data
	 * @return the lowest in array
	 */
	public static double getLowestInArray(double[][] data) {
		double lowest = data[0][0];
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				if (data[row][col] < lowest) {
					lowest = data[row][col];
				}			
			}
		}
		return lowest;
	}
}
	