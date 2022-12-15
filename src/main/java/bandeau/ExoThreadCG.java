package bandeau;

import java.util.*;

public class ExoThreadCG extends Thread{

    private Bandeau Band;
    private List<ScenarioElement> Element;

    public ExoThreadCG(Bandeau Band, List<ScenarioElement> Element) {
        this.Band = Band;
        this.Element = Element;
    }
    
    @Override
    public void run(){
        for (ScenarioElement SE : Element) {
            for (int i = 0; i < SE.repeats ; i++) {
                SE.effect.playOn(Band);
            }
        }
    }
}
