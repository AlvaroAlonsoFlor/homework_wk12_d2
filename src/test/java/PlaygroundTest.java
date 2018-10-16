import attractions.Playground;
import org.junit.Before;
import org.junit.Test;
import themepark.Visitor;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before() {
        playground = new Playground("The Playground", 7);
        visitor1 = new Visitor(4, 1.10, 5.00);
        visitor2 = new Visitor(19, 1.70, 5.00);
    }

    @Test
    public void canJoinYes() {
        assertTrue(playground.isAllowedTo(visitor1));
    }

    @Test
    public void canJoinNo() {
        assertFalse(playground.isAllowedTo(visitor2));
    }
}
