public class BeerSong {
	public static void main(String[] args) {
		int beerNumber = 99;
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
