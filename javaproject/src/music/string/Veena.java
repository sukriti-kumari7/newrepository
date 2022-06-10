package music.string;

import mugic.Playable;

public class Veena implements Playable {
	
	public void play() {
		System.out.println("Playing Veena ");
	}

	public static void main(String[] args) {
		Veena played = new Veena();
		played.play();

	}

}
