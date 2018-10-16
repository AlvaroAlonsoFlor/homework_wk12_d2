package themepark;

import attractions.Attraction;
import interfaces.IReviewed;
import interfaces.ITicketed;
import stalls.Stall;


import java.util.ArrayList;

public class ThemePark {
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> places;
    private ArrayList<ITicketed> placesWithTicket;

    public ThemePark() {
        this.places = new ArrayList<>();
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
        this.placesWithTicket = new ArrayList<>();
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return places;
    }

   public void addPlace(IReviewed place) {
        places.add(place);

        if (place instanceof ITicketed) {
            placesWithTicket.add((ITicketed) place);
        }
   }

   public ArrayList<ITicketed> getAllAllowedFor(Visitor visitor) {
        ArrayList<ITicketed> result;
        result = new ArrayList<>();

       for (ITicketed place : placesWithTicket) {
           if (visitor.getMoney() >= place.priceFor(visitor)) {
               result.add(place);
           }
       }

       return result;
   }




}
