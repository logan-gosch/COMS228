package edu.iastate.cs228.hw1;

import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Logan Gosch
 *
 * The ISPBusiness class performs simulation over a grid 
 * plain with cells occupied by different TownCell types.
 *
 */
public class ISPBusiness {
	
	/**
	 * Returns a new Town object with updated grid value for next billing cycle.
	 * @param tOld: old/current Town object.
	 * @return: New town object.
	 */
	public static Town updatePlain(Town tOld) {
		Town tNew = new Town(tOld.getLength(), tOld.getWidth());

		for (int i = 0; i < tNew.getLength(); i++) {
			for (int j = 0; j < tNew.getWidth(); j++) {
				tNew.grid[i][j] = tOld.grid[i][j].next(tNew);
			}
		}

		return tNew;
	}
	
	/**
	 * Returns the profit for the current state in the town grid.
	 * @param town
	 * @return
	 */
	public static int getProfit(Town town) {
		int numCasual = 0;
		for (int i = 0; i < town.getLength(); i++) {
			for (int j = 0; j < town.getWidth(); j++) {
				if (town.grid[i][j].who() == State.CASUAL) {
					numCasual++;
				}
			}
		}
		return numCasual;
	}
	

	/**
	 *  Main method. Interact with the user and ask if user wants to specify elements of grid
	 *  via an input file (option: 1) or wants to generate it randomly (option: 2).
	 *  
	 *  Depending on the user choice, create the Town object using respective constructor and
	 *  if user choice is to populate it randomly, then populate the grid here.
	 *  
	 *  Finally: For 12 billing cycle calculate the profit and update town object (for each cycle).
	 *  Print the final profit in terms of %. You should print the profit percentage
	 *  with two digits after the decimal point:  Example if profit is 35.5600004, your output
	 *  should be:
	 *
	 *	35.56%
	 *  
	 * Note that this method does not throw any exception, so you need to handle all the exceptions
	 * in it.
	 * 
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int userGridChoice = 0;
		Town t1 = new Town(1, 1);

		// User chooses the grid
		while (true) {
			System.out.println("How to populate grid (type 1 or 2):\n 1: from a file.\n 2: randomly with seed");
			
			userGridChoice = userInput.nextInt();

			if (userGridChoice == 1 || userGridChoice == 2) {
				break;
			} else {
				System.out.println("Invalid input, please choose option 1 or 2...");
			}
		}

		// Creates the grid based on the specific user choice
		if (userGridChoice == 1) {
			System.out.println("Enter file name:");
			try {
				t1 = new Town(userInput.next());
			} catch (FileNotFoundException ignored) {}
		} else {
			System.out.println("Enter: [rows] [columns] [seed]");
			try {
				int rows = userInput.nextInt();
				int columns = userInput.nextInt();
				int seed = userInput.nextInt();
				t1 = new Town(rows, columns);
				t1.randomInit(seed);
			} catch (InputMismatchException e) {
				throw new InputMismatchException();
			}
		}

		// Cycles the board through a 12 month billing cycle
		// Outputs the profit percentage
		int profit = 0;
		System.out.println(t1);
		for (int i = 0; i < 12; i++) {
			profit += getProfit(t1);
			t1 = updatePlain(t1);
			System.out.println(t1);
		}

		double profitUtil = ((double) profit / ((t1.getLength() * t1.getWidth()) * 12)) * 100;
		DecimalFormat format = new DecimalFormat("##.00");
		System.out.printf(format.format(profitUtil));

		userInput.close();
	}
}
