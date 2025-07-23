package ii__Structural.e__bridge;

public class BasicRemote extends RemoteControl {
    public BasicRemote(IDevice device) {
        super(device);
    }

    public void pressPowerButton() {
        System.out.print("Pressing Power Button: ");
        device.turnOn();  // or toggle logic
    }
}
