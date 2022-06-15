package Create;


public class Rowcheck {
    public static int  check(String y[], int x ) {
        int RowNum = 0;
        char Row = y[x].charAt(0);
		
		switch(Row) {
		case 'A':
			RowNum= 1;
			break;	
		case 'B':
			RowNum= 2;
			break;
		case 'C':
			RowNum= 3;
			break;
		case 'D':
			RowNum= 4;
			break;
		case 'E':
			RowNum= 5;
			break;
		case 'F':
			RowNum= 6;
			break;
		case 'G':
			RowNum= 7;
			break;
		case 'H':
			RowNum= 8;
			break;
		default:
			System.out.println("Invalid Row in input");
		}
			
		return RowNum;
	}
    
}
