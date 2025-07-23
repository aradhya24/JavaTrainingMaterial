package iii__Behavioural.e__strategy;

public class Traveller_Context {

}


class Traveler {
    private TravelStrategy strategy;

    public void setStrategy(TravelStrategy strategy) {
        this.strategy = strategy;
    }

    public void startJourney() {
        strategy.travel();
    }
}
