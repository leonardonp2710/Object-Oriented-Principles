//Leonardo de Paula - R00257446
public class ActorFilmTest {
   public static void main(String[] args) {
       Film[] films = new Film[3];
       films[0] = new Film("The Terminator");
       films[1] = new Film("Twins");
       films[2] = new Film("Jingle All The Way");
       
       Film[] films1 = new Film[3];
       films1[0] = new Film("The Godfather");
       films1[1] = new Film("Heat");
       films1[2] = new Film("War with Grandpa");

       Actor actor1 = new Actor("Arnold Schwarzenegger", 76, "California", films);
       actor1.print();

       Actor actor2 = new Actor("Robert De Niro", 80, "California", films1);
       actor2.print();
       
   }
}
