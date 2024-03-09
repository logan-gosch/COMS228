import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class ISPBusinessTest {

    hw1.Town testTown = new hw1.Town("ISP4x4.txt");
    hw1.TownCell[][] grid = {
            {new Outage(testTown, 0, 0), new hw1.Reseller(testTown, 0, 1), new Outage(testTown, 0, 2), new hw1.Reseller(testTown, 0, 3)},
            {new Empty(testTown, 1, 0), new Empty(testTown, 1, 1), new Casual(testTown, 1, 2), new Outage(testTown, 1, 3)},
            {new Empty(testTown, 2, 0), new hw1.Streamer(testTown, 2, 1), new Outage(testTown, 2, 2), new hw1.Streamer(testTown, 2, 3)},
            {new Empty(testTown, 3, 0), new Outage(testTown, 3, 1), new hw1.Reseller(testTown, 3, 2), new hw1.Reseller(testTown, 3, 3)}};

    ISPBusinessTest() throws FileNotFoundException {
    }

    @BeforeEach
    void init() {

    }
}