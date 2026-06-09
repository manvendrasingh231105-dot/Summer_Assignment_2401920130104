package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {

        Veena v = new Veena();
        v.play();
        Flute s = new Flute();
        s.play();
        
        Playable p;
        
        p = new Veena();
        p.play();
        p = new Flute();
        p.play();
    }
}