import java.util.List;
import java.util.Objects;

public class Patient extends Person {
  private List<Visit> visits;
  private String illness;
  private int severity;

  // getters and setters
  public List<Visit> getVisits() {
      return visits;
  }

  public void setVisits(List<Visit> visits) {
      this.visits = visits;
  }

  public String getIllness() {
      return illness;
  }

  public void setIllness(String illness) {
      this.illness = illness;
  }

  public int getSeverity() {
      return severity;
  }

  public void setSeverity(int severity) {
      this.severity = severity;
  }

  // operations
  public void addVisit(Visit visit) {
      this.visits.add(visit);
  }

  public void showAllVisits() {
      for (Visit visit : this.visits) {
          System.out.println(visit);
      }
  }

  // toString method
  @Override
  public String toString() {
      return "Patient{" +
              "name=" + name +
              ", id='" + id + '\'' +
              ", phone='" + phone + '\'' +
              ", illness='" + illness + '\'' +
              ", severity=" + severity +
              ", visits=" + visits +
              '}';
  }

  // equals method
  @Override
  public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Patient patient = (Patient) o;
      return Objects.equals(name, patient.name) &&
              Objects.equals(id, patient.id) &&
              Objects.equals(phone, patient.phone) &&
              Objects.equals(illness, patient.illness) &&
              Objects.equals(severity, patient.severity) &&
              Objects.equals(visits, patient.visits);
  }
}