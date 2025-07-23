package iii__Behavioural.g__state;

public class Main {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();

        // Simulate 6 light changes
        for (int i = 0; i < 6; i++) {
            light.change();
        }
    }
}
