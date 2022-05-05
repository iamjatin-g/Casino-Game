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
	int guess, nobal, i;
	public void NumberGame(){
		clear();
		basic1.rules();
		data1.accName();
		data1.accBalance();
		data1.ifNegBalance();
		data1.ifMoreBalance();
		do{
			clear();
			basic1.welcome();
			data1.yourBalance();
			data1.amountToBet();
			data1.ifGreaterAmount();
			actualNumber = R_Num.nextInt(10);
			guessNumber();
			ifSmallerGuess();
			ifGreaterGuess();
			displayNumber();
			actualGame();
			nobal = data1.ifNoBalance();
			if(nobal == 1){
				System.out.print("\n  See you Next Time!\n");
				break;
			}
			accInput();
		}while(i==1);
	}
	public void accInput(){
		System.out.print("\n\n  -->Do you want to play again?\n  1.Yes\n  2.No\n  Enter (1/2) here : ");
		i = sc.nextInt();
		checkInput();
	}
	public void checkInput(){
		if(i<1){
			System.out.print("\n  Invalid Input!\n  Please, Enter Valid Input!");
			accInput();
		}
		else if(i>2){
			System.out.print("\n  Invalid Input!\n  Please, Enter Valid Input!");
			accInput();
		}
	}
	public void displayNumber(){
		System.out.print("\n  The Winning Number was "+actualNumber);
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
		System.out.print("\n  Guess any Number between 1-10 : ");
		guess = sc.nextInt();
		ifSmallerGuess();
		ifGreaterGuess();
	}
	public void ifSmallerGuess(){
		if(guess<0){
			System.out.print("\n Invalid Guess!\n Please,");
			guessNumber();
		}
	}
	public void ifGreaterGuess(){
		if(guess>10){
			System.out.print("\n Invalid Guess!\n  Please,");
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