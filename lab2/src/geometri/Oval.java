package geometri;

import java.awt.*;

public class Oval extends GeometricalFormAbstract{
	/**
	 * The width of the oval
	 */ 
	protected int width;
	/**
	 * The height of the oval
	 */
	protected int height;
	 
	/**
	 * @param x The x-coordinate of the oval.
	 * @param y The y-coordiante of the oval
	 * @param The width The width of the oval.
	 * @param The height The height of the oval.
	 * @param c The color of the oval.
	 * @throws IllegalPositionException
	 */
	public Oval(int x, int y, int width, int height, Color c) throws IllegalPositionException{
		 
	}
	/**
	 * @param f This GeometricalForms position will be the position of the oval.
	 * @param width The width of the oval.
	 * @param height The height of the oval.
	 * @param c The color of the oval.
	 */
	public Oval(GeometricalForm f, int width, int height, Color c){
	 
	 
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
