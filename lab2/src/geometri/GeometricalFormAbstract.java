package geometri;

import java.awt.*;

public abstract class GeometricalFormAbstract implements GeometricalForm{
	protected int posX;
	protected int posY;
	protected Color color;
	
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
	public int getX() {
		return posX;
	}
	
	@Override
	public int getY() {
		return posY;
	}
	
	
}
