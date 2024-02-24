package hw1;

/**
 * @author Logan Gosch
 */
public class Empty extends TownCell {

    public Empty(Town p, int r, int c) {
        super(p, r, c);
    }

    /**
     * Returns the current cell-type for a given house on the grid.
     * @return cell state
     */
    @Override
    public State who() {
        return State.EMPTY;
    }

    /**
     * Determines the change of the cell type
     * based on the specific rules for: EMPTY
     * @param tNew: town of the next cycle
     * @return
     */
    @Override
    public TownCell next(Town tNew) {
        return null;
    }
}
