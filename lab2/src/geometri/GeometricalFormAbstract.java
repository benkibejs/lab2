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
	private int posX;
	/**
	 * The y-coordinate of the geometrical form.
	 */
	private int posY;
	/**
	 * The width of the geometrical form.
	 */
	private int width;
	/**
	 * The height of the geometrical form.
	 */
	private int height;
	/**
	 * The color of the geometrical form.
	 */
	private Color color;
	
	public GeometricalFormAbstract(int x, int y, int w, int h, Color c) throws IllegalPositionException{
		if ( x<0 || y<0 ) throw new IllegalPositionException();
		posX=x;
		posY=y;
		width=w;
		height=h;
		color=c;
	}
	
	public GeometricalFormAbstract(GeometricalForm f,int w, int h, Color c){
		posX=f.getX();
		posY=f.getY();
		width=w;
		height=h;
		color=c;
	}
	
	@Override
	public int getX() {
		return posX;
	}
	
	@Override
	public int getY() {
		return posY;
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
