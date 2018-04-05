import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
	
	private GameArea gameArea;
	private PlayerHandler playerHandler;
	private int gameRound;
	
	public Game(GameArea gameArea, PlayerHandler playerHandler) {
		this.gameArea = gameArea;
		this.playerHandler = playerHandler;
		gameRound = 0;
	}
	
	public void play() throws NumberFormatException, IOException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		while(!playerWon()) {
			Player nextPlayer = playerHandler.getNextPlayer(gameRound);
			System.out.println("Player " + nextPlayer.getPlayerChar() + " please enter Row(0-2) then press enter"
					+ " then enter Col(2) and press enter");
			
			int row = Integer.parseInt(input.readLine());
			int col = Integer.parseInt(input.readLine());
			
			boolean legalPosition = gameArea.placePlayerChar(nextPlayer.getPlayerChar(), row, col);
			if(!legalPosition) {
				System.out.println("Could not place character there, place somewhere else.");
				continue;
			}
			gameArea.printGameArea();
			gameRound++;
		
		}
	}
	
	public boolean playerWon() {
		
		Bounds bounds = gameArea.getGameAreaBounds();
		for(int i = 0; i < bounds.getCols(); i++) {
			
		}
		return false;
	}
	
	
}
