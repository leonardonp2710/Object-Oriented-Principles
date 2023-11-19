//Leonardo de Paula - R00257446
public class Game {
	
	private String title;
	private String genre;
	private int players;
	
	public Game(String title, String genre, int players){
		this.title = title;
		this.genre = genre;
		this.players = players;
	}
	
		
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getPlayers() {
		return players;
	}
	public void setPlayers(int players) {
		this.players = players;
	}
	
	public String toString() {
		return "title: " + title + "\ngenre: " + genre + "\nplayers: " + players;
	}
	
	public void Print(){
		System.out.println("Title: " + getTitle() + "\nGenre: " + getGenre() + "\nPlayers: " + getPlayers());
	}
	
	
}
