package sunita.Interface;
import java.util.*;

public class MoodWeatherMan implements Speaker{ 

	public void speak(){
		
		//Scanner key2 = new Scanner(System.in);
		System.out.println("Hello, are you ready for your weather forecast? Enter Y for Yes or N for No.");
		String rep = key.next();
		
		if(rep.equalsIgnoreCase("y")){
			System.out.println("How do you feel?");
			rep = key.next();
			announce(rep);
			//key.close();
		}
		else if(rep.equalsIgnoreCase("n")){
			System.out.println("That's alright. Wake me up when you are.");
			//key.close();
		}
		else{
			//key.close();	
		}

	}


	public void announce(String str){
	
		if(str.equalsIgnoreCase("happy") || str.equalsIgnoreCase("excited")){
			System.out.println("You are going to experience a lot of sunshine today with a chance of ice cream and froyo!");
		}
		else if(str.equalsIgnoreCase("sad") || str.equalsIgnoreCase("moody")){
			System.out.println("Your day is going to be very cloudy with a chance of meatballs and sausages!");
		}
		else{
			System.out.println("Hmmm...your mood is unpredictable. So it may hail, thunder, or nothing all.");
		}

	}	

}
