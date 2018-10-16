package interfaces;


import themepark.Visitor;

public interface ITicketed {
    double defaultPrice();
    double priceFor(Visitor visitor);

}
