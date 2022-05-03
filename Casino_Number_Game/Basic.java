package NumGame;
public class Basic{
	public static void rules(){
		System.out.println("\n\t\t======== WELCOME TO CASINO NUMBER GAME =======\n\n"+
			"\n\t\t======== CASINO NUMBER GAME RULES! ===========\n\n"+
			"\t1. Choose a number between 1 to 10.\n"+
			"\t2. Winner gets 10 times of the money bet.\n"+
    		"\t3. Wrong bet, and you lose the amount you bet.\n"+
			"\t4. Chances of winning this game is 1%.\n"+
			"\t5. Balance cannot be more than 1000.\n\n");
	}
	public void welcome(){
		System.out.println("\n\t\t======== WELCOME TO CASINO NUMBER GAME =======\n");
	}
	public void win(){
		System.out.print("\n\n  Congratulations, You've won the Jackpot!");
	}
	public void lose(){
		System.out.print("\n\n  Better Luck Next Time!");
	}
}