import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class TownTest {
    Town testTown = new Town("ISP4x4.txt");

    TownTest() throws FileNotFoundException {}



    @Test
    void getWidthTest() {
        assert (testTown.getWidth() == 4);
    }

    @Test
    void getLengthTest() {
        assert (testTown.getLength() == 4);
    }

    @Test
    void toStringTest() {
        System.out.print(testTown);
    }
}