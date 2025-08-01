package strategyassighnment.guitar.model;

import strategyassighnment.guitar.behaviour.playingstyle.FingerPicking;
import strategyassighnment.guitar.behaviour.sound.Distortion;
import strategyassighnment.guitar.behaviour.sound.Electric;
import strategyassighnment.guitar.behaviour.tuning.StandardTuning;

public class ElectricGuitar extends Guitar{
	
	public ElectricGuitar(String name) {
		super(name);
		System.out.println("\n\n");
		showGuitarInfo();
		setPlayingStyleBehaviour(new FingerPicking());
		System.out.print("Default ");
		playStyle();
		System.out.print("Default ");
		setSoundBehaviour(new Distortion());
		sound();
		setTuningBehaviour(new StandardTuning());
		System.out.print("Default ");
		tune();
	}
	
	@Override
	public void showGuitarInfo() {
		System.out.println("\nGuitar Name : " + name);
        System.out.println("Guitar Type : Acoustic Guitar");
        playStyle();
        sound();
        tune();
	}

	
}
