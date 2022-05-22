package NumGame;
import java.util.*;
import java.io.*;
import java.net.*;
 
public class Data{
	Scanner sc = new Scanner(System.in);
	String name, balance, amount;
	int integerBalance, integerAmount, temp;
	public void accName(){
		System.out.print("\n  Please, Enter Your Name : ");
		name = sc.nextLine();
	}
	public void accBalance(){
		System.out.print("\n  Please, Enter the starting balance to play the game : $");
		balance = sc.nextLine();
		validateBalance();
		validBalance();
	}
	public void amountToBet(){
		System.out.print("\n\n  Hey " + name + ", please enter the amount to bet : $");
		amount = sc.nextLine();
		validateAmount();
		validAmount();
	}
	public void validateBalance(){
		try{ 
			integerBalance = Integer.parseInt(balance);
			validBalance();
		}  
		catch (NumberFormatException e){ 
			invalidInput();
			accBalance();
		}
	}
	public void validateAmount(){
		try{ 
			integerAmount = Integer.parseInt(amount);
			validAmount();
		}  
		catch (NumberFormatException e){ 
			invalidInput();
			amountToBet();
		}
	}
	public void validBalance(){
		if(integerBalance>1000){
			System.out.println("--> Balance cannot be more than $1000");
			accBalance();
		}
		else if(integerBalance<=0){
			invalidInput();
			accBalance();
		}
	}
	public void validAmount(){
		if(integerAmount>integerBalance){
			invalidInput();
			amountToBet();
		}
		else if(integerAmount<=0){
			invalidInput();
			amountToBet();
		}
	}
	public int ifNoBalance(){
		if(integerBalance==0){
			System.out.print("\n\n  Oops, You Don't have enough balance to play!\n");
			return 1;
		}
		return 5;
	}
	public void losingAmount(){
		integerBalance -= integerAmount;
		System.out.print("\n  Your Balance is : $"+integerBalance);
	}
	public void winningAmount(){
		temp = 10 * integerAmount;
		integerBalance += temp;
		System.out.print("\n  Your Balance is : $"+integerBalance);
	}
	public void yourBalance(){
		System.out.print("\n  Your Balance is : $"+integerBalance);
	}
	public void invalidInput(){
		System.out.print("\n  --> Invalid Input!\n  --> Please Enter a valid input to play the game.\n");
	}
}