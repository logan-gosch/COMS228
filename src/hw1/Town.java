package hw1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

import hw1.State;

/**
 *  @author Logan Gosch
 */
public class Town {
	
	private int length, width;  //Row and col (first and second indices)
	public TownCell[][] grid;
	
	/**
	 * Constructor to be used when user wants to generate grid randomly, with the given seed.
	 * This constructor does not populate each cell of the grid (but should assign a 2D array to it).
	 * @param length
	 * @param width
	 */
	public Town(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	/**
	 * Constructor to be used when user wants to populate grid based on a file.
	 * Please see that it simple throws FileNotFoundException exception instead of catching it.
	 * Ensure that you close any resources (like file or scanner) which is opened in this function.
	 * @param inputFileName
	 * @throws FileNotFoundException
	 */
	public Town(String inputFileName) throws FileNotFoundException {
		Scanner fileScanner = new Scanner(new File(inputFileName));
		String line = fileScanner.nextLine();

		Scanner lineScanner = new Scanner(line);
		length = lineScanner.nextInt();
		width = lineScanner.nextInt();



		grid = new TownCell[length][width];

		for (int i = 0; i < length; i++) {

			for (int j = 0; j < width; j++) {

			}
		}

		fileScanner.close();
	}
	
	/**
	 * Returns width of the grid.
	 * @return
	 */
	public int getWidth() {
		return width;
	}
	
	/**
	 * Returns length of the grid.
	 * @return
	 */
	public int getLength() {
		return length;
	}

	/**
	 * Initialize the grid by randomly assigning cell with one of the following class object:
	 * Casual, Empty, Outage, Reseller OR Streamer
	 */
	public void randomInit(int seed) {
		Random rand = new Random(seed);
		//TODO: Write your code here.
	}
	
	/**
	 * Output the town grid. For each square, output the first letter of the cell type.
	 * Each letter should be separated either by a single space or a tab.
	 * And each row should be in a new line. There should not be any extra line between 
	 * the rows.
	 */
	@Override
	public String toString() {
		String s = "";

		for (int i = 0; i < width; i++){
			for (int j = 0; j < length; j++) {
				if (grid[i][j].who() == State.CASUAL) {
					s += "C ";
				} else if (grid[i][j].who() == State.STREAMER) {
					s += "S ";
				} else if (grid[i][j].who() == State.RESELLER) {
					s += "R ";
				} else if (grid[i][j].who() == State.EMPTY) {
					s += "E ";
				} else if (grid[i][j].who() == State.OUTAGE) {
					s += "O ";
				}
			}
			System.out.println();
		}

		return s;
	}
}
