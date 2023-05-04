package sunita.Interface;
import java.util.*;

public class BaseballAnnouncer implements Speaker{ 

	public void speak(){
		
		System.out.println("Play ball!");

		//Scanner key1 = new Scanner(System.in);
		System.out.println("Hello, what part of the box score do you want to know? Score, inning, homerun, etc.?");
		String rep = key.next();
		announce(rep);
		//key.close();
	}


	public void announce(String str){
	
		if(str.equalsIgnoreCase("homerun")){
			System.out.println("A deep drive to left field... Homerun!");
		}
		else if(str.equalsIgnoreCase("score")){
			System.out.println("The Chicago White Sox have the lead one to nothing against the Chicago Cubs.");
		}
		else if(str.equalsIgnoreCase("inning")){
			System.out.println("It is the bottom half of the sixth inning.");
		}
		else{
			System.out.println("Here's the pitch...");
		}

	}	

}
