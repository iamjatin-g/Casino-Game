package NumGame;
import java.util.*;
import java.io.*;
import java.net.*;
 
public class Data{
	Scanner sc = new Scanner(System.in);
	String name;
	int balance, amount, temp;
	public void accName(){
		System.out.print("\n  Please, Enter Your Name : ");
		name = sc.nextLine();
	}
	public void accBalance(){
		System.out.print("\n  Please, Enter the starting balance to play the game : $");
		balance = sc.nextInt();
		ifNegBalance();
		ifMoreBalance();
	}
	public void yourBalance(){
		System.out.print("\n  Your Balance is : $"+balance);
	}
	public void ifMoreBalance(){
		if(balance>1000){
			System.out.print("\n  Balance cannot be more than $1000");
			accBalance();
		}
	}
	public void ifNegBalance(){
		if(balance<0){
			System.out.print("\n  Invalid Balance!\n  Please Enter a valid Balance to play the game.");
			accBalance();
		}
	}
	public int ifNoBalance(){
		if(balance==0){
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
		balance-=amount;
		System.out.print("\n  Your Balance is : $"+balance);
	}
	public void winningAmount(){
		temp = 10 * amount;
		balance += temp; 
		System.out.print("\n  Your Balance is : $"+balance);
	}
	public void ifGreaterAmount(){
		if(amount>balance){
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