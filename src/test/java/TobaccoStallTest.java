
import org.junit.Before;
import org.junit.Test;
import stalls.TobaccoStall;
import themepark.Visitor;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TobaccoStallTest {
    TobaccoStall tobaccoStall;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before() {
        tobaccoStall = new TobaccoStall("Tobacco Shop", 5, "Average John", "AA879");
        visitor1 = new Visitor(4, 1.10, 5.00);
        visitor2 = new Visitor(19, 1.70, 5.00);
    }

    @Test
    public void canJoinNo() {
        assertFalse(tobaccoStall.isAllowedTo(visitor1));
    }

    @Test
    public void canJoinYes() {
        assertTrue(tobaccoStall.isAllowedTo(visitor2));
    }
}
