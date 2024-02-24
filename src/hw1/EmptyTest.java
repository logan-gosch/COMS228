package hw1;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Logan Gosch
 */
class EmptyTest {

    Town testTown = new Town("ISP4x4.txt");

    EmptyTest() throws FileNotFoundException {}

    @Test
    void whoTest() {
        assert(testTown.grid[1][0].who() == State.EMPTY);
    }
}