import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentGrades {

	public static void main(String[] args) {
		//arraylist initialization
		List<Integer> grades = new ArrayList<Integer>();
		//setting quit value for program to recognize
		Integer quit = -1;
		//creating scanner
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a grade or -1 to quit: ");
		while(true) {
			//scanner input
		Integer input = scan.nextInt();
			if(input == quit) {
				//if -1 is entered
			System.out.println(grades);
			double total = 0;
			double avg = 0;
			//average calculation
			for(int i = 0; i < grades.size(); i++) {
				total += grades.get(i);
				avg = total / grades.size();
			}
			//printing average and determining how many values were greater
			System.out.println("The student's average is: "+ avg);
			int greater = 0;
			for(int j = 0; j < grades.size(); j++) {
				if(grades.get(j) > avg) {
					greater++;
				}
			}
			System.out.println("There were " + greater + " grades higher than the average.");
			System.exit(0);
			}else {
				//adding integer to arraylist
				System.out.print("Enter a grade or -1 to quit: ");
				grades.add(input);
			}
		
		
	}
	
	
}
}
