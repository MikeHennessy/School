package sunita.Interface;
import java.util.*;

public class SpeakerTest{

	public static void main(String[] args){
		
		System.out.println("\n");
		TrainNav nytrain = new TrainNav();
		nytrain.speak();
		nytrain.announce("Next");
		nytrain.announce("Grand Central");
		nytrain.announce("Times Square");
		System.out.println("\n");

		MoodWeatherMan man = new MoodWeatherMan();
		man.speak();
		System.out.println("\n");
		man.announce("Excited");
		man.announce("Moody");
		man.announce("Calm");
		System.out.println("\n");
		
		Parrot parrot = new Parrot();
		parrot.speak();
		parrot.announce("Name");
		parrot.announce("Age");
		System.out.println("\n");
		
		BaseballAnnouncer benetti = new BaseballAnnouncer();
		benetti.speak();
		benetti.announce("homerun");
		benetti.announce("score");
		benetti.announce("inning");
		
	}
}
