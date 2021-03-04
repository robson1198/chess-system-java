package boardgame;

public class Position {
	
	private int row; //linha
	private int column; //coluna
	
	
	public Position(int row, int colun) {
		this.row = row;
		this.column = colun;
	}


	public int getRow() {
		return row;
	}


	public void setRow(int row) {
		this.row = row;
	}


	public int getColumn() {
		return column;
	}


	public void setColumn(int column) {
		this.column = column;
	}
	
	@Override
	public String toString() {
		return "Position: " + row + ", " + column;
	}
	
	

}
