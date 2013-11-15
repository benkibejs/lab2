package geometri;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends GeometricalFormAbstract {
	
	/**
	 * The radius of the circle.
	 */
	protected int radius;
	
	/**
	 * @param x The x-coordinate of the circle.
	 * @param y The y-coordinate of the circle.
	 * @param radius The radius of the circle.
	 * @param c The color of the circle.
	 * @throws IllegalPositionException
	 */
	public Circle(int x, int y, int radius, Color c) throws IllegalPositionException{
		if ( x<0 || y<0 ) throw new IllegalPositionException();
		posX=x;
		posY=y;
		this.radius=radius;
		color = c;
		
	}
	
	/**
	 * @param f The GeometricalForm that defines the position of the circle.
	 * @param radius The radius of the circle.
	 * @param c The color of the circle.
	 */
	public Circle(GeometricalForm f, int radius, Color c){
		
	}
	
	@Override
	public int compareTo(GeometricalForm arg0) {
		// TODO Auto-generated method stub
		return 0;
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

}
