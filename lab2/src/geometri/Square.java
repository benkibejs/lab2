package geometri;

import java.awt.*;

public class Square extends Rectangle{

	/**
	 * @param x The x-coordinate of this square.
	 * @param y The y-coordinate of this square.
	 * @param side The length of the side of the square.
	 * @param c The color of the square.
	 * @throws IllegalPositionException
	 */
	public Square(int x, int y, int side, Color c) throws IllegalPositionException{
		super(x,y,side,side,c);
		
	}
	
	/**
	 * @param f The GeometricalForm that defines the position of the square.
	 * @param side The length of the side of the square.
	 * @param c The color of the square.
	 */
	public Square(GeometricalForm f, int side, Color c){
		super(f,side,side,c);
	}
}
