package geometri;

import java.awt.*;

public class Oval extends GeometricalFormAbstract{
	/**
	 * The width of the oval.
	 */ 
	protected int width;
	/**
	 * The height of the oval.
	 */
	protected int height;
	 
	/**
	 * @param x The x-coordinate of the oval.
	 * @param y The y-coordiante of the oval.
	 * @param The width The width of the oval.
	 * @param The height The height of the oval.
	 * @param c The color of the oval.
	 * @throws IllegalPositionException
	 */
	public Oval(int x, int y, int width, int height, Color c) throws IllegalPositionException{
		if ( x<0 || y<0 ) throw new IllegalPositionException();
		posX=x;
		posY=y;
		color = c;
		this.width = width;
		this.height = height;
	}
	/**
	 * @param f The GeometricalForm that defines the position of the oval.
	 * @param width The width of the oval.
	 * @param height The height of the oval.
	 * @param c The color of the oval.
	 */
	public Oval(GeometricalForm f, int width, int height, Color c){
		posX = f.getX();
		posY = f.getY();
		color = c;
		this.width = width;
		this.height = height;
	 
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
	public int getPerimeter() {
		return (int) (Math.PI*Math.sqrt(2*(width*width+height*height - (width-height)*(width-height)/2) )+0.5);
	}
	
	@Override
	public int getArea() {
		return (int) (Math.PI*width*height+0.5);
	}
	
	@Override
	public void fill(Graphics g) {
		//g.drawOval(getX(), getY(), getWidth(), getHeight());
		g.setColor(color);
		g.fillOval(getX(), getY(), getWidth(), getHeight());
	}


}
