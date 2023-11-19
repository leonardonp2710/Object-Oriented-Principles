//Leonardo de Paula - R00257446
public class Film {
	
	private String title;
	private String code;
	private static int counter = 0;

	public Film(String title) {
		this.title = title;
		this.code = generateCode();
		counter++;
	}
	
	private String generateCode() {
		return "Film" + counter;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String toString() {
		return "Film title: " + title + "\ncode: " + code;
	}
	
	public void print() {
		System.out.println("Film Title: " + title);
		System.out.println("Film Code: " + code);
	}
}
