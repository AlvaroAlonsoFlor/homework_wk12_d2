import attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;
import themepark.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before() {
        dodgems = new Dodgems("Dodgems", 7);
        visitor1 = new Visitor(24, 1.70, 5.00);
        visitor2 = new Visitor(8, 1.30, 5.00);


    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(4.50, dodgems.defaultPrice(), 0.01);
    }

    @Test
    public void hasPriceForAdult() {
        assertEquals(4.50, dodgems.priceFor(visitor1), 0.01);
    }

    @Test
    public void hasPriceForChild() {
        assertEquals(2.25, dodgems.priceFor(visitor2), 0.01);
    }
}
