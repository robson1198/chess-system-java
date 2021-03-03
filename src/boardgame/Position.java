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


	public int getColun() {
		return column;
	}


	public void setColun(int colun) {
		this.column = colun;
	}
	
	@Override
	public String toString() {
		return "Position: " + row + ", " + column;
	}
	
	

}
