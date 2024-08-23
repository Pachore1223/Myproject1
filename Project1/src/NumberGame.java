import java.util.Scanner;
import java.math.*;

public class NumberGame {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int trails=3;
		int finals=0;
		boolean playAgain=true;
		System.out.println("welcome a number game!!! ");
		System.out.println("your left trails " + trails +   "to win the game");
		while(playAgain) {
			int rand=getrandN(1,100);
			boolean guess=false;
			for(int i=0;i<trails;i++) {
				System.out.println((i+1)+      "Enter your guess number");
				int user=sc.nextInt();
				if(user==rand) {
					guess=true;
					finals+=1;
					System.out.println("you Won a game ");
					break;
				}
				else if(user>rand){
					System.out.println("you guess a high number");
					
					}
				else {
					System.out.println("you guees a low number");
					
				}
			}
			if(guess==false) {
				System.out.println("sorry you loose the game. A number is "+rand);
				
			}
			System.out.println("DO you want play a game");
			String again=sc.next();
			playAgain=again.equalsIgnoreCase("Y");
			}
		System.out.println("I hope you enjoy it ");
		System.out.println("your score"+finals);
	}
		public  static int getrandN(int min , int max){
			return(int)(Math.random()*(max-min+1)+min);
		}

		
	}

