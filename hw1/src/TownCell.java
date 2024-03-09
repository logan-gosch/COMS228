/**
 * 
 * @author Logan Gosch
 *	Also provide appropriate comments for this class
 */
public abstract class TownCell {

	protected Town plain;
	protected int row;
	protected int col;
	
	
	// constants to be used as indices.
	protected static final int RESELLER = 0;
	protected static final int EMPTY = 1;
	protected static final int CASUAL = 2;
	protected static final int OUTAGE = 3;
	protected static final int STREAMER = 4;
	
	public static final int NUM_CELL_TYPE = 5;
	
	//Use this static array to take census.
	public static final int[] nCensus = new int[NUM_CELL_TYPE];

	public TownCell(Town p, int r, int c) {
		plain = p;
		row = r;
		col = c;
	}
	
	/**
	 * Checks all neighborhood cell types in the neighborhood.
	 * Refer to homework pdf for neighbor definitions (all adjacent
	 * neighbors excluding the center cell).
	 * Use who() method to get who is present in the neighborhood
	 *  
	 * @param nCensus counts of all customers
	 */
	public void census(int nCensus[]) {
		// zero the counts of all customers
		nCensus[RESELLER] = 0; 
		nCensus[EMPTY] = 0; 
		nCensus[CASUAL] = 0; 
		nCensus[OUTAGE] = 0; 
		nCensus[STREAMER] = 0;

		for (int i = col - 1; i <= (col + 1); i++) {
			for (int j = row - 1; j <= (row + 1); j++) {
				if (plain.grid[row][col].who() == State.CASUAL){
					nCensus[CASUAL] += 1;
				} else if (plain.grid[row][col].who() == State.STREAMER){
					nCensus[STREAMER] += 1;
				} else if (plain.grid[row][col].who() == State.RESELLER){
					nCensus[RESELLER] += 1;
				} else if (plain.grid[row][col].who() == State.EMPTY){
					nCensus[EMPTY] += 1;
				} else if (plain.grid[row][col].who() == State.OUTAGE){
					nCensus[OUTAGE] += 1;
				}
			}
		}

	}

	/**
	 * Gets the identity of the cell.
	 * 
	 * @return State
	 */
	public abstract State who();

	/**
	 * Determines the cell type in the next cycle.
	 * 
	 * @param tNew: town of the next cycle
	 * @return TownCell
	 */
	public abstract TownCell next(Town tNew);
}
