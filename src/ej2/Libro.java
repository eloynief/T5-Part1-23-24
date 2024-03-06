package ej2;

/**
 * Crea una clase llamada Libro que guarde la información de cada uno de los libros de una biblioteca. 
 * La clase debe guardar el título del libro, autor, número de ejemplares del libro y número de ejemplares prestados. 
 * La clase contendrá los siguientes métodos:
 */
public class Libro {
	
	/*
	 * Variables
	 */
	
	/*
	 * Representa el titulo del libro
	 */
	private String titulo="";

	/*
	 * Representa el autor del libro
	 */
	private String autor="";
	
	/*
	 * representa el nº de ejemplares DEL LIBRO
	 */
	private int ejemplares=0;

	/*
	 * representa el nº de ejemplares PRESTADOS
	 */
	private int prestados=0;
	
	
	
	/*
	 * Consstructores
	 */

	
	//con todos los parametros
	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.prestados = prestados;
	}


	// sin parametros
	public Libro() {
		super();
	}
	
	
	/*
	 * GET SET
	 */

	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public int getEjemplares() {
		return ejemplares;
	}


	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}


	public int getPrestados() {
		return prestados;
	}


	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}
	
	//elena esto es lo que tiene que hacer la funcion ?????
	/**
	 * funcion que aumenta la variable prestados y decrementa los ejemplares
	 * @param prestamo libros a recibir
	 * @return true si la accion se ha hecho el calculo, false si no se ha hecho el calculo
	 */
	public boolean prestamo(int prestamo) {
		
		//comprueba si el prestamo tiwene el valor correcto
		boolean esCorrecto=false;
		
		//comprobamos si el prestamo es mayor que 0
		if(prestamo>0) {
			//si hay suficientes ejemplares
			if(ejemplares>=prestamo) {

				//es correcto se vuelve true
				esCorrecto=true;
				//se hace el calculo de la suma
				prestados+=prestamo;
				
				//se restan los ejemplares
				//ejemplares-=prestamo;
				
			}//fin ejemplares>=prestamo
		}//fin prestamo>0
		
		//se devuelve el boolean
		return esCorrecto;
	}
	
	

	/**
	 * funcion que decrementa prestados y aumenta los ejemplares de libros
	 * @param libros los libros a devolver
	 * @return true si se hizo la accion, false si no se hizo
	 */
	public boolean devolucion(int libros) {
		//comprueba si el prestamo tiwene el valor correcto
		boolean esCorrecto=false;
		
		//si vas a devolver libros
//		if(libros>0) {
		
			//si hay libros prestados
			if(prestados>=libros) {
				
				//es correcto se vuelve true
				esCorrecto=true;
				//
				prestados-=libros;
				
				//ejemplares+=libros;
				
			}
//		}
		
		//se devuelve el boolean
		return esCorrecto;
	}
	
	
	
	

	//to string sin tocar
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", ejemplares=" + ejemplares + ", prestados="
				+ prestados + "]";
	}
	
	
	
	
}
