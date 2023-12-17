import java.util.Objects;

public class Person {
	
	protected Name name;
	protected String id;
	protected String phone;

   // getters and setters
	public Name getName() {
		return name;
   }

   public void setName(Name name) {
	   this.name = name;
   }

   public String getId() {
       return id;
   }

   public void setId(String id) {
       this.id = id;
   }

   public String getPhone() {
       return phone;
   }

   public void setPhone(String phone) {
       this.phone = phone;
   }

   // toString method
   @Override
   public String toString() {
       return "Person{" +
               "name=" + name +
               ", id='" + id + '\'' +
               ", phone='" + phone + '\'' +
               '}';
   }

   // equals method
   @Override
   public boolean equals(Object o) {
       if (this == o) return true;
       if (o == null || getClass() != o.getClass()) return false;
       Person person = (Person) o;
       return Objects.equals(name, person.name) &&
               Objects.equals(id, person.id) &&
               Objects.equals(phone, person.phone);
   }
}
