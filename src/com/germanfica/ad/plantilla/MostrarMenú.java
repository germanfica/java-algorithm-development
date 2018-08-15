package com.germanfica.ad.plantilla;

import java.util.Scanner;

public class MostrarMenú {
	public static void mostrarCartelDeOpciones() {
		System.out.print(
				"[0] Salir (IMPLEMENTADO)\n" +
				"[1] Mostrar por pantalla los caracteres de las posiciones pares del arreglo de caracteres\n" +
				"[2] Mostrar por pantalla los caracteres almacenados en el arreglo en orden inverso.\n" +
				"[3] Contar cuantas veces aparece un carácter dado\n"
				);
	}
	
	/**
	 * Mostrar menú de la aplicación
	 * Los módulos no deben ocupar más de una pantalla
	 */
	private static Scanner sc; // Esto es necesario para poder usar el Scanner en la clase
	public static void mostrarMenú() {
		boolean salir = false;
		int opción;
		
		// Mensaje de bienvenida
		System.out.println("Bienvenido a la consola de la aplicación");
		
		while(!salir) {
			sc = new Scanner(System.in);
			
			// Mostrar cartel con las opciones
			mostrarCartelDeOpciones();
			
			// Leer opción del menú principal
			opción = sc.nextInt();
			
			switch (opción) {
			case 0: salir = true; break;
			case 1: ;break; // Opción 1
			case 2:	;break; // Opción 2
			case 3:	;break; // Opción 3
			default: System.err.println("Esta opción no está definida. Seleccione una de las siguientes opciones:"); break;
			}
		}
	}
	
	public static void main(String[] args) {
		mostrarMenú();
	}
}
