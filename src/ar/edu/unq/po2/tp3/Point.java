package ar.edu.unq.po2.tp3;

public class Point {
	private int x;
	private int y;
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public Point() {
		this.setX(0);
		this.setY(0);
	}
	public Point(int numX,int numY) {
		this.setX(numX);
		this.setY(numY);
	}
	public void mover(int newX, int newY) {
		this.setX(newX);
		this.setY(newY);
	}
	public Point sumar(Point point) {
		int nuevaX = this.getX() + point.x;
		int nuevaY = this.getY() + point.y;
		return new Point(nuevaX, nuevaY);
	}
	

	
}
