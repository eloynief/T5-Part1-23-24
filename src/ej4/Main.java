package ej4;

public class Main {
	/**
	 * ejecuta el programa
	 * @param args
	 */
	public static void main(String[] args) {
		
		//variable del tipo de la clase
		Articulo a=new Articulo("PEPE", 50, 50);
		
		System.out.println(a);
		
		double pvpDesc,pvp;
		
		//llamar al almacena cantidad
		a.almacenar(500);
		
		System.out.println(a);
		
		a.vender(100);

		System.out.println(a);
		
		pvp=a.getPVP();
		
		pvpDesc=a.getPVPDescuento(50);
		
		
		System.out.println(pvp);
		
		System.out.println();
		
		System.out.println(pvpDesc);
		
	}
	
}
