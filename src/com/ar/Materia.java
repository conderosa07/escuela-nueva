package com.ar;

public class Materia {
	
	private String nombre;
	private int nota;
	
	public Materia () { //constructor vacio
		
	}	
	public Materia(String nombre, int nota) { //constructor 
		this.nombre = nombre;
		this.nota = nota;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
}
