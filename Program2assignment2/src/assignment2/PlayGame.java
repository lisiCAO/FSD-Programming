package assignment2;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input; // temporarily store key in information
		Scanner kb = new Scanner(System.in);
		ArrayList<Player> players = new ArrayList<>();

		System.out.println("Welcome to  play \" Ladder and Snake \" created by Lisi Cao."); // welcome message

		System.out.println("How many players do you have? - Number must be between 2 and 4 inclusively"); //
		int numOfPlayer = kb.nextInt();

		int n = 4; // control variable
		while (n > 0 && numOfPlayer > 4 || numOfPlayer < 2) {
			n--;

			if (n > 1) {
				System.out.println("Bad Attempt " + (4 - n)
						+ "- Invalid # of players. please enter a # BETWEEN 2 and 4 inclusively");
				numOfPlayer = kb.nextInt();
			} else if (n == 1) {
				System.out.println("Bad Attempt " + (4 - n)
						+ "- Invalid # of players. please enter a # BETWEEN 2 and 4 inclusively This is your last attempts");
				numOfPlayer = kb.nextInt();
			} else {
				System.out.println(
						"Bad Attempt " + (4 - n) + "! You have exhausted all your chances. Program will terminate");
				System.exit(0); // while attempts exhausted , exit system directly.
			}
		}

		kb.nextLine();

		String[] playerNames;
		playerNames = new String[numOfPlayer];

		// load player's game states or create new players
		System.out.println("Do you want to load your game? yes or no");
		input = kb.nextLine();

		for (int i = 0; i < numOfPlayer; i++) {
			// loaded players
			if (input.equalsIgnoreCase("yes")) {
				System.out.print("Please enter #" + (i + 1) + " Player Name to load: ");
				String loadedPlayerName = kb.nextLine();
				Player loadedPlayer = Player.loadingGameState(loadedPlayerName);
				if (Player.loadingGameState(loadedPlayerName) != null) {
					players.add(loadedPlayer);
				}
				// new players
			} else {
				System.out.println("The name of player #" + (i + 1) + ": ");
				input = kb.nextLine();
				playerNames[i] = input;
				players.add(new Player(playerNames[i]));
			}
		}

		// display confirming information regarding players.
		System.out.println("The following " + numOfPlayer + " Players attend this game:");
		for (Player player : players) {
			System.out.println(player.getName());
		}
		// display current steps
		System.out.println("\nGame is loading \n");
		LadderAndSnake game = new LadderAndSnake(players);

		// determine orders
		System.out.println("Please flip Dice to determine players' order!\n");
		game.orderPlayers();
		System.out.println("------------------------------------\nThe order of players:");
		int i = 0;

		// display ordered players' information
		for (Player player : game.getPlayers()) {
			i++;
			System.out.println("#" + i + "  " + player.getName());
		}

		// start game
		System.out.println("------------------------------------");
		System.out.println("Click any key to start playing");
		kb.nextLine();
		// playing until one player reach 100 or choose to quit
		game.play();
		kb.close();
	}
}
