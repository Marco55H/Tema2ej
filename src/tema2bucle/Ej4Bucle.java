package tema2bucle;

import java.util.Scanner;

public class Ej4Bucle {
	public static void main(String[] args) {

		// Definimos la variable que pediremos al usuario
		int num;
		// Definimos la variable que nos dará el resto del número entre 2
		int rest;

		// Iniciamos el escáner
		Scanner sc = new Scanner(System.in);

		// pedimos el número
		System.out.println("Introduce en número. 0 para salir.");
		num = sc.nextInt();

		// creamos el while para cuando la variable par cuando num no sea 0
		while (num != 0) {

			// Vamos a ver si el valor del resto si dividimos en número entre dos
			rest = num % 2;

			// Comprobamos si el número introducido es par rest=0 o impar rest=1.
			if (rest == 0) {
				System.out.println("El número es par");
			} else {
				System.out.println("El número es impar");
			}

			// Leemos de nuevo el dato
			System.out.println("Introduce otro número. 0 para salir.");
			num = sc.nextInt();
		}
		// Damos a conocer que el programa ha terminado
		System.out.println("Fin");

		// Cerramos escáner
		sc.close();
	}
}
