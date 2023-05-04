package sunita;
import java.util.*;

public class Grades {
	
	private int[] values;
	
	Grades () {	
		values = new int[1];
	}
	
	Grades (int[] myArray) {
		values = myArray;
	}
	
	public void setValues(int[] myArray) { // set values declaration
		values = myArray;
	}
	
	public int[] getValues() { // returns values array
		return values;
	}
	
	public int highest() {// returns the highest value in array
		int highest = values[0];
		for(int i = 1; i < (values.length); i++) {
			if(values[i] > highest) {
				highest = values[i];
			}
		}
		return highest;
	}
	
	public int lowest() {// returns the lowest value in array
		int lowest = values[0];
		for(int i = 1; i < (values.length); i++) {
			if(values[i] < lowest) {
				lowest = values[i];
			}
		}
		return lowest;
	}
	
	public int numOfGrades() {// returns the number of grades in array
		int count = values.length;
		return count;
	}
	
	public double average() { // returns the average of array
		int total = 0;
		for(int i = 0; i < (values.length); i++) {
			total += values[i];
		}
		double average = total / (values.length);
		return average;
	}
	
	public int numOfFailingGrades(int gradeValue) { // returns the number of values in the array that are less than input value, gradeValue
		int numOfFailingGrades = 0;
		for(int i = 0; i < (values.length); i++) {
			if(values[i] < gradeValue) {
				numOfFailingGrades++;
			}
		}
		return numOfFailingGrades;
	}
	
	public void histogram() { // prints the histogram of grades };
		String A = ""; String B = ""; String C = ""; String D = ""; String F = "";
		for(int i = 0; i < values.length; i++) {
			if(values[i] >= 90 && values[i] <= 100) {
				A = A + "*";
			}
			else if(values[i] >= 80 && values[i] <= 89) {
				B = B + "*";
			}
			else if(values[i] >= 70 && values[i] <= 79) {
				C = C + "*";
			}
			else if(values[i] >= 60 && values[i] <= 69) {
				D = D + "*";
			}
			else if(values[i] < 60 && values[i] > 0) {
				F = F + "*";
			}
		}
		String histogram = "90 - 100  |  " + A + "\n80 - 89   |  " + B + "\n70 - 79   |  " + C + "\n60 - 69   |  " + D + "\n< 60      |  " + F;
		System.out.println(histogram);
	}
	
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		
		System.out.println("Enter the number of grades to input: ");
		int numGrades = Integer.parseInt(myObj.nextLine());  // Read user input
		int[] grades = new int[numGrades]; // Declare the array of grades
		
		for(int i = 1; i <= numGrades; i++) { // Loop through number of grades
			System.out.println("Enter grade " + i + " (from 0 - 100 inclusive):    ");
			grades[i-1] = Integer.parseInt(myObj.nextLine());  // Read user input
		}
		
		myObj.close();	// Close the scanner object
		
		Grades test = new Grades(grades);	// Create new grades object
		
		// Test all of the functions
		// System.out.println("Grade values: " + test.getValues());
		System.out.println("Highest grade: " + test.highest());
		System.out.println("Lowest grade: " + test.lowest());
		System.out.println("Number of grades: " + test.numOfGrades());
		System.out.println("Average grade: " + test.average());
		System.out.println("Number of failing grades: " + test.numOfFailingGrades(59));
		System.out.println("Histogram of grades: ");
		test.histogram();
		
		Grades test2 = new Grades();	// Test a set of values without declaring the values in the constructor
		test2.setValues(grades);
		// System.out.println("Grade values: " + Integer.toString(test2.getValues()));
	}
}
