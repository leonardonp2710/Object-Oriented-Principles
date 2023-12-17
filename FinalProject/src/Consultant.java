import java.util.List;
import java.util.Objects;

public class Consultant extends Person {
  private List<Patient> patients;
  private String expertise;

  // getters and setters
  public List<Patient> getPatients() {
      return patients;
  }

  public void setPatients(List<Patient> patients) {
      this.patients = patients;
  }

  public String getExpertise() {
      return expertise;
  }

  public void setExpertise(String expertise) {
      this.expertise = expertise;
  }

  // operations
  public void addPatient(Patient patient) {
      this.patients.add(patient);
  }

  public void addPatientVisit(String patientId, Visit visit) {
      Patient patient = findPatient(patientId);
      if (patient != null) {
          patient.addVisit(visit);
      }
  }

  private Patient findPatient(String patientId) {
	// TODO Auto-generated method stub
	return null;
}

public void showAllPatients() {
      for (Patient patient : this.patients) {
          System.out.println(patient);
      }
  }

  public void showAllPatientsAndVisits() {
      for (Patient patient : this.patients) {
          System.out.println(patient);
          for (Visit visit : patient.getVisits()) {
              System.out.println(visit);
          }
      }
  }

  // toString method
  @Override
  public String toString() {
      return "Consultant{" +
              "name=" + name +
              ", id='" + id + '\'' +
              ", phone='" + phone + '\'' +
              ", expertise='" + expertise + '\'' +
              ", patients=" + patients +
              '}';
  }

  // equals method
  @Override
  public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Consultant consultant = (Consultant) o;
      return Objects.equals(name, consultant.name) &&
              Objects.equals(id, consultant.id) &&
              Objects.equals(phone, consultant.phone) &&
              Objects.equals(expertise, consultant.expertise) &&
              Objects.equals(patients, consultant.patients);
  }
}
