package iii__Behavioural.g__state;

public class ConcreteStates {

}


class RedLight implements LightState {
    public void change(TrafficLight light) {
        System.out.println("Red → Green");
        light.setState(new GreenLight());
    }
}

class GreenLight implements LightState {
    public void change(TrafficLight light) {
        System.out.println("Green → Yellow");
        light.setState(new YellowLight());
    }
}

class YellowLight implements LightState {
    public void change(TrafficLight light) {
        System.out.println("Yellow → Red");
        light.setState(new RedLight());
    }
}
