package hw1;

/**
 * @author Logan Gosch
 */
public class Streamer extends TownCell {

    public Streamer(Town p, int r, int c) {
        super(p, r, c);
    }

    /**
     * Returns the current cell-type for a given house on the grid.
     * @return cell state
     */
    @Override
    public State who() {
        return State.STREAMER;
    }

    /**
     * Determines the change of the cell type
     * based on the specific rules for: STREAMER
     * @param tNew: town of the next cycle
     * @return
     */
    @Override
    public TownCell next(Town tNew) {
        if (nCensus[RESELLER] >= 1) {
            return new Outage(tNew, tNew.getLength(), tNew.getWidth());
        } else if (nCensus[OUTAGE] >= 1) {
            return new Empty(tNew, tNew.getLength(), tNew.getWidth());
        } else if (nCensus[OUTAGE] + nCensus[EMPTY] <= 1) {
            return new Reseller(tNew, tNew.getLength(), tNew.getWidth());
        }
        return new Streamer(tNew, tNew.getLength(), tNew.getWidth());
    }
}
