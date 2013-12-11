package geometri;

import java.awt.*;

public class Line extends GeometricalFormAbstract{
	/**
	 * the direction of the line. (1 means that y increases as x increases, else 0)
	 */
	protected int direction;
	
	/**
	 * @param x1 The x-coordinate at the first point of the line.
	 * @param y1 The y-coordinate at the first point of the line.
	 * @param x2 The x-coordinate at the last point of the line.
	 * @param y2 The y-coordinate at the last point of the line.
	 * @param c The color of the line.
	 * @throws IllegalPositionException
	 */
	public Line(int x1, int y1, int x2, int y2, Color c) throws IllegalPositionException{
		super( x1*(x1<x2 ? 1 : 0) + x2*(x2<x1 ? 1 : 0), 
				y1*(y1<y2 ? 1 : 0) + y2*(y2<y1 ? 1 : 0), 
				Math.abs(x2-x1), Math.abs(y2-y1), c);
		
		direction = ((getX() == x1 && getY() == y1) || (getX() == x2 && getY() == y2)) ? 1 : 0;
	}
	/**
	 * @param f1 The GeometricalForm that defines the position of the first point of the line.
	 * @param f2 The GeometricalForm that defines the position of the last point of the line.
	 * @param c The color of the line.
	 */
	public Line(GeometricalForm f1, GeometricalForm f2, Color c){
		super(f1, Math.abs(f2.getX()-f1.getX()), Math.abs(f2.getY()-f1.getY()), c);
		if (f2.getX()<f1.getX()) place(f2.getX(),getY());
		if (f2.getY()<f1.getY()) place(getX(),f2.getY());
		
		direction = ((getX() == f1.getX() && getY() == f1.getY()) || (getX() != f1.getX() && getY() != f1.getY())) ? 1 : 0;
	}

	@Override
	public int getPerimeter() {
		return (int) Math.sqrt(getWidth() * getWidth() + getHeight() * getHeight());
	}
	
	@Override
	public int getArea() {
		return 0;
	}
	
	@Override
	public void fill(Graphics g) {
		g.setColor(getColor());
		g.drawLine(getX(), getY() - (direction-1)*getHeight(), getX() + getWidth(), getY() + direction*getHeight());
	}

}
