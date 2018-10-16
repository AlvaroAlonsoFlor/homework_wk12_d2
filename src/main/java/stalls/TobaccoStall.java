package stalls;

import interfaces.ISecurity;
import themepark.Visitor;

public class TobaccoStall extends Stall implements ISecurity {
    public TobaccoStall(String name, int rating, String owner, String parkingSpot) {
        super(name, rating, owner, parkingSpot);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() >= 18;
    }
}
