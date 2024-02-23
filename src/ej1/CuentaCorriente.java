package ej1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CuentaCorriente {

	public double saldo;
	public int dni;
	public String nombre;
	
	
	//
	public CuentaCorriente(double saldo, int dni) {
		this.saldo = saldo;
		this.dni = dni;
	}
	
	//
	public CuentaCorriente(double saldo, int dni, String nombre) {
		this.saldo = saldo;
		this.dni = dni;
		this.nombre = nombre;
	}


	//saca el dinero guardado en la cuenta. Recibe como parametro el dinero a recoger y devuelve ese dinero
	public boolean sacaDinero(double dineroSacar) {
		
		boolean confirmacion=false;
		
		//si hay cantidad suficiente de dinero
		if(this.saldo>=dineroSacar) {
			
			confirmacion=true;
			
			//se resta la cantidad de dinero
			this.saldo=this.saldo-dineroSacar;

			//se devuelve el dinero a sacar
			return confirmacion;
			
			
		}
		//si no hay suficiente dinero
		else {
//			//el saldo se vuelve 0
//			this.saldo=0;
			
			//devuelve el dinero que tienes
			return confirmacion;
		}
		
		
		
	}
	
	
	//ingresa dinero en la cuenta. No devuelve nada, solo recibe y aumenta
	public void ingresaDinero(double dineroPoner) {
		
		//
		this.saldo+=dineroPoner;
		
	}
	
	
	//muestra la informacion de la persona cuando se llama la funcion
	public void mostrarInfo() {
		//se imprime todo
		System.out.println("Nombre: "+this.nombre);
		System.out.println("DNI: "+this.dni);
		System.out.println("Pasta gansa: "+this.saldo);
	}
	
	
	
	
}
