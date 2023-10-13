package tema2bucle;

import java.util.Scanner;

public class Ej5Bucle {
	public static void main(String[] args) {
		// Definimos la variable de la media de negativos
		float medianeg = 0;
		// Definimos la variable que será la suma de negativos
		int sumneg = 0;
		// Definimos la variable que será la cantidad de negativos
		int cantneg = 0;
		// Definimos la variable que será la suma de positivos
		int sumpos = 0;
		// Definimos la variable que será la cantidad de ceros
		int cant0 = 0;
		// Definimos la variable num, se´ra la que proporcionará el usuario
		int num;
		// definimos la variable que nos dirá la cantidad total de números que tengamos
		int cantnum = 0;
		// Iniciamos el escaner
		Scanner sc = new Scanner(System.in);

		// Creamos un while que se estará haciendo mientras la cantidad de números
		// introducidos sean menor que 10
		while (cantnum < 10) {
			// Aquí pedimos los números al usuario
			System.out.println("Introduce el número. Llevas " + cantnum + " números");
			num = sc.nextInt();
			// Sumamos a la cantidad de números un número más
			cantnum = cantnum + 1;

			// Creamos un if para diferenciar entre dato proporcionado por el usuario sea 0
			// o no sea 0
			if (num == 0) {
				// Si es 0, la cantidad de 0 en nuestro sistema será incrementado en 1
				cant0 = cant0 + 1;
			}
			// Si nuestro dato no es 0´puede ser mayor que 0 o menor que 0
			// Si es mayor que cero:
			else if (num > 0) {
				// Sumamos todos los números que sean mayor que 0 ente ellos y metemos esa suma
				// en la variable sumpos
				sumpos += num;

				// Si es menos que 0
			} else if (num < 0) {

				// La cantidad de números negativos incrementará en 1
				cantneg = cantneg + 1;
				// Sumamos todos los números que sean menor que 0 ente ellos y metemos esa suma
				// en la variable sumneg
				sumneg += num;

			}
		}
		// Hacemos la media de los números menores que 0 fuera del bucle, para solo
		// hacerlo una vez
		medianeg = (float) sumneg / cantneg;

		// Damos al usuario la cantidad de números 0 que tiene
		System.out.println("Tienes " + cant0 + " números 0");
		// Damos al usuario la suma total de todos los números positivos
		System.out.println("La suma de los números positivos es " + sumpos);
		// Damos al usuario la media de todos los números negativos que ha introducido
		System.out.println("La media de los números negativos es de " + medianeg);

		// Cerramos escáner
		sc.close();
	}
}
