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
		if ( x1<0 || y1<0 || x2<0 || y2<0) throw new IllegalPositionException();
		
		if (x1<x2){
			posX=x1;
		}
		else{
			posX=x2;
		}
		
		if (y1<y2){
			posY=y1;
		}
		else {
			posY=y2;
		}
		
		if ((posX == x1 && posY == y1) || (posX == x2 && posY == y2)){
			direction = 1;
		}else {
			direction = 0;
		}
		
		width = Math.abs(x2-x1);
		height= Math.abs(y2-y1);
		color = c;
	}
	/**
	 * @param f1 The GeometricalForm that defines the position of the first point of the line.
	 * @param f2 The GeometricalForm that defines the position of the last point of the line.
	 * @param c The color of the line.
	 */
	public Line(GeometricalForm f1, GeometricalForm f2, Color c){
		if(f1.getX()<f2.getX()) posX=f1.getX();
		else posX=f2.getX();
		
		if(f1.getY()<f2.getY())	posY=f1.getY();
		else posY=f2.getY();	
		
		if ((posX == f1.getX() && posY == f1.getY()) || (posX == f2.getX() && posY == f2.getY())){
			direction = 1;
		}else {
			direction = 0;
		}		
		width = Math.abs(f2.getX()-f1.getX());
		height= Math.abs(f2.getY()-f1.getY());
		color = c;
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
		g.setColor(color);
		g.drawLine(posX, posY + (direction-1)*height, posX + width, posY - direction*height);
	}

}
