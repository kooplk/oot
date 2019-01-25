import java.util.*;

public class Main5 {
  // Test Data for the program
  	private static String[] moduleCode = {"ITD2322", "ICT2422", "ITD2321", "ICT2669"};
	private static String[] studentID = {"1", "2", "3", "4", "5", "6", "7", "8"};
	private static int[][] marks = { {30, 40, 50, 60, 45, 55, 65, 75}, // mark for ITD2322
	                    {80, 70, 60, 40, 34, 56, 78, 90}, // mark for ICT2422
	                    {76, 45, 67, 89, 12, 45, 67, 54}, // mark for ITD2321
	                    {56, 76, 54, 55, 50, 43, 66, 44}}; // mark for ICT2669
	private static char[][] marks2 = { {'F', 'D', 'C', 'B', 'C', 'B', 'C', 'A'}, // mark for ITD2322
	                     	{'D', 'B', 'A', 'A', 'F', 'B', 'C', 'C'}, // mark for ICT2422
	                     	{'D', 'B', 'E', 'B', 'C', 'F', 'F', 'D'}, // mark for ITD2321
                     		{'C', 'B', 'E', 'D', 'C', 'B', 'C', 'A'}}; // mark for ICT2669

  	public static void main(String[] argv) {
    	if (argv.length != 3) {
      		System.out.println("Usage: java Main5 {letter | numeric } {average | median | beststudent} <module code>");
      		System.exit(1);
    	}

    	// the main logic of this program, to be implemented by you!

  	}

  	// other methods for calculating the average mark, median and display the best student(s)
  	// have already been implemented in Stage 1 and Stage 2

}