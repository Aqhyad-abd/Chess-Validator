import entities.Board;

public class BoardInitializer {

	public static void initialize() {
		
		String board[][] = {
				{"BR", "BH", "BC", "BK", "BQ", "BC", "BH", "BR", "|", "1"},
				{"BP", "BP", "BP", "BP", "BP", "BP", "BP", "BP", "|", "2"},
				{"--", "--", "--", "--", "--", "--", "--", "--", "|", "3"},
				{"--", "--", "--", "--", "--", "--", "--", "--", "|", "4"},
				{"--", "--", "--", "--", "--", "--", "--", "--", "|", "5"},
				{"--", "--", "--", "--", "--", "--", "--", "--", "|", "6"},
				{"WP", "WP", "WP", "WP", "WP", "WP", "WP", "WP", "|", "7"},
				{"WR", "WH", "WC", "WQ", "WK", "WC", "WH", "WR", "|", "8" },
                {" A"," B"," C"," D"," E"," F"," G ","H","",""},
				};
		Board.TOP_WHITE = false;
		Board.CHESS_BOARD = new String [12][12];
		Board.CHESS_BOARD=board;
	}
	
	public static void initialize(String board[][]) {
		Board.CHESS_BOARD = new String [12][12];
		Board.CHESS_BOARD=board;
		if(Board.CHESS_BOARD[0][0].charAt(0)=='W') 
			Board.TOP_WHITE = false;
		else
			Board.TOP_WHITE = true;
	}
	
	public static void displayBoardState() {
		System.out.println("CURRENT BOARD:");
		for(int i=0;i<9;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(Board.CHESS_BOARD[i][j] +" ");
			}
			System.out.println();
		}
	}
}