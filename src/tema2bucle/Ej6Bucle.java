package tema2bucle;

import java.util.Scanner;

public class Ej6Bucle {
	public static void main(String[] args) {

		// Definimos la variable que pediremos al usuario
		int num;
		// definimos la variable total de la suma de las edades
		int total = 0;
		// definimos la variable que se encargará de contar la cantidad de edades que
		// introducimos
		int cant = 0;
		// definimos la variable que nos guardará la media
		float media;
		// Definimos la variable que nos dará la cantidad de mayores de edad que tenemos
		int cant18 = 0;

		// Iniciamos el escáner
		Scanner sc = new Scanner(System.in);

		// pedimos el número
		System.out.println("Introduce una edad, negativo para salir.");
		num = sc.nextInt();

		// Hacemos un while para cuando la edad no sea negativa
		while (num >= 0) {
			//// Sumamos a la cantidad de números un número más
			cant = cant + 1;
			// añadimos el nuevo número a la suma total de edades
			total = num + total;
			// creamos el if para comprobar que nuestro alumno es mayor de edad (+18)
			if (num >= 18) {
				// Si tiene más de 18 años será mayor de edad por lo que le sumaremos 1 a la
				// variable
				cant18++;
			}
			// Volvemos a pedir los datos al usuario para que el bucle se repita
			System.out.println("Introduce una edad, negativo para salir.");
			num = sc.nextInt();
		}
		// Calculamos la media de edades una vez fuera del bucle
		media = (float) total / cant;
		// Damos al usuario la media de edades
		System.out.println("La media de edad es de " + media);
		// damos al usuario el total de edades
		System.out.println("La suma de todas las edades es de " + total);
		// damos al usuario el total de alumnos que son mayores de edad
		System.out.println("Tienes " + cant18 + " alumnos mayores de edad");
		// Damos a conocer que el programa ha terminado
		System.out.println("Fin");

		// Cerramos escáner
		sc.close();
	}
}
