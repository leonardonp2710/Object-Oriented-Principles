
public class Person {
	private int stars;
	private String phone;
	private String name;
	
	private String jump = "I jumped";
	private int jumpCount;
	
	public Person(int stars, String phone, String name) {
		this.stars = stars;
		this.phone = phone;
		this.name = name;
	}
	
	public String toString() {
		return "Stars: " + stars + "\nPhone: " + phone + "\nName: " + name;
	}
	
	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJump() {
		return jump;
	}
		
	public int getJumpCount() {
		return jumpCount;
	}
	
	public void setJumpCount(int jumpCount) {
		this.jumpCount = jumpCount;
		
	}
	
	public void printDetails() {
		System.out.println("\n" + getJump());
		System.out.println("I jumped " + getJumpCount() + " times!");
	}
}

