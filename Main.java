public class Main {
	public static void main (String [] args){
		//Print all even  and odd numbers frrom rangeMin to rangeMax in two seperate lines. 
		//Practing using 'Continue' keyword in Java Loops to skip current reiteration.
		//Unecessary and complicated syntax exists, juust to practice them.
		//Readibliity was not kept in mind, more focus was on using what had been learned. 
		//Spelling was also not worried about I was doing this fast to test my logic
		
		int rangeMin = 0;
		int rangeMax = 20;
		int counter= rangeMin;
		String lineBreak = "----------------------------------------------------";
		
		for (int i = 0; i < 2; i++) System.out.println();
				
				
		for (int i = 0; i < 2; i++) System.out.println(lineBreak);
		
		//1x Line Break
		for (int l = 0; l < 1; l++) System.out.println(); //Practicing syntax. This is totally unecessary and hurts readablity.
		
		System.out.println("Odd and Even Numbers between " + rangeMin + " and " + rangeMax + " (inlcusive)." );
		
		//1x Line Break
		for (int l = 0; l < 1; l++) System.out.println(); //Practicing syntax. This is totally unecessary and hurts readablity. "System.out.println();" works. Obviously.
		
		//Even Num
		System.out.println("Even Numbers");
		while (counter != rangeMax + 1) {
			if (counter % 2 == 0){
				System.out.print(counter);
				if (counter == rangeMax){
					System.out.print(".");
					for (int l = 0; l < 2; l++) System.out.println(); //Practicing syntax. This is totally unecessary and hurts readablity.  
				} else {
					System.out.print(", ");
				}
				counter++;
			} else {
				counter++;
				continue;
			}
		}
		
		counter = rangeMin; //Reset!
		
		//Odd Num
		System.out.println("Odd Numbers");
		while (counter != rangeMax + 1) {
			if (counter % 2 != 0){
				System.out.print(counter);
				if (counter == rangeMax - 1){
					System.out.print(".");
				} else {
					System.out.print(", ");
				}
				counter++;
			} else {
				counter++;
				continue;
			}
		}
		//2x Line Break
		for (int l = 0; l < 2; l++) System.out.println(); //Practicing syntax. This is totally unecessary and hurts readablity.
		
		for (int i = 0; i < 2; i++) System.out.println(lineBreak);
		
		for (int i = 0; i < 2; i++) System.out.println();
		
	}	
}	
