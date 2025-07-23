package iii__Behavioural.e__strategy;

public class Main {
    public static void main(String[] args) {
        Traveler traveler = new Traveler();

        traveler.setStrategy(new CarTravel());
        traveler.startJourney(); // Output: Traveling by Car

        traveler.setStrategy(new TrainTravel());
        traveler.startJourney(); // Output: Traveling by Train

        traveler.setStrategy(new FlightTravel());
        traveler.startJourney(); // Output: Traveling by Flight
    }
}

