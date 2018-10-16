package stalls;

import interfaces.IReviewed;

public abstract class Stall implements IReviewed {
    private String name;
    private int rating;
    private String owner;
    private String parkingSpot;

    public Stall(String name, int rating, String owner, String parkingSpot) {
        this.name = name;
        this.rating = rating;
        this.owner = owner;
        this.parkingSpot = parkingSpot;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRating() {
        return rating;
    }

    public String getOwner() {
        return owner;
    }

    public String getParkingSpot() {
        return parkingSpot;
    }
}
