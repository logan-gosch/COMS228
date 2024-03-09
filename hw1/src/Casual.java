/**
 * @author Logan Gosch
 */
public class Casual extends hw1.TownCell {

    public Casual(hw1.Town p, int r, int c) {
        super(p, r, c);
    }

    /**
     * Returns the current cell-type for a given house on the grid.
     * @return cell state
     */
    @Override
    public hw1.State who() {
        return hw1.State.CASUAL;
    }

    /**
     * Determines the change of the cell type
     * based on the specific rules for: CASUAL
     * @param tNew: town of the next cycle
     * @return
     */
    @Override
    public hw1.TownCell next(hw1.Town tNew) {
        if (nCensus[RESELLER] >= 1) {
            return new hw1.Outage(tNew, tNew.getLength(), tNew.getWidth());
        } else if (nCensus[STREAMER] >= 1) {
            return new hw1.Streamer(tNew, tNew.getLength(), tNew.getWidth());
        } else if (nCensus[OUTAGE] + nCensus[EMPTY] <= 1) {
            return new hw1.Reseller(tNew, tNew.getLength(), tNew.getWidth());
        }
        return new Casual(tNew, tNew.getLength(), tNew.getWidth());
    }
}
