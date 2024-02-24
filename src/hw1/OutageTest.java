package hw1;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Logan Gosch
 */
class OutageTest {

    Town testTown = new Town("ISP4x4.txt");

    OutageTest() throws FileNotFoundException {}

    @Test
    void whoTest() {
        assert(testTown.grid[0][0].who() == State.OUTAGE);
    }
}