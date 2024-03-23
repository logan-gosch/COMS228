package edu.iastate.cs228.hw1;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

/**
 * @author Logan Gosch
 */
class ResellerTest {

    Town testTown = new Town("iastate/cs228/ISP4x4.txt");

    ResellerTest() throws FileNotFoundException {}

    @Test
    void whoTest() {
        assert(testTown.grid[0][3].who() == State.RESELLER);
    }
}