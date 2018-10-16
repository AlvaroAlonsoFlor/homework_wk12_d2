import attractions.RollerCoaster;
import interfaces.IReviewed;
import interfaces.ISecurity;
import interfaces.ITicketed;
import org.junit.Before;
import org.junit.Test;
import stalls.TobaccoStall;
import themepark.ThemePark;
import themepark.Visitor;

import java.lang.reflect.Array;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ThemeParkTest {
    ThemePark themePark;
    RollerCoaster rollerCoaster;
    TobaccoStall tobaccoStall;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before() {
        themePark = new ThemePark();
        rollerCoaster = new RollerCoaster("Roller Coaster", 7);
        tobaccoStall = new TobaccoStall("Tobacco Shop", 5, "Joe", "AA67FF");
        visitor1 = new Visitor(5, 1.40, 1);
        visitor2 = new Visitor(20, 1.90, 10);
    }

    @Test
    public void returnsReviewedPlaces() {
        assertEquals(0, themePark.getAllReviewed().size());
    }

    @Test public void returnsReviewedPlaces1() {
        themePark.addPlace(rollerCoaster);
        assertEquals(1, themePark.getAllReviewed().size());
    }

    @Test public void returnsAffordablePlaces() {
        themePark.addPlace(rollerCoaster);
        themePark.addPlace(rollerCoaster);
        assertEquals(2, themePark.getAllAllowedFor(visitor2).size());
    }

    @Test public void returnsAffordablePlacesNoMoney() {
        themePark.addPlace(rollerCoaster);
        themePark.addPlace(rollerCoaster);
        assertEquals(0, themePark.getAllAllowedFor(visitor1).size());

    }


}
