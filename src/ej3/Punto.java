package ej3;

public class Punto {
	
	private int x=0;
	private int y=0;
	
	
	
	
	
	public Punto(int x, int y) {
		/*
		 * Elena dice que no pongas el super y si lo tiene que lo quites
		 */
		//super();
		this.x = x;
		this.y = y;
	}
	
	
	public int getX() {
		return x;
	}
	
	
	public int getY() {
		return y;
	}
	
	
	/**
	 * Modifica ambas coordenadas.
	 * @param x
	 * @param y
	 */
	public void setXY(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	/**
	 * Desplaza el punto la cantidad (dx,dy) indicada. 
	 * Ejemplo: Si el punto (1,1) se desplaza (2,5) entonces estará en (3,6).
	 * @param dx
	 * @param dy
	 */
	public void desplaza(int dx, int dy) {
		this.x+=dx;
		this.y+=dy;
	}
	
	/**
	 * 
	 * @param p clase con dos parametros con valores
	 * @return la distancia entre los dos puntos
	 */
	public int distancia(Punto p) {
		
		//se crea la variable a devolver
		int xy=0;
		
		//se calcula el xy
		xy=(int)(Math.sqrt((p.x-this.x)+(p.y-this.y)));
		
		// se devuelve xy
		return xy;
	}
	
	
	
}
