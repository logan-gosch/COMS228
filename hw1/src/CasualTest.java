import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Logan Gosch
 */
class CasualTest {
    hw1.Town testTown = new hw1.Town("ISP4x4.txt");

    CasualTest() throws FileNotFoundException {}

    @Test
    void whoTest() {
        assert(testTown.grid[1][2].who() == hw1.State.CASUAL);
    }
}