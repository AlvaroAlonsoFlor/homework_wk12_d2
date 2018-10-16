import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import themepark.Visitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RollerCoasterTest {
    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;


    @Before
    public void before() {
        rollerCoaster = new RollerCoaster("RollerCoaster", 7);
        visitor1 = new Visitor(24, 2.10, 5.00);
        visitor2 = new Visitor(19, 1.70, 5.00);
        visitor3 = new Visitor(11, 1.70, 5.00);
        visitor4 = new Visitor(20, 1.10, 5.00);


    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.01);
    }

    @Test
    public void hasPriceForTall() {
        assertEquals(16.80, rollerCoaster.priceFor(visitor1), 0.01);
    }

    @Test
    public void hasPriceForNormal() {
        assertEquals(8.40, rollerCoaster.priceFor(visitor2), 0.01);
    }

    @Test
    public void canJoinYes() {
        assertTrue(rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void canJoinNo() {
        assertFalse(rollerCoaster.isAllowedTo(visitor3));
        assertFalse(rollerCoaster.isAllowedTo(visitor4));
    }

    @Test
    public void canGetRatings() {
        assertEquals(7, rollerCoaster.getRating());
    }

    @Test
    public void canGetName() {
        assertEquals("RollerCoaster", rollerCoaster.getName());
    }
}
