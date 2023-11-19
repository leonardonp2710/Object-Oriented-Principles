//Leonardo de Paula - R00257446
public class Actor {
	
	private String name;
	private int age;
	private String town;
	private Film[] films;

	public Actor(String name, int age, String town, Film[] films) {
		this.name = name;
		this.age = age;
		this.town = town;
		this.films = films;
	}

	public String getName() {
		return name;
	}
   
	public void setName(String name) {
		this.name = name;
   	}
   
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public Film[] getFilms() {
		return films;
	}
	
	public void setFilms(Film[] films) {
		this.films = films;
	}
	
	public String toString() {
		return "Actor name: " + name + "\nage: " + age + "\ntown: " + town + "\nfilms: " + films;
	}

	public void print() {
		System.out.println("Actor Name: " + name);
		System.out.println("Actor Age: " + age);
		System.out.println("Actor Town: " + town);
		System.out.println("Actor Films: ");
		for (Film film : films) {
		  film.print();
		}
	}
}
