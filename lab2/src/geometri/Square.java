package geometri;

import java.awt.*;

public class Square extends GeometricalFormAbstract{

	/**
	 * @param x The x-coordinate of this square.
	 * @param y The y-coordinate of this square.
	 * @param side The length of the side of the square.
	 * @param c The color of the square.
	 * @throws IllegalPositionException
	 */
	public Square(int x, int y, int side, Color c) throws IllegalPositionException{
		if ( x<0 || y<0 ) throw new IllegalPositionException();
		posX=x;
		posY=y;
		width = side;
		height = side;
		color = c;
		
	}
	
	/**
	 * @param f The GeometricalForm that defines the position of the square.
	 * @param side The length of the side of the square.
	 * @param c The color of the square.
	 */
	public Square(GeometricalForm f, int side, Color c){
		posX = f.getX();
		posY = f.getY();
		color = c;
		width = side;
		height = side;
	}

	@Override
	public int getPerimeter() {
		return width*4;
	}

	@Override
	public int getArea() {
		return width*height;
	}

	@Override
	public void fill(Graphics g) {
		g.setColor(color);
		g.fillRect(posX, posY, width, height);
	}

}
