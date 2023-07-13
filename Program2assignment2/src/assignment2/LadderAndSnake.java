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
		this.id = ++numPlayerCreated; // index for future features
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

	// move method
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

	// save player's game state
	public void saveGameState() {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(getName() + ".dat"))) {
			out.writeObject(this);
			System.out.println("Game sate saved for player " + getName() + "\n");
		} catch (IOException e) {
			System.out.println("Error!");
			e.printStackTrace();
		}
	}

	// load previous game
	public static Player loadingGameState(String playerName) {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(playerName + ".dat"))) {
			return (Player) in.readObject();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Error!");
			e.printStackTrace(); // indicate error lines
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
		System.out.println("Click start to flip dice. (enter any key to start)");
		Scanner kb = new Scanner(System.in); // pretend there is a bottom "Start"
		kb.nextLine();
	}

	public int roll() {
		Random rand = new Random();
		resultDice = rand.nextInt(6) + 1;
		return resultDice; // return random number of Dice
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

		// create digit game board(INTEGER)
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

		// display a game board(STRING)
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				boardString[i][j] = String.valueOf(boardNum[i][j]);
			}
		}

		// assign values to snakes
		snakes.put(16, 6);
		snakes.put(48, 30);
		snakes.put(64, 60);
		snakes.put(79, 19);
		snakes.put(93, 68);
		snakes.put(95, 24);
		snakes.put(97, 76);
		snakes.put(98, 78);

		// assign values to ladders
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

	// check whether snakes or ladders exist according to current position
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

//  core engine. initial game.
public class LadderAndSnake {
	private ArrayList<Player> players;
	private GameBoard board;
	private Dice dice;
	Scanner kb = new Scanner(System.in);

	// import players to constructor
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

	/**
	 * @param players the players to set
	 */
	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}

	/*
	 * This part is to determine the order of players. The basic logic is as follow:
	 * First round 1. determine player's relative position, put them in a list. 2.
	 * players who have same values will be treated as a set, which has a unique
	 * position. Second round 1. players with same values re-flip dice to determine
	 * the position within them ,that means in the second list. 2. sort the second
	 * list. 3. put second list back to main list 4. repeat this process until all
	 * list has only one element. return the ordered list
	 */
	public void orderPlayers() {
		Map<Integer, List<Player>> diceResultToPlayers = new TreeMap<>(Collections.reverseOrder());

		// the first round of fliping dice
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

	// this is a method under core engine
	public void play() {
		HashMap<Integer, String> position = new HashMap<>();
		int[][] originalBoardNum = board.getBoardNum(); // create a original board to initial game board
		boolean isGameOver = false;// flag
		int count = 0;

		// flag will turn over once there is one player reach 100.
		while (!isGameOver) {
			count++;
			System.out.println("------------------------------------\nRound # " + count); // counting game round
			for (Player player : players) {
				if (player.getPosition() == 100) {
					isGameOver = true;
					break;

				} else {
					dice.startDice(player);
					int sptes = dice.roll();
					System.out.println(dice);
					player.move(sptes, board);

					// every fifth round, ask player whether save game state or not.
					if (count % 5 == 0) {
						System.out.println(
								"Do you want to save game state? enter '-1'to save, or any other key to continue.");
						String isSave = kb.nextLine();
						if (isSave.equals("-1")) { // for easy use. enter -1 to save, other key to continue.
							player.saveGameState(); // display saving status.
							System.out.println("Do you want to exit game? Please enter 'END' EXACTLY.");
							String end = kb.nextLine();
							if (end.equals("END")) {
								System.exit(0);
							}
						} else {
							System.out.println("Continue. \n");
						}
					}

					position.put(player.getPosition(), player.getName());
				}
			}

			// display where players are within the game board by showing player's initial
			// letter. The last player will take the position
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
			// when player's position move, the previous position return to original board
			board.setBoardNum(originalBoardNum);
			position.clear();
		}
	}

}
