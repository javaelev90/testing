import java.util.ArrayList;
import java.util.HashMap;

public class PlayerHandler {

	private ArrayList<Player> players;
	private int numberOfPlayers;
	
	public PlayerHandler(ArrayList<Player> players) {
		this.players = players;
		numberOfPlayers = players.size();
	}
	
	//GameRound means number of turns
	public Player getNextPlayer(int gameRound) {
		int playerTurn = (gameRound % numberOfPlayers);
		return players.get(playerTurn);	
	}

	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}
	
	public Player getPlayerByChar(char playerChar) {
		for(Player p : players) {
			if(p.getPlayerChar() == playerChar) return p;
		}
		return null;
		
	}
	
	
	
	
}
