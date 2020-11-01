package box3d;

import model.Box;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxImplTest {
    BoxImplI boxImplI;
    @BeforeEach
    void setUp() {
        boxImplI=new BoxImpl(
                new Box(3,4,5)
        );
    }

    @Test
    void getSurfaceArea() {
        assertNotNull(boxImplI);
        assertTrue(boxImplI.getSurfaceArea()>0);
        assertEquals(94,boxImplI.getSurfaceArea(),0);
    }

    @Test
    void getVolume() {
        assertNotNull(boxImplI);
        assertTrue(boxImplI.getVolume()>0);
        assertEquals(60,boxImplI.getVolume(),0);
    }
}