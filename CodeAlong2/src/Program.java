import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Program {


	static int[][] neighbors = {{-1,-1}, {0,-1}, {1,-1},
								{-1,1}, {1,1},
								{-1,1}, {0,1}, {1,1}};
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		GameArea gameArea = new GameArea(3,3);
		ArrayList<Player> players = new ArrayList<Player>();
		players.add(new Player('X'));
		players.add(new Player('O'));
		PlayerHandler playerHandler = new PlayerHandler(players);
		Game game = new Game(gameArea, playerHandler);
		game.play();
		
		
	}	
	
	
}
