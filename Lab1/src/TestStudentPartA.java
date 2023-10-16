import java.util.Scanner;

public class TestStudentPartA {
	public static void main(String[] args) {
		
		String[] names;
		names = new String[20];
		
		String[] surnames;
		surnames = new String[20];
		
		double[] marks;
		marks = new double[20];
		
		for(int i = 0; i < 19; i++) {
			System.out.println("Enter the student name: nº "+(i+1));
			names[i] = new Scanner(System.in).nextLine();
			
			System.out.println("Enter the student surname: nº "+(i+1));
			surnames[i] = new Scanner(System.in).nextLine();
			
			System.out.println("Enter the student grade: nº "+(i+1));
			marks[i] = new Scanner(System.in).nextDouble();
		}
		
		for(int i = 0; i < 19; i++) {
			
			if(marks[i] >= 0 && marks[i] < 39) {
				System.out.println(names[i] + " " + surnames[i] + " received a Fail for his mark of " + marks[i]);
			}
			
			if(marks[i] >= 40 && marks[i] < 64) {
				System.out.println(names[i] + " "+ surnames[i] + " received a Pass for his mark of " + marks[i]);
			}
			
			if(marks[i] >= 65 && marks[i] < 84) {
				System.out.println(names[i] + " "+ surnames[i] + " received a Merit for his mark of " + marks[i]);
			}
			
			if(marks[i] >= 85 && marks[i] < 100) {
				System.out.println(names[i] + " "+ surnames[i] + " received a Distinction for his mark of " + marks[i]);
			}
		}		
	
	}
	
}
