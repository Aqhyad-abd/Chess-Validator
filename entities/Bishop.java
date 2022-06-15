package entities;

public class Bishop extends Piece{
    
    @Override
	public boolean validateForPiece(int srcX, int srcY, int destX, int destY) {
		if((srcX==destX) && (srcY==destY)) {
			return true;
		}
		return false;
	}
}
