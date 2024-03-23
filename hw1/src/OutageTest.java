import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

/**
 * @author Logan Gosch
 */
class OutageTest {

    Town testTown = new Town("iastate/cs228/ISP4x4.txt");

    OutageTest() throws FileNotFoundException {}

    @Test
    void whoTest() {
        assert(testTown.grid[0][0].who() == State.OUTAGE);
    }
}