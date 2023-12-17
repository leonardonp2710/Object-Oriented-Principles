import java.util.Objects;

public class Name {
	
   private String firstName;
   private String lastName;

   // getters and setters
   public String getFirstName() {
       return firstName;
   }

   public void setFirstName(String firstName) {
       this.firstName = firstName;
   }

   public String getLastName() {
       return lastName;
   }

   public void setLastName(String lastName) {
       this.lastName = lastName;
   }

   // toString method
   @Override
   public String toString() {
       return "Name{" +
               "firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               '}';
   }

   // equals method
   @Override
   public boolean equals(Object o) {
       if (this == o) return true;
       if (o == null || getClass() != o.getClass()) return false;
       Name name = (Name) o;
       return Objects.equals(firstName, name.firstName) &&
               Objects.equals(lastName, name.lastName);
   }
}
