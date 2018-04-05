
public class GameArea {

	private char[][] gameArea;
	
	public GameArea(final int rows, final int cols) {
		gameArea = new char[rows][cols];
	}
	
	public boolean placePlayerChar(char player, int row, int col) {
		if(isPlayerWithinBounds(row, col) && isSquareFree(row, col)) {
			gameArea[row][col] = player;
			return true;
		}
		return false;
	}
	
	public boolean isPlayerWithinBounds(int row, int col) {
		if(valueWithinBounds(row, gameArea.length, 0) &&
				valueWithinBounds(col, gameArea[0].length, 0)) {
			return true;
		}
		return false;
	}
//	
//	throw new ArrayIndexOutOfBoundsException("Row value " + value +
//			" was out of bounds has to be less than "+
//			upperBound + " and bigger than" + lowerBound);
	
	private boolean valueWithinBounds(int value, int upperBound, int lowerBound) {
		if(!(value >= lowerBound && value < upperBound)) {
			return false;
		}
		return true;
	}
	
	public void printGameArea() {
		for(int x = 0; x < gameArea.length; x++) {
			for(int y = 0; y < gameArea[x].length; y++) {
				System.out.print(gameArea[x][y]+ " ");
			}
			System.out.println("");
		}
	}
	
	public boolean isSquareFree(int row, int col) {
		if(gameArea[row][col] == 0) {
			return true;
		}
		return false;
	}
	
//	public char nCharsInRow(int charsInRow) {
//		
//		for(int i = 0; i < gameArea.length; i++) {
//			
//		}
//		
//	}
	
	public Bounds getGameAreaBounds() {
		return new Bounds(gameArea.length, gameArea[0].length);
	}
	
}
