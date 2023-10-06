package tema2;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		//definimos la variable num1
		int num1;
		//Iniciamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos por pantalla el siguiente mensaje
		System.out.println("Dime el número ¿será par?");
		//Leemos la variable num1
		num1=sc.nextInt();
		
		//Creamos un condicional if-else, si el resto de num1/2 es igual a 0 el número será par
		if (num1%2==0) {
			//Imprimimos por pantalla el siguiente mensaje
			System.out.println("Tu número es par");
			//El else, se dará si el resto de la división es distinto de 0
		}	else {
			//Imprimimos por pantalla el siguiente mensaje
				System.out.println("Tu número es impar");
		}
		//Cerramos el escaner
		sc.close();
	}

}
