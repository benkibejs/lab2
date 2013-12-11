package geometri;

import java.awt.Color;
import java.awt.Graphics;

/**
 * A model of a circle.
 * 
 * @author Group 107: Benjamin Lindberg and Rasti Tengman
 *
 */

public class Circle extends Oval {
	
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
		super(x,y,radius*2,radius*2,c);
		this.radius=radius;
	}
	
	/**
	 * @param f The GeometricalForm that defines the position of the circle.
	 * @param radius The radius of the circle.
	 * @param c The color of the circle.
	 */
	public Circle(GeometricalForm f, int radius, Color c){
		super(f,radius*2,radius*2,c);
		this.radius=radius;
	}

	@Override
	public int getPerimeter() {
		return (int) (2*Math.PI*radius+0.5);
	}
	
	@Override
	public int getArea() {
		return (int) (Math.PI*radius*radius+0.5);
	}
	
	//Väljer här att ha egna getArea och getPerimeter för en cirkel, då dessa är enklare och exaktare uttryck.
}