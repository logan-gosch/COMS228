package hw1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class ISPBusinessTest {

    Town testTown = new Town("ISP4x4.txt");
    TownCell[][] grid = {
            {new Outage(testTown, 0, 0), new Reseller(testTown, 0, 1), new Outage(testTown, 0, 2), new Reseller(testTown, 0, 3)},
            {new Empty(testTown, 1, 0), new Empty(testTown, 1, 1), new Casual(testTown, 1, 2), new Outage(testTown, 1, 3)},
            {new Empty(testTown, 2, 0), new Streamer(testTown, 2, 1), new Outage(testTown, 2, 2), new Streamer(testTown, 2, 3)},
            {new Empty(testTown, 3, 0), new Outage(testTown, 3, 1), new Reseller(testTown, 3, 2), new Reseller(testTown, 3, 3)}};

    ISPBusinessTest() throws FileNotFoundException {
    }

    @BeforeEach
    void init() {

    }
}