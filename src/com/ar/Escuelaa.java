package com.ar;

import java.util.List;

import java.util.ArrayList;
import java.util.Iterator;

public class Escuelaa {
	
	String materia;
	String alumno; 

	public static void main (String args[]) {

		List<Materia> materiasRosa = new ArrayList<Materia>();
		List<Materia> materiasJoaquin = new ArrayList<Materia>();
		List<Alumno> alumnos = new ArrayList<Alumno>();
		
		Materia m = new Materia();
		 
		Materia lenguaRosa = new Materia("Lengua",7);
		Materia matematicaRosa = new Materia("Matemática",9);
		Materia fisicaRosa = new Materia("Física",5);

		Materia lenguaJoaquin = new Materia("lengua",8);
		Materia matematicaJoaquin = new Materia("Matemática",8);
		Materia fisicaJoaquin = new Materia("Física",9);
		
		materiasJoaquin.add(matematicaJoaquin);
		materiasJoaquin.add(lenguaJoaquin);
		materiasJoaquin.add(fisicaJoaquin);
		
		materiasRosa.add(matematicaRosa);
		materiasRosa.add(lenguaRosa);
		materiasRosa.add(fisicaRosa);
		
		Alumno lucas = new Alumno("lucas", materiasRosa,5,"zavaleta");
		Alumno joaquin = new Alumno("joaquin", materiasRosa,2,"av caseros");
		Alumno cande = new Alumno("cande", materiasRosa,8,"monte agudo");
		
		alumnos.add(lucas);
		alumnos.add(joaquin);
		alumnos.add(cande);

		System.out.println("Imprimiendo todas los nombres de las materias:");
		for (int i = 0; i < materiasRosa.size(); i++) {
			System.out.println(materiasRosa.get(i).getNombre());
			
		}
		
		System.out.println("Imprimiendo todas las materias");
		for (int i = 0; i < materiasRosa.size(); i++) {
			System.out.println(materiasRosa.get(i).getNombre());
		}
		
		System.out.println("Imprimiendo las notas de las materias");
		for (int i = 0; i < materiasRosa.size(); i++) {
			System.out.println(materiasRosa.get(i).getNota());
			
		}
		
		System.out.println("");
		System.out.println("---Imprimiendo todos los apelldos de los alumnos---");
		
		for (int i = 0; i < alumnos.size(); i++) {
			System.out.println("Apelldio del Alumno en la posición [" + i + "]: " + alumnos.get(i).getApellido());
		}
		
		System.out.println("");
		System.out.println("---Imprimiendo todas las materias de los alumnos---");
		
		for (int i = 0; i < alumnos.size(); i++) {
			System.out.println("Materias del Alumno en la posición [" + i + "]: " + alumnos.get(i).getApellido());
			for (int j = 0; j < alumnos.get(i).getMaterias().size(); j++) {
				System.out.print(" - " + alumnos.get(i).getMaterias().get(j).getNombre());
			}
		}
		
	}
	
}

