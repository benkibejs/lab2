package geometri;

import java.awt.*;

public class Square extends GeometricalFormAbstract{
	/**
	 * the length of a side of the Square
	 */
	protected int side;
	
	/**
	 * @param x The x-coordinate of this square.
	 * @param y The y-coordinate of this square.
	 * @param side The length of the side of the square.
	 * @param c The color of the square.
	 * @throws IllegalPositionException
	 */
	public Square(int x, int y, int side, Color c) throws IllegalPositionException{
		
	}
	
	/**
	 * @param f The GeometricalForm that defines the position of the square.
	 * @param side The length of the side of the square.
	 * @param c The color of the square.
	 */
	public Square(GeometricalForm f, int side, Color c){
		
	}


	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(GeometricalForm f) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void fill(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}
