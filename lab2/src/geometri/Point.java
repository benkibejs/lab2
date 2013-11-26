package geometri;

import java.awt.*;

public class Point extends GeometricalFormAbstract{
	
	/**
	 * @param x The x-coordinate of this point
	 * @param y The y-coordinate of this point
	 * @param c The color of this point
	 * @throws IllegalPositionException
	 */
	public Point(int x, int y, Color c) throws IllegalPositionException{
		if ( x<0 || y<0 ) throw new IllegalPositionException();
		posX=x;
		posY=y;
		width=1;
		height=1;
		color = c;
	}
	/**
	 * @param f This GeometricalForms position will be the position of the point.
	 * @param c The color of the point.
	 */
	public Point(GeometricalForm f, Color c){
		posX = f.getX();
		posY = f.getY();
		width=1;
		height=1;
		color = c;
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
		g.setColor(color);
		g.fillOval(posX, posY, width, height);
	}
}
