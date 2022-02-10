//esta es la clase padre
package com.generation;

public abstract class FiguraGeometrica {
	//Clases abstractas no puden crear objetos
	//Clases que pueden o no contener métodos abstractos
	//Método abstracto es un metodo que te dice que hacer
	//pero no te dice como hacerlo
	
	//atributos
	private String nombre;
	private float alto;
	private float largo;
	
	//Constructor debe tener el nomre de la clase
	//public FiguraGeometrica() {	} constructor vacio
	
	public FiguraGeometrica(String nombre) {
		this.nombre = nombre;
	}
	
	//encapsulamiento
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public float getAlto() {
		return alto;
	}



	public void setAlto(float alto) {
		this.alto = alto;
	}



	public float getLargo() {
		return largo;
	}



	public void setLargo(float largo) {
		this.largo = largo;
	}

	//*************************************

	public abstract float calcularArea();
	
	public abstract float perimetro();
}
