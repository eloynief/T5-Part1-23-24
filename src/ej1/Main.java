package ej1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//objeto de tipo cuentaCorriente
		CuentaCorriente cuenta;
		
		//objeto scanner
		Scanner sc=new Scanner(System.in);
		
		
		int saldo;
		
		menu();
		
		cuenta=new CuentaCorriente();
		
		//cierre de scanner
		sc.close();
	}
	
	
	public static void menu() {
		
		System.out.println("_______________________________");
		System.out.println("penepenepenepenepenepenepenepenepenepenepene");
		System.out.println("Bienbenidu a la kuenta que kieres aser");
		System.out.println("");
		System.out.println("1.Sacar dinero");
		System.out.println("2.Ingresar dinero");
		System.out.println("3.Mostrar información");
		System.out.println("");
		System.out.println("_______________________________");
		
		
		
	}
	
	
	
	

}
