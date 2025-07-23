package iii__Behavioural.b__Mediator;

public class Airplane implements Flight {
    private ATCMediator atc;
    private String flightId;

    public Airplane(ATCMediator atc, String flightId) {
        this.atc = atc;
        this.flightId = flightId;
        atc.registerFlight(this);
    }

    public void requestLanding() {
        System.out.println(flightId + " requesting landing...");
        if (atc.isLandingAllowed()) {
            land();
            atc.setLandingStatus(false); // Block others
        } else {
            System.out.println("Landing not allowed for " + flightId);
        }
    }

    public void land() {
        System.out.println(flightId + " landed successfully.");
    }
}
