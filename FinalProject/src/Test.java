import java.time.LocalDate;
import java.util.Scanner;

public class Test {
   public static void main(String[] args) {
       Practice practice = new Practice();
       Scanner scanner = new Scanner(System.in);
       int choice;

       do {
           System.out.println("1. Record a Patient visit.");
           System.out.println("2. Display all patients of a particular Consultant.");
           System.out.println("3. Display all Consultants followed by their Patients followed by their visits.");
           System.out.println("4. Load information from a text file.");
           System.out.println("5. Quit");
           System.out.print("Enter your choice: ");
           choice = scanner.nextInt();

           switch (choice) {
               case 1:
	    	       System.out.println("Enter Patient ID:");
	    	       String patientId = scanner.next();
	    	       Patient patient = practice.findPatient(patientId);
	    	       if (patient == null) {
	    	           System.out.println("Patient not found. Please enter a valid ID.");
	    	       } else {
	    	           System.out.println("Enter Consultant ID:");
	    	           String consultantId = scanner.next();
	    	           Consultant consultant = practice.findConsultant(consultantId);
	    	           if (consultant == null) {
	    	               System.out.println("Consultant not found. Please enter a valid ID.");
	    	           } else {
	    	               System.out.println("Enter date of visit (yyyy-mm-dd):");
	    	               String dateStr = scanner.next();
	    	               LocalDate dateOfVisit = LocalDate.parse(dateStr);
	    	               System.out.println("Enter notes for the visit:");
	    	               String notes = scanner.next();
	    	               Visit visit = new Visit();
	    	               consultant.addPatientVisit(patientId, visit);
	    	               System.out.println("Visit recorded successfully.");
	    	           }
	    	       }
	    	       break;
               case 2:
        	      System.out.println("Enter Consultant ID:");
        	      String consultantId = scanner.next();
        	      Consultant consultant = practice.findConsultant(consultantId);
        	      if (consultant == null) {
        	          System.out.println("Consultant not found. Please enter a valid ID.");
        	      } else {
        	          System.out.println("Patients of Consultant " + consultant.getName().getFirstName() + " " + consultant.getName().getLastName() + ":");
        	          for (Patient newPatient : consultant.getPatients()) {
        	              System.out.println(newPatient);
        	          }
        	      }
        	      break;
               case 3:
        	      System.out.println("All Consultants and their Patients:");
        	      for (Consultant newConsultant : practice.getConsultants()) {
        	          System.out.println(newConsultant);
        	          for (Patient newPatient : newConsultant.getPatients()) {
        	              System.out.println(newPatient);
        	              for (Visit visit : newPatient.getVisits()) {
        	                 System.out.println(visit);
        	              }
        	          }
        	      }
        	      break;
               case 4:
        	      System.out.println("Load information from a text file");
        	      // Code to load information from a text file
        	      break;
               case 5:
        	      System.out.println("Exiting the program.");
        	      break;
               default:
            	   System.out.println("Invalid choice. Please enter a number between 1 and 5.");
           }
       } while (choice != 5);

       scanner.close();
   }
}
