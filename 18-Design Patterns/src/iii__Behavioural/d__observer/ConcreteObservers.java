package iii__Behavioural.d__observer;

public class ConcreteObservers {

}

class PhoneDisplay implements Observer {
    public void update(float temperature) {
        System.out.println("Phone Display: Current Temp = " + temperature + "°C");
    }
}

class WebDisplay implements Observer {
    public void update(float temperature) {
        System.out.println("Web Display: Current Temp = " + temperature + "°C");
    }
}

