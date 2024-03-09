import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Logan Gosch
 */
class StreamerTest {

    hw1.Town testTown = new hw1.Town("ISP4x4.txt");

    StreamerTest() throws FileNotFoundException {}

    @Test
    void whoTest() {
        assert(testTown.grid[2][1].who() == State.STREAMER);
    }
}