import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Logan Gosch
 */
class OutageTest {

    hw1.Town testTown = new hw1.Town("ISP4x4.txt");

    OutageTest() throws FileNotFoundException {}

    @Test
    void whoTest() {
        assert(testTown.grid[0][0].who() == hw1.State.OUTAGE);
    }
}