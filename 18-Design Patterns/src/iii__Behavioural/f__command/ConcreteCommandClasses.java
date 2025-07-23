package iii__Behavioural.f__command;

public class ConcreteCommandClasses {

}


//TV Command classes
 class TurnOnTVCommand implements Command {
    private TV tv;

    public TurnOnTVCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.turnOn();
    }
}

 class TurnOffTVCommand implements Command {
    private TV tv;

    public TurnOffTVCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.turnOff();
    }
}

 
 
 
//AC Command classes
 
 class TurnOnACCommand implements Command {
	    private AC ac;

	    public TurnOnACCommand(AC ac) {
	        this.ac = ac;
	    }

	    public void execute() {
	        ac.turnOn();
	    }
	}

class TurnOffACCommand implements Command {
	    private AC ac;

	    public TurnOffACCommand(AC ac) {
	        this.ac = ac;
	    }

	    public void execute() {
	        ac.turnOff();
	    }
	}

