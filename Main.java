import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Movement.Move;
import Movement.MoveImpl;


public class Main {

	public static void main(String[] args) throws IOException {
		
		BoardInitializer.initialize();
		BoardInitializer.displayBoardState();
		Move move = new MoveImpl();
		System.out.println("Input:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inp = br.readLine();

		inp=br.readLine();
		if(inp.equals("Moves")){
			while(inp!=null && inp.trim()!="") {
				if(inp.trim().equals(""))
					break;
				inp = br.readLine();
				if(inp.trim().equals(""))
					break;
				String inputMove[]=inp.split(" ");
//				if(move.validate(inputMove)) {
					move.move(inputMove);
//				}
				BoardInitializer.displayBoardState();
			}
		}
	}
}