package edu.iastate.cs228.hw1;

/**
 * @author Logan Gosch
 */
public class Casual extends TownCell {

    public Casual(Town p, int r, int c) {
        super(p, r, c);
    }

    /**
     * Returns the current cell-type for a given house on the grid.
     * @return cell state
     */
    @Override
    public State who() {
        return State.CASUAL;
    }

    /**
     * Determines the change of the cell type
     * based on the specific rules for: CASUAL
     * @param tNew: town of the next cycle
     * @return
     */
    @Override
    public TownCell next(Town tNew) {
        census(nCensus);
        if (nCensus[RESELLER] >= 1) {
            return new Outage(tNew, row, col);
        } else if (nCensus[STREAMER] >= 1) {
            return new Streamer(tNew, row, col);
        } else if (nCensus[OUTAGE] + nCensus[EMPTY] <= 1) {
            return new Reseller(tNew, row, col);
        } else if (nCensus[CASUAL] >= 5) {
            return new Streamer(tNew, row, col);
        }
        return new Casual(tNew, row, col);
    }
}
