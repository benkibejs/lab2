package geometri;

import java.awt.*;

/**
 * An abstract for a geometrical form that implements methods and declares 
 * variables that exsist in every implementation of a geometrical form. This
 * to make it easier to make new geometrical forms and minimize work input.
 * 
 * @author Grupp 107: Rasti and Benjamin
 *
 */
public abstract class GeometricalFormAbstract implements GeometricalForm{
	/**
	 * The x-coordinate of the geometrical form.
	 */
	protected int posX;
	/**
	 * The y-coordinate of the geometrical form.
	 */
	protected int posY;
	/**
	 * The color of the geometrical form.
	 */
	protected Color color;
	
	@Override
	public int getX() {
		return posX;
	}
	
	@Override
	public int getY() {
		return posY;
	}
	
	@Override
	public Color getColor() {
		return color;
	}
	
	@Override
	public void place(int x, int y) {
	posX=x;
	posY=y;
	}
	
	@Override
	public void move(int dx, int dy) {
	posX = posX + dx;
	posY = posY + dy;
	}
	
	@Override
	public int compareTo(GeometricalForm f) {
		if (getArea()!=f.getArea()) return getArea()-f.getArea();
		else return getPerimeter()-f.getPerimeter();
	}
	
}
