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
		color = c;
		this.radius=radius;
		
	}
	
	/**
	 * @param f The GeometricalForm that defines the position of the circle.
	 * @param radius The radius of the circle.
	 * @param c The color of the circle.
	 */
	public Circle(GeometricalForm f, int radius, Color c){
		
	}
	
	@Override
	public int getWidth() {
		return radius*2;
	}

	@Override
	public int getHeight() {
		return radius*2;
	}
	
	@Override
	public int getPerimeter() {
		return (int) (2*Math.PI*radius+0.5);
	}
	
	@Override
	public int getArea() {
		return (int) (Math.PI*radius*radius+0.5);
	}
	
	@Override
	public void fill(Graphics g) {
		//g.drawOval(getX(), getY(), getWidth(), getHeight());
		g.setColor(color);
		g.fillOval(getX(), getY(), getWidth(), getHeight());
	}

}