package tema2bucle;

import java.util.Scanner;

public class Ej8Bucle {
	public static void main(String[] args) {

		// Creamos la variable arbol1 que será la que introduzca el usuario
		int arbol1;
		// creamos la variable arbol2 que será la que nos guarde el arbol con mayor
		// tamaño
		int arbol2 = 0;
		// Iniciamos el escaner
		Scanner sc = new Scanner(System.in);
		// le decimos al usuario que nos de la altura del arbol
		System.out.println("Introduce la altura en cm del primer árbol");
		arbol1 = sc.nextInt();

		// mientras que la altura del arbol no sea = a -1 se seguirá con el bucle
		while (arbol1 != -1) {
			// Si el arbol1 es mayor que el dato guardado en arbol2, el dato que tiene
			// arbol2 pasará a ser el de arbol1
			if (arbol1 > arbol2) {
				arbol2 = arbol1;
			}
			// pedimos otro dato para seguir con nuestro bucle
			System.out.println("Introduce la altura en cm del próximo árbol, -1 para acabar ");
			arbol1 = sc.nextInt();
		}
		// Diremos al usuario cuanto mide su arbol más grande
		System.out.println("Tu arbol más alto mide: " + arbol2 + "cm");
		sc.close();
	}
}
