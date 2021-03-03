package boardgame;

public class Board { // Tabuleiro
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int cloums) {
		this.rows = rows;
		this.columns = cloums;
		pieces = new Piece [rows] [columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getCloums() {
		return columns;
	}

	public void setCloums(int cloums) {
		this.columns = cloums;
	}
	
	
	
	

}
