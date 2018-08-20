package xyz.germanfica.arreglos;

import xyz.germanfica.matematicas.Paridad;

public class ArregloCaracter {
	/**
	 * Cuenta cuantas veces se repite un caracter dado
	 * 
	 * @param caracteres un arreglo de caracteres
	 * @param c es el caracter que vamos a usar para saber si se repite en el arreglo
	 * @return La cantidad de veces que se ha repetido ese caracter
	 */
	public static int esteCaracterSeRepite(char[] caracteres, char c) {
		int cant;
		cant = 0;
		for (int i = 0; i < caracteres.length; i++) {
			if(caracteres[i]==c)
				cant++;
		}
		return cant;
	}
	/**
	 * Mostrar los caracteres de posición par del arreglo
	 */
	public static void mostrarPosPar(char[] caracteres) {
		for (int i = 0; i < caracteres.length; i++) {
			if(Paridad.esPar(i)) {
				System.out.println(caracteres[i]);
			}
		}
	}
	/**
	 * En este módulo voy a mostrar los caracteres del arreglo de caracteres
	 * @param caracteres
	 */
	public static void mostrar(char[] caracteres) {
		for (int i = 0; i < caracteres.length; i++) {
			System.out.println(caracteres[i]);
		}
	}
}