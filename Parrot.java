package sunita.Interface;
import java.util.*;

public class Parrot implements Speaker{ 

	public void speak(){
		
		System.out.println("Hello, I'm John. Kwerrr!");

		//Scanner key3 = new Scanner(System.in);
		System.out.println("What's your name? ");
		String rep = key.next();
		announce(rep);
		//key.close();
		
	}


	public void announce(String str){
		
		String name = "Mike";
		if(str.equalsIgnoreCase(name)){
			System.out.println("Your name is " + str + ". Kwerrr!");
		}
		else if(str.equalsIgnoreCase("age")){
			System.out.println("You are 50 years old. Kwerrr!");
		}
		else{
			System.out.println("Kwerrr! Kwerrr! Kwerrr!");
		}

	}	

}
