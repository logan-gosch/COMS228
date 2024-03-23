import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;

/**
 * @author Logan Gosch
 */
class CasualTest {
    Town testTown = new Town("iastate/cs228/ISP4x4.txt");

    CasualTest() throws FileNotFoundException {}

    @Test
    void whoTest() {
        assert(testTown.grid[1][2].who() == State.CASUAL);
    }
}