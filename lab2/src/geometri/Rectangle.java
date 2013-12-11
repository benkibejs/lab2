package geometri;

import java.awt.*;

public class Rectangle extends GeometricalFormAbstract{

	/**
	 * @param x The x-coordinate of the rectangle. 
	 * @param y The y-coordinate of the rectangle.
	 * @param width The width of the rectangle.
	 * @param height The height of the rectangle.
	 * @param c The color of the rectangle.
	 * @throws IllegalPositionException
	 */
	public Rectangle(int x, int y, int width, int height, Color c) throws IllegalPositionException{
		super(x,y,width,height,c);
	}
	/**
	 * @param f The GeometricalForm that defines the position of the rectangle.
	 * @param width The width of the rectangle.
	 * @param height The height of the rectangle.
	 * @param c The color of the rectangle.
	 */
	public Rectangle(GeometricalForm f, int width, int height, Color c){
		super(f,width,height,c);
	}

	@Override
	public int getPerimeter() {
		return getWidth()*2 + getHeight()*2;
	}
	
	@Override
	public int getArea() {
		return getWidth()*getHeight();
	}
	
	@Override
	public void fill(Graphics g) {
		g.setColor(getColor());
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

}
