import java.time.LocalDate;
import java.util.Objects;

public class Visit {
  private LocalDate dateOfVisit;
  private String notes;

  // getters and setters
  public LocalDate getDateOfVisit() {
      return dateOfVisit;
  }

  public void setDateOfVisit(LocalDate dateOfVisit) {
      this.dateOfVisit = dateOfVisit;
  }

  public String getNotes() {
      return notes;
  }

  public void setNotes(String notes) {
      this.notes = notes;
  }

  // toString method
  @Override
  public String toString() {
      return "Visit{" +
              "dateOfVisit=" + dateOfVisit +
              ", notes='" + notes + '\'' +
              '}';
  }

  // equals method
  @Override
  public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Visit visit = (Visit) o;
      return Objects.equals(dateOfVisit, visit.dateOfVisit) &&
              Objects.equals(notes, visit.notes);
  }
}
