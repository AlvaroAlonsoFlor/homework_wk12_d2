package attractions;

import interfaces.ISecurity;
import themepark.Visitor;

public class Playground extends Attraction implements ISecurity {
    public Playground(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() <= 15;
    }
}
