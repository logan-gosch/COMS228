import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

class TownTest {
    Town testTown = new Town("iastate/cs228/ISP4x4.txt");

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