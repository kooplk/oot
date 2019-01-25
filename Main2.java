import java.util.*;

public class Main2 {
  // Test Data for the program
  	private static String[] moduleCode = {"ITD2322", "ICT2422", "ITD2321", "ICT2669"};
	private static String[] studentID = {"1", "2", "3", "4", "5", "6", "7", "8"};
	private static char[][] marks = { {'F', 'D', 'C', 'B', 'C', 'B', 'C', 'A'}, // mark for ITD2322
	                     {'D', 'B', 'A', 'A', 'F', 'B', 'C', 'C'}, // mark for ICT2422
	                     {'D', 'B', 'E', 'B', 'C', 'F', 'F', 'D'}, // mark for ITD2321
	                     {'C', 'B', 'E', 'D', 'C', 'B', 'C', 'A'}}; // mark for ICT2669

  	public static void main(String[] argv) {
    	if (argv.length != 2) {
      		System.out.println("Usage: java Main2 {average | median | beststudent} module <module code>");
      		System.exit(1);
    	}else {
			String a = argv[0];
			String mCode = argv[1];
			switch (a.toLowerCase()) {
				case "average":
					System.out.println("Averge for " + mCode + " : " + calculateModuleAverageMark(mCode));
					break;

				case "median":
					System.out.println("Median for " + mCode + " : " + calculateModuleMedian(mCode));
					break;

				case "beststudent":
					displayBestStudent(mCode);
					break;
			}
		}

    	// if the user wants to find the average mark of a module,
		// call the calculateModuleAverageMark method and show the result in DOS prompt

		// else if the user wants to find the median mark of a module,
		// call the calculateModuleMedian method and show the result in DOS prompt

		// else if the user wants to find the best students (may have more than 1 best student) of a module,
		// call the displayBestStudent method

    	// else show the message on how to run the program in DOS prompt and exit the program
  	}

  	public static double calculateModuleAverageMark(String mCode) {

    	// return the average mark of a module (module code as input parameter "mCode")
    	// numeric average mark is to be returned (since 'A' -> 5, 'B' -> 4, 'C' -> 3 etc..)

		double sum = 0,avg = 0;
		int index =  getModuleIndex(mCode);
		for(int i =0; i<marks[index].length;i++){
			sum+=letterToNumeric((marks[index][i]));
		}
		avg=(sum/(marks[index].length));
		return avg;

  	}

  	public static double calculateModuleMedian(String mCode) {

		// return the median mark of a module (module code as input parameter "mCode")
		// numeric median mark is to be returned (since 'A' -> 5, 'B' -> 4, 'C' -> 3 etc..)

		int index = getModuleIndex(mCode);
		int arraySize = marks[index].length;
		char tmpMarks[] = new char [arraySize];
		int medIndex,medIndex_sec;
		double median;
		for(int i=0;i<arraySize;i++){
			tmpMarks[i]=marks[index][i];
		}
		Arrays.sort(tmpMarks);
		if(arraySize%2==0){
			medIndex = ((arraySize/2)-1);
			medIndex_sec = ((arraySize/2));
			median = ((letterToNumeric(tmpMarks[medIndex])+letterToNumeric(tmpMarks[medIndex_sec]))/2);
		}else{
			medIndex=Math.round((arraySize/2));
			median = letterToNumeric(tmpMarks[medIndex]);

		}

		return  median;
  	}

  	public static void displayBestStudent(String mCode) {

    	// find the highest mark of a module (module code as input parameter "mCode")
		// then find the studentID(s) of student(s) with the highest mark
		// show the above information in DOS prompt

		// numeric highest mark is to be returned (since 'A' -> 5, 'B' -> 4, 'C' -> 3 etc..)

		int index = getModuleIndex(mCode);
		int maxMarks=letterToNumeric(marks[index][0]);
		System.out.println("In module "+moduleCode[index]+", the following students perform the best: ");
		for(int i=0;i<marks[index].length;i++){
			if(letterToNumeric(marks[index][i])>maxMarks)
				maxMarks=letterToNumeric(marks[index][i]);
		}
		for(int i=0;i<marks[index].length;i++){
			if(maxMarks==letterToNumeric(marks[index][i]))
				System.out.print("Student "+studentID[i]+" ");
		}

	}



  	public static int getModuleIndex(String mCode) {

    	// return the index of a module (module code as input parameter "mCode") in the array of moduleCode

		// You may need to call this method when you want to find the average mark, the median
		// or the best student of a module.
		int codeM = 0;

		switch(mCode){

			case"ITD2322":
				codeM =0;
				break;

			case"ICT2422":
				codeM =1;
				break;

			case"ITD2321":
				codeM =2;
				break;

			case"ICT2669":
				codeM =3;
				break;

		}
		return codeM;
	}

  	public static int letterToNumeric(char grade) {

	    // convert and return a numeric mark from a grade (grade as input pararmeter "grade")

	    // you need to call this method before doing any calculations on marks

		int num = 0;

		switch(grade){
			case 'A':
				num = 5;
				break;

			case 'B':
				num = 4;
				break;

			case 'C':
				num = 3;
				break;

			case 'D':
				num = 2;
				break;

			case 'F':
				num = 0;
				break;
		}
		return num;

  	}
}