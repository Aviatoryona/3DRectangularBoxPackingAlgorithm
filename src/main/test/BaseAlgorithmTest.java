import model.Box;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class BaseAlgorithmTest extends BaseAlgorithm {

    public BaseAlgorithmTest(Box container, Map<Integer, Box> packingBoxes) {
        super(container, packingBoxes);
    }

}