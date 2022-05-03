package NumGame;
import java.util.*;
import java.io.*;
import java.net.*;

public class Data{
	Scanner sc = new Scanner(System.in);
	String name;
	int balance, amount;
	public void accName(){
		System.out.print("\nPlease, Enter Your Name : ");
		name = sc.nextLine();
	}
	public void accBalance(){
		System.out.print("\nPlease, Enter the starting balance to play the game : $");
		balance = sc.nextInt();
		ifNegBalance();
		ifMoreBalance();
	}
	public void yourBalance(){
		System.out.print("\nYour Balance is : $"+balance);
	}
	public void ifMoreBalance(){
		if(balance>1000){
			System.out.print("\nBalance cannot be more than $1000");
			accBalance();
		}
	}
	public void ifNegBalance(){
		if(balance<0){
			System.out.print("\nInvalid Balance!\nPlease Enter a valid Balance to play the game.");
			accBalance();
		}
	}
	public int ifNoBalance(){
		if(balance==0){
			System.out.print("\n\nOops, You Don't have enough balance to play!\n");
			return 1;
		}
		return 5;
	}
	// public int zeroBalance(){
	// 	ifNoBalance();
	// 	return 1;
	// }
	public void amountToBet(){
		System.out.print("\n\nHey " + name + ", please enter the amount to bet : $");
		amount = sc.nextInt();
		ifNegAmount();
		ifGreaterAmount();
	}
	public void losingAmount(){
		balance-=amount;
		System.out.print("\nYour Balance is : $"+balance);
	}
	public void winningAmount(){
		balance = 10 * amount;
		System.out.print("\nYour Balance is : $"+balance);
	}
	public void ifGreaterAmount(){
		if(amount>balance){
			System.out.print("\nInvalid Amount!\nPlease Enter a valid Balance to play the game.");
			amountToBet();
		}
	}
	public void ifNegAmount(){
		if(balance<0){
			System.out.print("\nInvalid Amount!\nPlease Enter a valid Balance to play the game.");
			amountToBet();
		}
	}
}