package strategyassighnment.guitar.model;

import strategyassighnment.guitar.behaviour.playingstyle.FingerPicking;
import strategyassighnment.guitar.behaviour.sound.Acoustic;
import strategyassighnment.guitar.behaviour.tuning.StandardTuning;

public class AcousticGuitar extends Guitar {

    public AcousticGuitar(String name) {
        super(name);  // pass name to superclass
        System.out.println("\n\n");
        showGuitarInfo();
        setPlayingStyleBehaviour(new FingerPicking());
        System.out.print("Default ");
        playStyle();
        setSoundBehaviour(new Acoustic());
        System.out.print("Default ");
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

