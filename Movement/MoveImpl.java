package Movement;

import entities.Piece;
import Create.CreatePieces;
import Create.Rowcheck;

public class MoveImpl implements Move {

	String piece;
	int srcX;
	int srcY;
	int destX;
	int destY;
	char color;
	char pieceType;
	
	private void initializeValues(String inputMove[]) {
		piece = inputMove[0];
		srcY = Rowcheck.check(inputMove, 1);
		srcX = Integer.parseInt(""+inputMove[1].charAt(1));
		destY = Rowcheck.check(inputMove, 2);
		destX = Integer.parseInt(""+inputMove[2].charAt(1));
		color = piece.charAt(0);
		pieceType = piece.charAt(1);
		
	}

	
	@Override
	public void move(String inputMove[]) {
		initializeValues(inputMove);
		Piece pieceObj = CreatePieces.getPiece(piece);
		boolean check1=pieceObj.validateFirst(srcX, srcY, destX, destY, piece);
		boolean check2=pieceObj.validateForPiece(srcX, srcY, destX, destY);
		if(!check1 || !check2)
			System.out.println("Invalid move");
		if(check1 && check2)
			pieceObj.move(srcX, srcY, destX, destY, piece);
	}
	
	
}
