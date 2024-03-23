/**
 * @author Logan Gosch
 */
public class Outage extends TownCell {
    public Outage(Town p, int r, int c) {
        super(p, r, c);
    }

    /**
     * Returns the current cell-type for a given house on the grid.
     * @return cell state
     */
    @Override
    public State who() {
        return State.OUTAGE;
    }

    /**
     * Determines the change of the cell type
     * based on the specific rules for: OUTAGE
     * @param tNew: town of the next cycle
     * @return
     */
    public TownCell next(Town tNew) {
        census(nCensus);
        return new Empty(tNew, row, col);
    }

}
