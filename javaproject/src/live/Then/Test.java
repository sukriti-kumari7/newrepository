package live.Then;

import mugic.Playable;
import music.string.Veena;
import music.wind.Saxaphone;

public class Test {

	public static void main(String[] args) {
		
		Playable playable = new Veena();
		playable.play();
		playable = new Saxaphone();
		playable.play();

	}

}
