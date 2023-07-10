package assignment2;

import java.io.FileOutputStream;
import java.io.*;
import java.util.*;

//----------------------------------------------------- 
//Assignment 2 
//Question:  The purpose of this assignment is to help you review some of the main topics covered in previous courses, such as classes, loops, arrays, static attributes and static methods.
//Written by: Lisi Cao 2387145
//----------------------------------------------------- 

class Player implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private int position;
	private static int numPlayerCreated = 0;
	private int id;

	public Player(String name) {
		this.name = name;
		this.position = 0;
		this.id = ++numPlayerCreated;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the numPlayerCreated
	 */
	public static int getNumPlayerCreated() {
		return numPlayerCreated;
	}

	/**
	 * @param numPlayerCreated the numPlayerCreated to set
	 */
	public static void setNumPlayerCreated(int numPlayerCreated) {
		Player.numPlayerCreated = numPlayerCreated;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(int position) {
		this.position = position;
	}

	public int getPosition() {
		return position;
	}

	public void move(int sptes, GameBoard board) {
		int newPosition;

		newPosition = sptes + position;

		HashMap<Integer, Integer> snakeAndLadder = board.getSnakeAndLadders(newPosition);

		if (newPosition > 100) {
			newPosition = 100 - (newPosition - 100);
		} else if (snakeAndLadder != null) {
			if (snakeAndLadder.equals(board.getSnakes())) {
				System.out.println(
						"Bited by snakes! Drop from " + newPosition + " to " + board.getSnakes().get(newPosition));
			} else {
				System.out.println(
						"Climb a ladder! Up from " + newPosition + " to " + board.getLadders().get(newPosition));
			}
			newPosition = snakeAndLadder.get(newPosition);
		} else if (newPosition == 100) {
			System.out.println("You have reached the destination! \n");
			System.out.println("Player " + getName().toUpperCase() + " won!");
			System.out.println("Game Over");
			System.exit(0);
		}

		this.position = newPosition;
		System.out.println("You arrive: " + position + "\n");
	}

	public void saveGameState() {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(getName() + ".dat"))) {
			out.writeObject(this);
			System.out.println("Game sate saved for player " + getName());
		} catch (IOException e) {
			System.out.println("Error!");
			e.printStackTrace();
		}
	}

	public static Player loadingGameState(String playerName) {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(playerName + ".dat"))) {
			return (Player) in.readObject();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Error!");
			e.printStackTrace();
		}
		return null;
	}

}

class Dice {

	private int resultDice;

	public Dice() {
		this.resultDice = 0;
	}

	public void startDice(Player player) {
		System.out.println("------------------------------------");
		System.out.println("Player <<<  " + player.getName() + "  >>>");
		System.out.println("Click start to flip dice");
		System.out.println("Enter any key to start:");

		Scanner kb = new Scanner(System.in);

		String input = kb.nextLine();

	}

	public int roll() {
		Random rand = new Random();
		resultDice = rand.nextInt(6) + 1;
		return resultDice;
	}

	@Override
	public String toString() {
		return "Value of Dice: " + resultDice + " . \n ";
	}

}

class GameBoard {
	private HashMap<Integer, Integer> snakes;
	private HashMap<Integer, Integer> ladders;
	private int[][] boardNum;
	private String[][] boardString;

	public GameBoard() {
		this.snakes = new HashMap<>();
		this.ladders = new HashMap<>();
		this.boardNum = new int[10][10];
		this.boardString = new String[10][10];
		int n = 100;

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < 10; j++) {
					boardNum[i][j] = n--;
				}
			} else {
				for (int j = 9; j >= 0; j--) {
					boardNum[i][j] = n--;
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				boardString[i][j] = String.valueOf(boardNum[i][j]);
			}
		}

		snakes.put(16, 6);
		snakes.put(48, 30);
		snakes.put(64, 60);
		snakes.put(79, 19);
		snakes.put(93, 68);
		snakes.put(95, 24);
		snakes.put(97, 76);
		snakes.put(98, 78);

		ladders.put(1, 38);
		ladders.put(4, 14);
		ladders.put(9, 31);
		ladders.put(21, 42);
		ladders.put(28, 84);
		ladders.put(36, 44);
		ladders.put(51, 67);
		ladders.put(71, 91);
		ladders.put(80, 100);
	}

	/**
	 * @return the snakes
	 */
	public HashMap<Integer, Integer> getSnakes() {
		return snakes;
	}

	/**
	 * @param snakes the snakes to set
	 */
	public void setSnakes(HashMap<Integer, Integer> snakes) {
		this.snakes = snakes;
	}

	/**
	 * @return the ladders
	 */
	public HashMap<Integer, Integer> getLadders() {
		return ladders;
	}

	/**
	 * @param ladders the ladders to set
	 */
	public void setLadders(HashMap<Integer, Integer> ladders) {
		this.ladders = ladders;
	}

	/**
	 * @return the boardNum
	 */
	public int[][] getBoardNum() {
		return boardNum;
	}

	/**
	 * @param boardNum the boardNum to set
	 */
	public void setBoardNum(int[][] boardNum) {
		this.boardNum = boardNum;
	}

	/**
	 * @return the boardString
	 */
	public String[][] getBoardString() {
		return boardString;
	}

	/**
	 * @param boardString the boardString to set
	 */
	public void setBoardString(String[][] boardString) {
		this.boardString = boardString;
	}

	public HashMap<Integer, Integer> getSnakeAndLadders(int position) {
		if (snakes.containsKey(position)) {
			return snakes;
		}
		if (snakes.containsKey(position)) {
			return ladders;
		}
		return null;
	}
}

public class LadderAndSnake {
	private ArrayList<Player> players;
	private GameBoard board;
	private Dice dice;

	public LadderAndSnake(ArrayList<Player> players) {
		this.players = players;
		this.board = new GameBoard();
		this.dice = new Dice();
	}

	/**
	 * @return the players
	 */
	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void orderPlayers() {
		Map<Integer, List<Player>> diceResultToPlayers = new TreeMap<>(Collections.reverseOrder());

		for (Player player : players) {
			dice.startDice(player);
			int diceResult = dice.roll();
			System.out.println(dice);
			if (!diceResultToPlayers.containsKey(diceResult)) {
				diceResultToPlayers.put(diceResult, new ArrayList<>());
			}
			diceResultToPlayers.get(diceResult).add(player);
		}

		boolean hasTie;
		do {
			hasTie = false;
			List<Integer> tiedDiceResults = new ArrayList<>();

			for (Map.Entry<Integer, List<Player>> entry : diceResultToPlayers.entrySet()) {
				if (entry.getValue().size() > 1) {
					hasTie = true;
					tiedDiceResults.add(entry.getKey());
				}
			}

			for (Integer diceResult : tiedDiceResults) {
				List<Player> tiedPlayers = diceResultToPlayers.get(diceResult);
				diceResultToPlayers.remove(diceResult);

				for (Player player : tiedPlayers) {
					dice.startDice(player);
					int newDiceResult = dice.roll();
					System.out.println(dice);
					if (!diceResultToPlayers.containsKey(newDiceResult)) {
						diceResultToPlayers.put(newDiceResult, new ArrayList<>());
					}
					diceResultToPlayers.get(newDiceResult).add(player);
				}
			}
		} while (hasTie);

		ArrayList<Player> orderedPlayers = new ArrayList<>();
		for (List<Player> playerList : diceResultToPlayers.values()) {
			orderedPlayers.addAll(playerList);
		}

		players = orderedPlayers;
	}

	public void play() {
		boolean isGameOver = false;
		int count = 0;
		HashMap<Integer, String> position = new HashMap<>();
		int[][] originalBoardNum = board.getBoardNum();
		while (!isGameOver) {
			count++;
			System.out.println("------------------------------------\nRound # " + count);
			for (Player player : players) {
				if (player.getPosition() == 100) {
					isGameOver = true;
					break;
				} else {
					dice.startDice(player);
					int sptes = dice.roll();
					System.out.println(dice);
					player.move(sptes, board);
					player.saveGameState();
					position.put(player.getPosition(), player.getName());
				}
			}

			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					int valBoard = Integer.parseInt(board.getBoardString()[i][j]);
					if (position.containsKey(valBoard)) {
						System.out.print(" " + position.get(valBoard).toUpperCase().charAt(0) + " ");
					} else {
						System.out.printf("%2s ", board.getBoardString()[i][j]);
					}
				}
				System.out.println();
			}
			board.setBoardNum(originalBoardNum);
			position.clear();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to  play \" Ladder and Snake \" created by Lisi Cao.");
		ArrayList<Player> players = new ArrayList<>();
//		System.out.println("Do you want to load your game? yes or no");
//		 input = kb.nextLine();
//		 if(input.equalsIgnoreCase("yes")) {
//			 System.out.print("Please enter your Player Name: ");
//			 String loadedPlayerName = kb.nextLine();
//			 Player loadedPlayer = Player.loadingGameState(loadedPlayerName);
//			 if(Player.loadingGameState(loadedPlayerName) != null) {
//				 players.add(loadedPlayer);
//			 };
//		 }
		
		
		System.out.println("How many players do you have? - Number must be between 2 and 4 inclusively");
		int numOfPlayer = kb.nextInt();
		int n = 4;

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
				System.exit(0);
			}
		}

		kb.nextLine();
		String[] playerNames;

		playerNames = new String[numOfPlayer];

		for (int i = 0; i < numOfPlayer; i++) {
			System.out.println("The name of player #" + (i + 1) + ": ");
				 input = kb.nextLine();
				playerNames[i] = input;
				players.add(new Player(playerNames[i]));
		}

		System.out.println("The following " + numOfPlayer + " Players attend this game:");
		for (Player player : players) {
			System.out.println(player.getName());
		}

		System.out.println("\nGame is loading \n");
		LadderAndSnake game = new LadderAndSnake(players);

		System.out.println("Please flip Dice to determine players' order!\n");
		game.orderPlayers();
		System.out.println("------------------------------------\nThe order of players:");
		int i = 0;
		for (Player player : game.getPlayers()) {
			i++;
			System.out.println("#" + i + "  " + player.getName());
		}
		System.out.println("------------------------------------");
		System.out.println("Click any key to start playing");
		kb.nextLine();
		game.play();
		kb.close();

	}

}
