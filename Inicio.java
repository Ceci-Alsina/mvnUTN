package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Inicio {
	public static void main(String[] args) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		ArrayList<Persona> personas = new ArrayList<Persona>();
	
		while(true) {
		System.out.println("ingrese el nombre");
		String nombre = scan.nextLine();
		System.out.println("ingrese el apellido");
		String apellido = scan.nextLine();
		System.out.println("ingrese la fecha de nacimieto");
		String fechaNac = scan.nextLine();
		
		Persona persona = new Persona();
		persona.setNombre(nombre);
		persona.setApellido(apellido);
		persona.setFechaNac(fechaNac);
		
		personas.add(persona);
		System.out.println("desea agregar otra persona? S o N");
		String respuesta = scan.nextLine();
		
		if(respuesta.equalsIgnoreCase("n")) {
			break; 
		}
		
		
	}
	
		for(Persona persona : personas) {
			System.out.println("-------------------------------");
			System.out.println("nombre: " + persona.getNombre());
			System.out.println("apellido: " + persona.getApellido());
			System.out.println("fecha de nacimiento: " + persona.getFechaNac());
			System.out.println("-------------------------------");
		}

}
}
