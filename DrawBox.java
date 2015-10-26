import FormatIO.*;

public class DrawBox {
	
	public static void main(String[] arg){
		Console con = new Console();
		
		for(;;){
			
			con.println("Do you wan to draw a box?");
			String reply = con.readWord();
			if(reply.equals("no"))
				break;
			
			con.println("How many rows?");
			int nRows = con.readInt();
			
			con.println("How many columns?");
			int nCols = con.readInt();
			
			if(nRows>0&&nCols>0)
				drawBox(nRows, nCols);
			
			else
				con.println("Sorry values need to be positive.");
		}
		
		
		
	}
	
	private static void drawTop(Console con, int num){
		con.print("+");
		if(num==1)
			return;
		for(int i=0; i<num-2; i++)
			con.print("-");
			
		con.print("+");
		con.println();
	}
	//end of drawTop
	
	private static void drawSide(Console con, int num){
		
		if(num==1){
			con.println();
			return;}
		con.print("|");
		for(int i = 0; i<num-2; i++)
			
			con.print(" ");
			
		con.print("|");
		con.println();
		
	}
	
	/*private static void drawBox(int nRows, int nCols){
		Console boxCon = new Console(nRows+2, nCols+5);
		
		drawTop(boxCon, nCols);
		if(nRows == 1)
			return;
		
		for(int i = 0; i<nRows; i++)
			drawSide(boxCon, nCols);
		
		drawTop(boxCon, nCols);
		
		
		
		
		
	}*/
	
	//for exc3
	
	private static void drawBox(int nRows, int nCols){
		
		Console conBox = new Console(nRows + 2, nCols + 5);
			
		drawRow(conBox, nCols, "+", "-");//for top
		
		if(nRows==1)return;
		
		for(int i = 0; i<nRows-2; i++)//for sides
		drawRow(conBox, nCols, "|", " ");
		
		drawRow(conBox, nCols, "+", "-");//for bottom
		
	}
	
	private static void drawRow(Console con, int n, String end, String mid){
		
		con.print(end);
		if(n == 1)
			return;
		
		for(int i=0; i<n-2; i++)
			con.print(mid);
		con.print(end);
		con.println();
	}

}
