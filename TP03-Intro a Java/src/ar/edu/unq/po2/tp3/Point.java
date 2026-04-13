package ar.edu.unq.po2.tp3;

public class Point {

	private int x = 0;
	private int y = 0;
	
	public int getX() {return x;}
	public void setX(int x) {this.x = x;}

	public int getY() {return y;}
	public void setY(int y) {this.y = y;}
	
	
	// Privada porque solo quiero utilizarla con el constructor
	private void setXY(int newX, int newY) {
		setX(newX); setY(newY);
	}
	
	public Point() {
		setXY(0,0);
	}
	
	public Point(int x, int y) {
		setXY(x,y);
	}
	
	// Esta funcion parece casi que una referencia del metodo utilizado en el constructor .¿?
	public void mover(int newX, int newY) {
		setXY(newX,newY);
	}
	
	public Point sumarCon(Point aPoint) {
		return new Point(
					this.getX() + aPoint.getX(),  // <- con el getter sumo los Xs, y lo mismo con los Ys
					this.getY() + aPoint.getY());
	}
	
	
	
	
}
