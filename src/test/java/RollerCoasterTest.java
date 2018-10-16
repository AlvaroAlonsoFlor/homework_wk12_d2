import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import themepark.Visitor;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {
    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before() {
        rollerCoaster = new RollerCoaster("RollerCoaster", 7);
        visitor1 = new Visitor(24, 2.10, 5.00);
        visitor2 = new Visitor(19, 1.70, 5.00);


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
}
