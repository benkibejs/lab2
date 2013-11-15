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
	 * @param x1 The x-coordinate at the first point of the line
	 * @param y1 The y-coordinate at the first point of the line
	 * @param x2 The x-coordinate at the last point of the line
	 * @param y2 The y-coordinate at the last point of the line
	 * @param c The color of the line.
	 * @throws IllegalPositionException
	 */
	public Line(int x1, int y1, int x2, int y2, Color c) throws IllegalPositionException{
		if(x1<x2) {
			
		}else{
			
		}
		if(y1<x2){
			
		}else{
			
		}
	}
	/**
	 * @param f1 This GeometricalForms position is the first point of the line.
	 * @param f2 This GeometriclaForms position is the last point of the line
	 * @param c The color of the line.
	 */
	public Line(GeometricalForm f1, GeometricalForm f2, Color c){
		
	}
	
	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(GeometricalForm f) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void fill(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}
