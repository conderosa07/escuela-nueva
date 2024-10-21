package com.ar;
import java.util.ArrayList;
import java.util.List;
public class Alumno {
	
	private String apellido;
	java.util.List<Materia> materias;
	int edad;
	String direccion;
	
	public Alumno(String apellido, java.util.List<Materia> materias, int edad, String direccion) {

		this.apellido = apellido;
		this.materias = materias;
		this.edad = edad;
		this.direccion = direccion;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public List<Materia> getMaterias() {
		return materias;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
