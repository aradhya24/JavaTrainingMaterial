package iii__Behavioural.f__command;

public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        // TV setup
        TV tv = new TV();
        Command tvOn = new TurnOnTVCommand(tv);
        Command tvOff = new TurnOffTVCommand(tv);

        // AC setup
        AC ac = new AC();
        Command acOn = new TurnOnACCommand(ac);
        Command acOff = new TurnOffACCommand(ac);

        // Test TV ON
        remote.setCommand(tvOn);
        remote.pressButton();  // Output: TV is ON

        // Test TV OFF
        remote.setCommand(tvOff);
        remote.pressButton();  // Output: TV is OFF

        // Test AC ON
        remote.setCommand(acOn);
        remote.pressButton();  // Output: AC is ON

        // Test AC OFF
        remote.setCommand(acOff);
        remote.pressButton();  // Output: AC is OFF
    }
}
	