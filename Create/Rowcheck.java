package Create;


public class Rowcheck {
    public static int  check(String y[], int x ) {
        int RowNum = 0;
        char Row = y[x].charAt(0);
		
		switch(Row) {
		case 'A':
			RowNum= 0;
			break;	
		case 'B':
			RowNum= 1;
			break;
		case 'C':
			RowNum= 2;
			break;
		case 'D':
			RowNum= 3;
			break;
		case 'E':
			RowNum= 4;
			break;
		case 'F':
			RowNum= 5;
			break;
		case 'G':
			RowNum= 6;
			break;
		case 'H':
			RowNum= 7;
			break;
		default:
			System.out.println("Invalid Row in input");
		}
			
		return RowNum;
	}
    
}
