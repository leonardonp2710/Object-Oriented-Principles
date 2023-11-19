//Leonardo de Paula - R00257446
public class TestGame { // Starting Class TestGame

	public static void main(String[] args) { // Starting main program

		Game game1 = new Game(null, null, 0); // New Object created
        game1.setTitle("Call of Duty"); // creating Title
        game1.setGenre("Action"); // creating Genre
        game1.setPlayers(3); // creating Players
        game1.Print(); //Execute Class Print() for game1
        
        
        Game gm2 = new Game("Mines", "Puzzle", 3); // New Object created
        gm2.Print(); // Execute Class Print() for gm2

	}

}
