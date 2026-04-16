package ar.edu.unq.po2.tp3;

public class Rectangulo {

	private Point[] lados = new Point[4];
	private int base;
	private int altura;
	
	public int getBase() {return base;}
	private void setBase(int base) { this.base = base;}
	
	public int getAltura() { return altura;}
	private void setAltura(int altura) {this.altura = altura;}

	public Rectangulo(int base, int altura) {
		setBase(base); setAltura(altura);
		
		lados[0] = new Point();
		lados[1] = new Point(getBase(), 0);
		lados[2] = new Point(0, getAltura());
		lados[3] = new Point(getBase(), getAltura());
		
	}
	
	// El área de un rectángulo se obtiene multiplicando sus dos dimensiones principales:
	public int getArea() {
		return getBase() * getAltura();
	}
	
	// El perímetro de un rectángulo es la suma de todos sus lados.
	public int getPerimetro() {
		return 2 * (getBase() + getAltura());
	}
	
	// Para que sea considerado Vertical los valores de X no deben moverse en estos Puntos 
	public boolean esVertical() {
	    return getAltura() > getBase();
	}

	// Para que sea considerado Horizontal los valores de Y  no deben moverse en estos Puntos 
	public boolean esHorizontal() {
	    return getAltura() < getBase();
	}
	
}
