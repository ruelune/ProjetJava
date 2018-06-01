package model;

public class Position extends MovableImpl {
	
	private double Pos_X;
	
	private double Pos_Y;
	
	private int MaxPos_X;
	
	private int MaxPos_Y;
	

	public Position(double Pos_X, double Pos_Y) {
		
	}
	
	public Position(Position position) {
		
	}

	public double getPos_X() {
		return Pos_X;
	}

	public void setPos_X(double pos_X) {
		Pos_X = pos_X;
	}

	public double getPos_Y() {
		return Pos_Y;
	}

	public void setPos_Y(double pos_Y) {
		Pos_Y = pos_Y;
	}
	

	public int getMaxPos_X() {
		return MaxPos_X;
	}

	public void setMaxPos_X(int maxPos_X) {
		MaxPos_X = maxPos_X;
	}

	public int getMaxPos_Y() {
		return MaxPos_Y;
	}

	public void setMaxPos_Y(int maxPos_Y) {
		MaxPos_Y = maxPos_Y;
		
	}

}
