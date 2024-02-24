package hw1;

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

        return null;
    }
}
