package xyz.germanfica.ad._2017.tp3;

import xyz.germanfica.util.TecladoIn;

public class Ej3 {
	
	// 1- Consultar la cantidad de espacios en blano que hay en la cadena ingresada (INEFICIENTE, porque se recorre dos veces)
	public static int ObtenerCantidadDeEspaciosEnBlanco(String cadena){
		int resultado = 0;
			for (int i = 0; i < cadena.length(); i++) {
				if(cadena.charAt(i)==' ')
					resultado=resultado+1;
			}
		return resultado;
	}
	
	// 2- Almacenar en la cadena todas las palabras encontradas.
	public static String[] AlmacenarPalabrasEnElArreglo(String cadena){
		String[] resultado;
		String palabra=""; 
		int temporal=0;
		
		resultado = new String[30];
		
		for (int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i)!=' '){
				palabra=palabra+cadena.charAt(i);
			}else{
				resultado[temporal]=palabra;
				temporal=temporal+1;
				palabra="";
			}
		}
		return resultado;
	}
	
	public static String MostrarPalabra(String cadena, int posicion){
		String resultado="";
		String[] arreglo;
		arreglo = new String[30];
		arreglo = AlmacenarPalabrasEnElArreglo(cadena);
		resultado= arreglo[posicion];
		return resultado;
	}
	
	public static void main(String[] args) {
		String cadena;
		int opcion = 0;
		System.out.println("Ingrese cadena de caracteres: ");
		cadena = TecladoIn.readLine();
		while(opcion!=999){
			if(opcion<29){
				opcion = TecladoIn.readInt();
				System.out.println(MostrarPalabra(cadena, opcion));
			}else{
				System.out.println("Te exediste.");
				opcion=0;
			}
		}
	}
}
