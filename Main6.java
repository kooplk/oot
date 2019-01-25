import java.util.*;

public class Main6 {

	// declare a private static data member of GRSData object
	// (You need to call the methods of GRSData when you finding the average mark, median
	//  best student(s) of a module

	public static void main(String[] argv) {

		if (argv.length != 3) {
			System.out.println("Usage: java Main6 {letter | numeric } {average | median | beststudent} <module code>");
			System.exit(1);
    	}

		// the main logic of this program, to be implemented by you!

  	}

  	// other methods for calculating the average mark, median and display the best student(s)
  	// have already been implemented in Stage 3 and Stage 4
}

abstract class GRSData {

	protected String[] moduleCode = {"ITD2322", "ICT2422", "ITD2321", "ICT2669"};
  	protected String[] studentID = {"1", "2", "3", "4", "5", "6", "7", "8"};

  	
	abstract int[] getModuleMark(String mCode);

	public String getStudentID(int i) {

		// return student ID of the student with index i in array stduentID

  	}
}

class LetterGRSData extends GRSData {

	private char[][] marks = { {'F', 'D', 'C', 'B', 'C', 'B', 'C', 'A'}, // mark for ITD2322
		                     {'D', 'B', 'A', 'A', 'F', 'B', 'C', 'C'}, // mark for ICT2422
		                     {'D', 'B', 'E', 'B', 'C', 'F', 'F', 'D'}, // mark for ITD2321
	                         {'C', 'B', 'E', 'D', 'C', 'B', 'C', 'A'}}; // mark for ICT2669

 	public int[] getModuleMark(String mCode) { // return the marks of a student with the given ID

		// return an array of marks for a module with given module code
		// (module code as input parameter "mCode").

		// note : numeric array of marks is to be returned (since 'A' -> 5, 'B' -> 4, 'C' -> 3 etc..)

	}

  	public int letterToNumeric(char grade) {

		// convert and return a numeric mark from a grade (grade as input pararmeter "grade)

	    // you may need to call this method from the method getModuleMark
  	}
}

class NumericGRSData extends GRSData {

  	private int[][] marks = { {30, 40, 50, 60, 45, 55, 65, 75}, // mark for ITD2322
	                    {80, 70, 60, 40, 34, 56, 78, 90}, // mark for ICT2422
	                    {76, 45, 67, 89, 12, 45, 67, 54}, // mark for ITD2321
                        {56, 76, 54, 55, 50, 43, 66, 44}}; // mark for ICT2669

  	public int[] getModuleMark(String mCode) { // return the marks of a student with the given ID

		// return an array of marks for a module with given module code
		// (module code as input parameter "mCode").

  	}
}