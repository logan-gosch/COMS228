import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

/**
 * @author Logan Gosch
 */
class EmptyTest {

    Town testTown = new Town("iastate/cs228/ISP4x4.txt");

    EmptyTest() throws FileNotFoundException {}

    @Test
    void whoTest() {
        assert(testTown.grid[1][0].who() == State.EMPTY);
    }
}