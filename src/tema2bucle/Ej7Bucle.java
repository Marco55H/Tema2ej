package tema2bucle;

import java.util.Random;
import java.util.Scanner;

public class Ej7Bucle {
	public static void main(String[] args) {
		// Inicializamos esta función para que nos sea posible crear el número aleatorio
		Random r = new Random();
		// nuestra variable num1 será el número aleatorio
		int num1 = r.nextInt(1, 101);
		// la variable num2 será la que nos proporcionará el usuario
		int num2;
		// iniciamos el escaner
		Scanner sc = new Scanner(System.in);
		// pedimos el número al usuario
		System.out.println("Introduce el número que crees que tienes");
		num2 = sc.nextInt();

		// creamos un while para cuando num1 sea distinto de num2 y para cuando num2 sea
		// distinto de -1
		while (num1 != num2 && num2 != -1) {

			// creamos un if para cuando num2 sea menor que num1
			if (num2 < num1) {
				// indicamos al usuario que el num2 es menos que el num1 para que introduzca un
				// número mayor
				System.out.println("El número " + num2 + "  es más chico que el número que estás buscando.");
			}
			// si num2 es mayor que num1:
			else {
				// indicamos al usuario que el num2 es mayor que el num1 para que introduzca un
				// número menor
				System.out.println("El número " + num2 + "  es más grande que el número que estás buscando.");
			}
			// pedimos otra vez el dato para seguir con nuesto bucle
			System.out.println("Introduce otro número, -1 para rendirte.");
			num2 = sc.nextInt();
		}
		// Indicamos que el programa a terminado
		System.out.println("Terminaste");
		// cerramos escaner
		sc.close();
	}
}
