/**
 * @author Logan Gosch
 */
public class Outage extends hw1.TownCell {
    public Outage(hw1.Town p, int r, int c) {
        super(p, r, c);
    }

    /**
     * Returns the current cell-type for a given house on the grid.
     * @return cell state
     */
    @Override
    public hw1.State who() {
        return hw1.State.OUTAGE;
    }

    /**
     * Determines the change of the cell type
     * based on the specific rules for: OUTAGE
     * @param tNew: town of the next cycle
     * @return
     */
    public hw1.TownCell next(hw1.Town tNew) {
        return null;
    }

}
