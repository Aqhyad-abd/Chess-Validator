import entities.Board;

public class BoardInitializer {

	public static void initialize() {
		
		String board[][] = {
                                {"   "," A"," B"," C"," D"," E"," F"," G ","H"},
				{"1  ","BR", "BH", "BC", "BK", "BQ", "BC", "BH", "BR"},
				{"2  ","BP", "BP", "BP", "BP", "BP", "BP", "BP", "BP"},
				{"3  ","--", "--", "--", "--", "--", "--", "--", "--"},
				{"4  ","--", "--", "--", "--", "--", "--", "--", "--"},
				{"5  ","--", "--", "--", "--", "--", "--", "--", "--"},
				{"6  ","--", "--", "--", "--", "--", "--", "--", "--"},
				{"7  ","WP", "WP", "WP", "WP", "WP", "WP", "WP", "WP"},
				{"8  ","WR", "WH", "WC", "WQ", "WK", "WC", "WH", "WR"},
				};
		Board.TOP_WHITE = false;
		Board.CHESS_BOARD = new String [9][9];
		Board.CHESS_BOARD=board;
	}
	
	public static void initialize(String board[][]) {
		Board.CHESS_BOARD = new String [9][9];
		Board.CHESS_BOARD=board;
		if(Board.CHESS_BOARD[0][0].charAt(0)=='W') 
			Board.TOP_WHITE = false;
		else
			Board.TOP_WHITE = true;
	}
	
	public static void displayBoardState() {
		System.out.println("CURRENT BOARD:");
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				System.out.print(Board.CHESS_BOARD[i][j] +" ");
			}
			System.out.println();
		}
	}
}
