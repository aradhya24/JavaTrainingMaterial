package iii__Behavioural.b__Mediator;

public interface ATCMediator {
    void registerFlight(Flight flight);
    void setLandingStatus(boolean status);
    boolean isLandingAllowed();
}

