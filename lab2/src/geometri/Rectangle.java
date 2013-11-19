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
		if ( x<0 || y<0 ) throw new IllegalPositionException();
		posX=x;
		posY=y;
		color = c;
		this.width = width;
		this.height = height;
	}
	/**
	 * @param f The GeometricalForm that defines the position of the rectangle.
	 * @param width The width of the rectangle.
	 * @param height The height of the rectangle.
	 * @param c The color of the rectangle.
	 */
	public Rectangle(GeometricalForm f, int width, int height, Color c){
		posX = f.getX();
		posY = f.getY();
		color = c;
		this.width = width;
		this.height = height;
	}
	@Override
	public int getWidth() {
		return width;
	}
	@Override
	public int getHeight() {
		return height;
	}
	@Override
	public int getPerimeter() {
		return width*2 + height*2;
	}
	@Override
	public int getArea() {
		return width*height;
	}
	@Override
	public void fill(Graphics g) {
		g.setColor(color);
		g.fillRect(posX, posY, width, height);
	}

}
