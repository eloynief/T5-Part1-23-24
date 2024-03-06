package ej4;

public class Articulo {
	
	//iva
	final public static double IVA=21;
	
	private String nombre="";
	
	private double precio=0;
	
	private int cuantosQuedan=0;
	
	
	
	
	
	
	
	
	/**
	 * 
	 * @param nombre 
	 * @param precio
	 * @param cuantosQuedan
	 */
	public Articulo(String nombre, double precio, int cuantosQuedan) {
		//ELENA TE PIDE QUE NO DEJES EL SUPER PORQUE HACE REFERENCIA A LA SUPERCLASE QUE ES ALGO QUE SE VA A DAR
		//super();
		this.nombre = nombre;
		this.precio = precio;
		this.cuantosQuedan = cuantosQuedan;
	}
	

	/**
	 * 
	 * @return precio de venta al público (PVP) con iva incluido. 
	 */
	public double getPVP () {
		double pvp=0;
		
		//se hace el calculo
		pvp=this.precio+(this.precio*(IVA/100));
		
		return pvp;
	}
	
	/**
	 * 
	 * @param descuento
	 * @return PVP con un descuento pasado como argumento.
	 */
	public double getPVPDescuento (int descuento) {
		
		//variable que representa el pvp
		double pvp=0;
		
		double pvpGet=getPVP();

		//se hace el calculo (se podria llamar al metodo)
		pvp=pvpGet-((pvpGet*descuento)/100);
		
		return pvp;
	}
	
	/**
	 * 
	 * @return :
	 * <h4> true </h4> si ha sido posible 
	 * <h4> false </h4> en caso contrario
	 */
	public boolean vender(int cantidad) {
		//
		boolean esVendido=false;
		
		if(this.cuantosQuedan>=cantidad) {
			
			this.cuantosQuedan-=cantidad;
			
			esVendido=true;
		}
		
		else {
			
		}
		
		
		//
		return esVendido;
	}
	
	

	/**
	 * 
	 * @return :
	 * <h4> true </h4> si ha sido posible 
	 * <h4> false </h4> en caso contrario
	 */
	public boolean almacenar(int cantidad) {
		//
		boolean esAlmacenado=false;
		
		if(cantidad>0) {
			
			this.cuantosQuedan+=cantidad;
			
			esAlmacenado=true;
		}
		
		else {
			
			
			
		}
		
		
		//
		return esAlmacenado;
	}


	@Override
	public String toString() {
		String str="";
		
		//
		str+="--------------------\n";
		str+="Datos del Articuno: \n";
		str+="Nombre: "+nombre+"\n";
		str+="Presio: "+precio+"\n";
		str+="Cuantos Quedan??: "+cuantosQuedan+"\n";
		//he puesto la n al final de este lado para que no tenga que poner tantos syso
		str+="--------------------\n";
		
		
		return str;
		
	}
	
	
	
	
	
	
}
