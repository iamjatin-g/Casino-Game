package CasinoGame;
import NumGame.*;
import java.util.*;
import java.io.*;
import java.net.*;
import javax.lang.model.util.ElementScanner14;
public class MainGame{
	Scanner sc = new Scanner(System.in);
	Random R_Num = new Random();
	Basic basic1 = new Basic();
	Data data1 = new Data();
	int actualNumber = R_Num.nextInt(10);
	// String userInput;
	int guess, nobal;
	boolean answer = true;
	public void NumberGame(){
		clear();
		basic1.rules();
		data1.accName();
		data1.accBalance();
		data1.ifNegBalance();
		data1.ifMoreBalance();
		if (answer) {
		    // loopGame();
		    do{
				clear();
				basic1.welcome();
				data1.yourBalance();
				data1.amountToBet();
				data1.ifGreaterAmount();
				guessNumber();
				ifSmallerGuess();
				ifGreaterGuess();
				displayNumber();
				actualGame();
				nobal = data1.ifNoBalance();
				// nobal = data1.zeroBalance();
				if(nobal == 1){
					System.out.print("\nSee you Next Time!\n");
					break;
				}
				boolean answer = askUserYN(); 
				if (!answer) {
					break;
				}
			}while(!answer);
		}
	}
	public boolean askUserYN(){
	    Scanner sc = new Scanner(System.in);
	    String userInput;
	    System.out.print("\n\nDo you want to continue?(Y or N): ");
	    userInput = sc.nextLine();

	    if (userInput.length() > 1) {
	    	System.out.println("\nError: Enter a valid input!");
	    } 
	    else{
			char ip = userInput.charAt(0);
			if (ip == 'Y' || ip == 'y') {
			    return true;
			} 
			else if (ip == 'N' || ip == 'n') {
			  	return false;
			} 
			else{
			    System.out.println("\nError: Enter a valid input!");
			}
		}
		return false;
	}
	public void displayNumber(){
		System.out.print("\nThe Winning Number was "+actualNumber);
	}
	public void actualGame(){
		if(guess==actualNumber){
			basic1.win();
			data1.winningAmount();
		}
		else{
			basic1.lose();
			data1.losingAmount();
		}
	}
	public void guessNumber(){
		System.out.print("\nGuess any Number between 1-10 : ");
		guess = sc.nextInt();
		ifSmallerGuess();
		ifGreaterGuess();
	}
	public void ifSmallerGuess(){
		if(guess<0){
			System.out.print("\nInvalid Guess!\nPlease,");
			guessNumber();
		}
	}
	public void ifGreaterGuess(){
		if(guess>10){
			System.out.print("\nInvalid Guess!\nPlease,");
			guessNumber();
		}
	}
	public void clear(){
    try{
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
    	} catch (IOException | InterruptedException ex) {}
	}
}
	// public void loopGame(){
	// 	do{
	// 			clear();
	// 			basic1.welcome();
		// while(true){
			// do{
				// clear();
				// basic1.welcome();
				// data1.yourBalance();
				// data1.amountToBet();
				// data1.ifGreaterAmount();
				// guessNumber();
				// ifSmallerGuess();
				// ifGreaterGuess();
				// displayNumber();
				// actualGame();
				// data1.ifNoBalance();
			// }while(!answer);
		// }
	// 			data1.yourBalance();
	// 			data1.amountToBet();
	// 			data1.ifGreaterAmount();
	// 			guessNumber();
	// 			ifSmallerGuess();
	// 			ifGreaterGuess();
	// 			displayNumber();
	// 			actualGame();
	// 			data1.ifNoBalance();
	// 			boolean answer = askUser();
	// 		}while(!answer);
	// }
// public class MainGame{
// 	public static void main(String[] args) {
// 		Game g1 = new Game();
// 		g1.NumberGame();
// 	}
// }
// while (true){
// do {
// 				game.play(players);
// 				validInput = false;
// 				do {
// 					System.out.print("Play again? (Y/N): ");
// 					char selection = input.nextLine().charAt(0);
// 					switch (selection) {
// 						case 'Y': case 'y':
// 							validInput = true;
// 							playAgain = true;
// 							break;
// 						case 'N': case 'n':
// 							validInput = true;
// 							playAgain = false;
// 							break;
// 						default:
// 							validInput = false;
// 							System.out.println("Invalid selection.");
// 					}
// 				} while (!validInput);
// 			} while (playAgain);
// }