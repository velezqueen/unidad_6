package deberes6;

import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ejer2 {

	public static void main(String[] args) {
		int cantidad_numeros ;
		int min, max;
		int i;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("introduce la cantidad de numeros \n");
		cantidad_numeros = teclado.nextInt();
	
		System.out.println("introduce min \n");
		min = teclado.nextInt();
		
		System.out.println("introduce max");
		max = teclado.nextInt();
		
		 for (i =0; i < cantidad_numeros; i++) {
			 System.out.println("numero random " + i +"="+ generar_numero(min, max));
		 }
		
	}
	 public static int generar_numero (int min, int max) {
		 int numero_random = ThreadLocalRandom.current().nextInt(min, max + 1);
		 return numero_random;
		 
	 }
}
