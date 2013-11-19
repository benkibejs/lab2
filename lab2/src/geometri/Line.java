package geometri;

import java.awt.*;

public class Line extends GeometricalFormAbstract{
	/**
	 * the x coordinate at the down rightmost end of the line.
	 */
	protected int posX2;
	/**
	 * the y coordinate at the down rightmost end of the line.
	 */
	protected int posY2;
	
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
		if(x1<x2) {
			posX=x1;
			posX2=x2;
		}else{
			posX=x2;
			posX2=x1;
		}
		if(y1<y2){
			posY=y1;
			posY2=y2;
		}else{
			posY=y2;
			posY2=y1;			
		}
		color = c;
	}
	/**
	 * @param f1 The GeometricalForm that defines the position of the first point of the line.
	 * @param f2 The GeometricalForm that defines the position of the last point of the line.
	 * @param c The color of the line.
	 */
	public Line(GeometricalForm f1, GeometricalForm f2, Color c){
		if(f1.getX()<f2.getX()) {
			posX=f1.getX();
			posX2=f2.getX();
		}else{
			posX=f2.getX();
			posX2=f1.getX();
		}
		if(f1.getY()<f2.getY()){
			posY=f1.getY();
			posY2=f2.getY();
		}else{
			posY=f2.getY();
			posY2=f1.getY();			
		}
		color = c;
	}
	@Override
	public int getWidth() {
		return posX2-posX;
	}
	@Override
	public int getHeight() {
		return posY2-posY;
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
		g.drawLine(posX, posY, posX2, posY2);
	}

}
