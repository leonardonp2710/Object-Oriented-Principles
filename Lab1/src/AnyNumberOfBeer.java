import java.util.Scanner;

public class AnyNumberOfBeer {
	public static void main(String[] args) {
		Scanner anyBeer = new Scanner(System.in);
		System.out.println("Enter number of bottles:");
		
		int beerNumber = anyBeer.nextInt();
		String word = "bottles";
		
		while (beerNumber > 0) {
			System.out.println(beerNumber + " " + word + " of beer on the wall,\n\n" + beerNumber + " " + word + " of beer \n");
			beerNumber = beerNumber - 1;
			
			if (beerNumber == 1) {
				word = "bottle";
			}
			
			if (beerNumber > 0) {
				System.out.println("Take on down\n\nPass it around \n");
			}
			
			if (beerNumber == 0) {
	            System.out.println("No more bottles of beer");
	        }
		}
	}
}
