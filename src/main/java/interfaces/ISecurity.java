package interfaces;

import themepark.Visitor;

public interface ISecurity {
    boolean isAllowedTo(Visitor visitor);
}
