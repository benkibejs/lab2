package geometri;

import java.awt.*;

public class Rectangle extends GeometricalFormAbstract{
	
	/**
	 * The width of the rectangle 
	 */
	protected int width; 
	/**
	 * The height of the rectangle
	 */
	protected int height;
	
	/**
	 * @param x The x-coordinate of the rectangle. 
	 * @param y The y-coordinate of the rectangle.
	 * @param width The width of the rectangle.
	 * @param height The height of the rectangle.
	 * @param c The color of the rectangle.
	 * @throws IllegalPositionException
	 */
	public Rectangle(int x, int y, int width, int height, Color c) throws IllegalPositionException{
		
	}
	/**
	 * @param f The GeometricalForm that defines the position of the rectangle.
	 * @param width The width of the rectangle.
	 * @param height The height of the rectangle.
	 * @param c The color of the rectangle.
	 */
	public Rectangle(GeometricalForm f, int width, int height, Color c){
		
	}

	@Override
	public void fill(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getArea() {
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

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void move(int dx, int dy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void place(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(GeometricalForm o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
