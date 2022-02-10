package com.generation;

public class Cuadrado extends FiguraGeometrica {
	
	public Cuadrado() {
		super("Cuadrado"); //super para llamar al constructor padre
		
	}

	@Override
	public float calcularArea() {
		return getAlto() * getLargo();
	}

	@Override
	public float perimetro() {
		return (getAlto() + getLargo()) * 2;
	}
	
}
