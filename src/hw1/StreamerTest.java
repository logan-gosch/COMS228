package hw1;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Logan Gosch
 */
class StreamerTest {

    Town testTown = new Town("ISP4x4.txt");

    StreamerTest() throws FileNotFoundException {}

    @Test
    void whoTest() {
        assert(testTown.grid[2][1].who() == State.STREAMER);
    }
}