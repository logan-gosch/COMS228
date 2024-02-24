package hw1;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Logan Gosch
 */
class CasualTest {
    Town testTown = new Town("ISP4x4.txt");

    CasualTest() throws FileNotFoundException {}

    @Test
    void whoTest() {
        assert(testTown.grid[1][2].who() == State.CASUAL);
    }
}