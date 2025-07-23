package iii__Behavioural.g__state;

public class Context_TrafficLight {

}

 class TrafficLight {
    private LightState state;

    public TrafficLight() {
        state = new RedLight(); // initial state
    }

    public void setState(LightState state) {
        this.state = state;
    }

    public void change() {
        state.change(this);
    }
}
