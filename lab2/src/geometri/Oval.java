package geometri;

import java.awt.*;

/**
 * A model of a oval.
 * 
 * @author Group 107: Benjamin Lindberg and Rasti Tengman
 *  
 *
 */

public class Oval extends GeometricalFormAbstract{

	/**
	 * @param x The x-coordinate of the oval.
	 * @param y The y-coordiante of the oval.
	 * @param The width The width of the oval.
	 * @param The height The height of the oval.
	 * @param c The color of the oval.
	 * @throws IllegalPositionException
	 */
	public Oval(int x, int y, int width, int height, Color c) throws IllegalPositionException{
		super(x,y,width,height,c);
	}
	/**
	 * @param f The GeometricalForm that defines the position of the oval.
	 * @param width The width of the oval.
	 * @param height The height of the oval.
	 * @param c The color of the oval.
	 */
	public Oval(GeometricalForm f, int width, int height, Color c){
		super(f,width,height,c);
	}
	
	@Override
	public int getPerimeter() {
		return (int) (Math.PI*Math.sqrt(2*(getWidth()*getWidth()*getHeight()*getHeight() - (getWidth()-getHeight())*(getWidth()-getHeight())/2) )+0.5);
	}
	
	@Override
	public int getArea() {
		return (int) (Math.PI*getWidth()*getHeight()+0.5);
	}
	
	@Override
	public void fill(Graphics g) {
		g.setColor(getColor());
		g.fillOval(getX(), getY(), getWidth(), getHeight());
	}


}
