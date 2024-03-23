package edu.iastate.cs228.hw1;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

/**
 * @author Logan Gosch
 */
class StreamerTest {

    Town testTown = new Town("iastate/cs228/ISP4x4.txt");

    StreamerTest() throws FileNotFoundException {}

    @Test
    void whoTest() {
        assert(testTown.grid[2][1].who() == State.STREAMER);
    }
}