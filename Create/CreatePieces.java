package Create;

import entities.*;


public class CreatePieces {

	public static Piece getPiece(String inputPiece) {
		char color = inputPiece.charAt(0);
		char pieceType = inputPiece.charAt(1);
		Piece piece=null;
		switch(pieceType) {
		case 'H':
			piece = new Horse();
			break;	
		case 'R':
			piece = new Rook();
			break;
		case 'Q':
			piece = new Queen();
			break;
		case 'P':
			piece = new Pawn();
			break;
		case 'K':
			piece = new King();
			break;
		case 'C':
			piece = new Bishop();
			break;
		default:
			System.out.println("Incorrect piece in input");
		}
		piece.setColor(color);
			
		return piece;
	}
}
