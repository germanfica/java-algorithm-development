package xyz.germanfica.util;

public class Utils {
	/**
	 * Muestra por pantalla el porcentaje que le queda pendiente
	 * a una tarea determinada
	 * 
	 * @param tiempo es es el tiempo de la tarea
	 */
	public static void porcentajeCompletado(long tiempo) {
		new Thread(()-> {
	           int i = 0;
	           while(i++ < 100) {
	               System.out.print("[");
	               int j=0;
	               while(j++<i){
	                  System.out.print("#");
	               }
	               while(j++<100){
	                  System.out.print(" ");
	               }
	               System.out.print("] : "+ i+"%");
	               try {
	                  Thread.sleep(tiempo); // 1000l
	               } catch (InterruptedException e) {
	                  e.printStackTrace();
	               }
	               System.out.print("\r");
	           }
	        }).start();
	}
}
