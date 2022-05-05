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
	String guess, input;
	int integerGuess, nobal, integerInput;
	public void NumberGame(){
		clear();
		basic1.rules();
		data1.accName();
		data1.accBalance();
		do{
			clear();
			basic1.welcome();
			data1.yourBalance();
			data1.amountToBet();
			actualNumber = R_Num.nextInt(10);
			guessNumber();
			displayNumber();
			actualGame();
			nobal = data1.ifNoBalance();
			if(nobal == 1){
				System.out.println("  --> Thanks for Playing!\n  --> See you Next Time!\n");
				break;
			}
			accInput();
		}while(integerInput==1);
	}
	public void accInput(){
		System.out.print("\n\n  --> Do you want to play again?\n  --> 1.Yes\n  --> 2.No\n  --> Enter (1/2) here : ");
		input = sc.nextLine();
		validateInput();
		// validInput();
	}
	public void validateInput(){
		try{ 
			integerInput = Integer.parseInt(input);
			validInput();
		}  
		catch (NumberFormatException e){ 
			data1.invalidInput();
			accInput();
		}
	}
	public void validInput(){
		if(integerInput<1){
			data1.invalidInput();
			accInput();
		}
		else if(integerInput>2){
			data1.invalidInput();
			accInput();
		}
		else if(integerInput==2){
			System.out.println("\n\n  --> Thanks for Playing!\n      See you Next Time :)\n");
		}
	}
	public void actualGame(){
		if(integerGuess==actualNumber){
			basic1.win();
			data1.winningAmount();
		}
		else{
			basic1.lose();
			data1.losingAmount();
		}
	}
	public void displayNumber(){
		System.out.println("\n  --> The Winning Number was "+actualNumber);
	}
	public void guessNumber(){
		System.out.print("\n  Guess any Number between 0-10 : ");
		guess = sc.nextLine();
		validateGuess();
		validGuess();
	}
	public void validateGuess(){
		try{ 
			integerGuess = Integer.parseInt(guess);
			validGuess();
		}  
		catch (NumberFormatException e){ 
			data1.invalidInput();
			guessNumber();
		}
	}
	public void validGuess(){
		if(integerGuess<0){
			System.out.print("\n  --> Invalid Guess!\n Please,");
			guessNumber();
		}
		else if(integerGuess>10){
			System.out.print("\n  --> Invalid Guess!\n  Please,");
			guessNumber();
		}
	}
	public void clear(){
	    try{
	        if (System.getProperty("os.name").contains("Windows"))
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        else
	            Runtime.getRuntime().exec("clear");
	    	} 
	    catch (IOException | InterruptedException ex) {}
	}
}