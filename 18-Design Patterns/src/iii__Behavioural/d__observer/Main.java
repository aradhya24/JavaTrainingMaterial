package iii__Behavioural.d__observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        Observer phone = new PhoneDisplay();
        Observer web = new WebDisplay();

        station.addObserver(phone);
        station.addObserver(web);

        station.setTemperature(25.5f);  // Notifies all displays
        station.setTemperature(30.2f);  // Again notifies
    }
}
