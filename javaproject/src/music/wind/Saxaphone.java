package music.wind;

import mugic.Playable;

public class Saxaphone implements Playable { 
	
	public void play() {
	
		System.out.println("Playing Saxaphone. ");
	}

	public static void main(String[] args) {
		Saxaphone played = new Saxaphone();
		played.play();

	}

}
