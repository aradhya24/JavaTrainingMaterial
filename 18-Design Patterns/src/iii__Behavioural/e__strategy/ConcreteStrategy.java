package iii__Behavioural.e__strategy;

public class ConcreteStrategy {

}

class CarTravel implements TravelStrategy {
    public void travel() {
        System.out.println("Traveling by Car");
    }
}

class TrainTravel implements TravelStrategy {
    public void travel() {
        System.out.println("Traveling by Train");
    }
}

class FlightTravel implements TravelStrategy {
    public void travel() {
        System.out.println("Traveling by Flight");
    }
}

