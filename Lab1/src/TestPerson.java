public class TestPerson {

	public static void main(String[] args) {
		Person person = new Person(5, "083 344 2838", "Jack");
		
		System.out.println(person.setName("Leo"));
		System.out.println(person.getName());
	
		person.setJumpCount(5);
	
		person.printDetails();
				
		
		
	}

}
