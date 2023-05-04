package sunita.Interface;
import java.util.*;

public class TrainNav implements Speaker{ 

	public void speak(){
		
		System.out.println("Welcome onboard the express 5 train to Bowling Green.");

		//Scanner key4 = new Scanner(System.in);
		System.out.println("What is your stop?");
		String rep = key.next();
		announce(rep);
		//key.close();
	}


	public void announce(String str){
	
		if(str.equalsIgnoreCase("next")){
			System.out.println("The next stop is 59th Street.");
		}
		else if(str.equalsIgnoreCase("grand central")){
			System.out.println("You are 2 stops away from Grand Central station.");
		}
		else if(str.equalsIgnoreCase("times square")){
			System.out.println("Ride 2 stops to Grand Central, 42nd Street.");
			System.out.println("Then take the S train by switching platforms to get to Times Square, 42nd Street.");
		}
		else{
			System.out.println("Sorry, I don't understand your request.");
			System.out.println("As you ride the train the MTA advises that you be mindful of your surroundings and your belongings.");
			System.out.println("If you see something, say something. Have a nice day!");
		}

	}	// try a switch statement instead of an if-else

}
