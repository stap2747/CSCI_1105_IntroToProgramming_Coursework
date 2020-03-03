/*
 * Shawn Stapel
 * 3/2/2020
 * Java final Project
 * Blackjack Game
 */

import java.util.Scanner;

public class blackjackgame {

	public static void main(String[] args) {
		int[][] deck = {
				{1,1,1,1},
				{2,2,2,2},
				{3,3,3,3},
				{4,4,4,4},
				{5,5,5,5},
				{6,6,6,6},
				{7,7,7,7},
				{8,8,8,8},
				{9,9,9,9},
				{10,10,10,10},
				{10,10,10,10},
				{10,10,10,10},
				{10,10,10,10},
		};


		for (int i = 0; i < deck.length; i++) {
			for (int j = 0; j < deck[i].length; j++) {
				int i1 = (int)((Math.random() * deck.length));
				int j1 = (int)((Math.random() * deck[i].length));

				// Swap matrix[i][j] with matrix[i1][j1]
				int shuffledeck = deck[i][j];
				deck[i][j] = deck[i1][j1]; 
				deck[i1][j1] = shuffledeck;


			}
		}

		game(deck);


	}

	public static void game(int[][] shuffledeck) {
		int playercard1 = shuffledeck[0][0];
		int dealercard1 = shuffledeck[0][1];

		System.out.println("Your first card is " + playercard1);
		System.out.println("The dealer's card is " + dealercard1);

		int playercard2 = shuffledeck[0][2];
		int dealercard2 = shuffledeck[0][3];

		System.out.println("Your second card is " + playercard2);

		System.out.println("Your total is: " + (playercard1 + playercard2));
		int playertotal = (playercard1 + playercard2);
		int dealertotal = (dealercard1 + dealercard2);

		if (playertotal == 21) {
			System.out.println("Blackjack! Congratulations you win!");
			System.exit(0);
		}



		Scanner input = new Scanner(System.in);



		System.out.print("Would you like to draw another card? Type Y for Yes or N for No: ");
		char answer = input.next().charAt(0);
		answer = Character.toUpperCase(answer);
		boolean win = false;
		while(!win) {
			while (answer == 'Y') {
				int nextcard = shuffledeck[(int)(Math.random() * shuffledeck.length)][(int)(Math.random() * shuffledeck[0].length)];
				if (playertotal == 21) {
					System.out.println("Blackjack! Congratulations you win!");
					win = true;
					break;
				}

				if(playertotal > 21) {
					System.out.println("Bust! You went over 21 so you lose!");
					break;
				}

				System.out.println("Your next card is " + nextcard + "\n" + "Your total is: " + (playertotal + nextcard));
				playertotal = (playertotal + nextcard);


				if (playertotal == 21) {
					System.out.println("Blackjack! Congratulations you win!");
					win = true;
					break;
				}

				if(playertotal > 21) {
					System.out.println("Bust! You went over 21 so you lose!");
					System.exit(0);
				}

				System.out.print("Would you like to draw another card? Type Y for Yes or N for No: ");
				answer = input.next().charAt(0);
				answer = Character.toUpperCase(answer);



			}

			//System.out.println("You chose not to draw a card\n" + "Your total score is: " + playertotal);
			System.out.println("The dealer's second card is: " + dealercard2 + "\n" + "The dealer's total is: " + dealertotal);
			while (dealertotal <= 16 && win == false) {
				int nextcard = shuffledeck[(int)(Math.random() * shuffledeck.length)][(int)(Math.random() * shuffledeck[0].length)];
				dealertotal = dealertotal + nextcard;
				System.out.println("The dealer draws another card it is a : " + nextcard + "\n" + "The dealer's total is: " + (dealertotal ));

				if (dealertotal == 21) {
					System.out.println("The dealer got a Blackjack! You lose!");

					break;
				}
				if(dealertotal > 21) {
					System.out.println("The dealer went over 21! You win");
					break;
				}
				if (dealertotal > playertotal) {
					System.out.println("The dealer is closer to 21. You lose!");
					break;
				}

			}
			if(dealertotal < playertotal) {
				System.out.println("Player wins");
			}
			else if(dealertotal > playertotal) {
				System.out.println("Dealer wins");
			}
			else
				System.out.println("draw");

			win = true;

		}

	}
}








