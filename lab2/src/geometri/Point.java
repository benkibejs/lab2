package geometri;

import java.awt.*;

/**
 * A model of a point.
 * 
 * @author Group 107: Benjamin Lindberg and Rasti Tengman
 * 
 *
 */

public class Point extends GeometricalFormAbstract{
	
	/**
	 * @param x The x-coordinate of this point
	 * @param y The y-coordinate of this point
	 * @param c The color of this point
	 * @throws IllegalPositionException
	 */
	public Point(int x, int y, Color c) throws IllegalPositionException{
		super(x,y,1,1,c);
	}
	/**
	 * @param f This GeometricalForms position will be the position of the point.
	 * @param c The color of the point.
	 */
	public Point(GeometricalForm f, Color c){
		super(f,1,1,c);
	}

	@Override
	public int getPerimeter() {
		return 0;
	}
	
	@Override
	public int getArea() {
		return 0;
	}
	
	@Override
	public void fill(Graphics g) {
		g.setColor(getColor());
		g.fillOval(getX(), getY(), 1, 1);
	}
}
