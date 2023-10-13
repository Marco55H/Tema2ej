package tema2bucle;

import java.util.Scanner;

public class Ej1Bucle {
	public static void main(String[] args) {

		// Definimos la variable que guadará la suma de los números
		int suma = 0;
		// Definimos la variable que pediremos al usuario
		int num;

		// Iniciamos el escáner
		Scanner sc = new Scanner(System.in);

		// el número
		System.out.println("Introduce en número. Negativo para salir.");
		num = sc.nextInt();

		// creamos el while para cuando la variable num sea mayor que 0
		while (num >= 0) {
			// Comenzamos a almacenar la suma de los números introducidos
			suma += num;
			// Pedimos otro número para repetir el bucle
			System.out.println("Introduce en número. Negativo para salir.");
			num = sc.nextInt();
		}

		// Presentamos en la pantalla la solución
		System.out.println("La suma de los números que has escrito es de :" + suma);

		// Cerramos escáner
		sc.close();
	}
}
