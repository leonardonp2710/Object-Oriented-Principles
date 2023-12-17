import java.util.ArrayList;
import java.util.List;

public class Practice {
	
	private List<Consultant> consultants;

	   public Practice() {
	       this.consultants = new ArrayList<>();
	   }

	   // getter and setter for consultants
	   public List<Consultant> getConsultants() {
	       return consultants;
	   }

	   public void setConsultants(List<Consultant> consultants) {
	       this.consultants = consultants;
	   }

	   // operations
	   public void addConsultant(Consultant consultant) {
	       this.consultants.add(consultant);
	   }

	   public List<Consultant> showConsultantList() {
	       return this.consultants;
	   }

	   public Consultant findConsultant(String id) {
	       for (Consultant consultant : this.consultants) {
	           if (consultant.getId().equals(id)) {
	               return consultant;
	           }
	       }
	       return null;
	   }

	   public void showDetailsForAllConsultants() {
	       for (Consultant consultant : this.consultants) {
	           System.out.println(consultant);
	       }
	   }

	   // Add a patient to a consultant
	   public void addPatientToConsultant(String consultantId, Patient patient) {
	       Consultant consultant = findConsultant(consultantId);
	       if (consultant != null) {
	           consultant.addPatient(patient);
	       }
	   }

	   // Find a patient
	   public Patient findPatient(String patientId) {
	       for (Consultant consultant : this.consultants) {
	           for (Patient patient : consultant.getPatients()) {
	               if (patient.getId().equals(patientId)) {
	                  return patient;
	               }
	           }
	       }
	       return null;
	   }
}
