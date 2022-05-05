package NumGame;
import java.util.*;
import java.io.*;
import java.net.*;
 
public class Data{
	Scanner sc = new Scanner(System.in);
	String name, balance;
	int integerBalance, amount, temp;
	public void accName(){
		System.out.print("\n  Please, Enter Your Name : ");
		name = sc.nextLine();
	}
	public void accBalance(){
		System.out.print("  Please, Enter the starting balance to play the game : $");
		balance = sc.nextLine();
		try 
		{ 
			integerBalance = Integer.parseInt(balance);
			ifNegBalance();
			ifMoreBalance();
		}  
		catch (NumberFormatException e)  
		{ 
			System.out.println("--> Please Enter a Valid Amount!");
			accBalance();
		} 
		
	}
	public void yourBalance(){
		System.out.print("\n  Your Balance is : $"+balance);
	}
	public void ifMoreBalance(){
		if(integerBalance>1000){
			System.out.println("--> Balance cannot be more than $1000");
			accBalance();
		}
	}
	public void ifNegBalance(){
		if(integerBalance<0){
			System.out.print("\n  Invalid Balance!\n  Please Enter a valid Balance to play the game.");
			accBalance();
		}
	}
	public int ifNoBalance(){
		if(integerBalance==0){
			System.out.print("\n\n  Oops, You Don't have enough balance to play!\n");
			return 1;
		}
		return 5;
	}
	public void amountToBet(){
		System.out.print("\n\n  Hey " + name + ", please enter the amount to bet : $");
		amount = sc.nextInt();
		ifNegAmount();
		ifGreaterAmount();
	}
	public void losingAmount(){
		integerBalance-=amount;
		System.out.print("\n  Your Balance is : $"+integerBalance);
	}
	public void winningAmount(){
		temp = 10 * amount;
		integerBalance += temp; 
		System.out.print("\n  Your Balance is : $"+integerBalance);
	}
	public void ifGreaterAmount(){
		if(amount>integerBalance){
			System.out.print("\n  Invalid Amount!\n  Please Enter a valid Balance to play the game.");
			amountToBet();
		}
	}
	public void ifNegAmount(){
		if(amount<0){
			System.out.print("\n  Invalid Amount!\n  Please Enter a valid Balance to play the game.");
			amountToBet();
		}
	}
}