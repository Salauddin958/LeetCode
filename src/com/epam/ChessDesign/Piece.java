package com.epam.ChessDesign;

public class Piece {
	
	public enum PieceType {
		PAWN,
		KNIGHT,
		BISHOP,
		ROOK,
		QUEEN,
		KING
	}
	
	public enum PieceColor {
		BLACK,
		WHITE
	}

	public PieceColor pieceColor;
	public PieceType pieceType;
	public PieceColor getPieceColor() {
		return pieceColor;
	}
	public void setPieceColor(PieceColor pieceColor) {
		this.pieceColor = pieceColor;
	}
	public PieceType getPieceType() {
		return pieceType;
	}
	public void setPieceType(PieceType pieceType) {
		this.pieceType = pieceType;
	}
	
	
}
