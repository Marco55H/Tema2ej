package tema2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//definimos la variable num1
		int num1;
		//definimos la variable num2
		int num2;
		//Iniciamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos por pantalla el siguiente mensaje
		System.out.println("Dime el número 1");
		//Leemos la variable num1
		num1=sc.nextInt();
		
		//Imprimimos por pantalla el siguiente mensaje
		System.out.println("Dime el número 2");
		//Leemos la variable num2
		num2=sc.nextInt();
		
		//Creamos un condicional if-else, si num1 es igual a num2 
		if (num1==num2) {
			//Imprimimos por pantalla el siguiente mensaje
			System.out.println("Tus números son iguales");
			//El else, se dará si num1 es distinto de num2
		}	else {
			//Imprimimos por pantalla el siguiente mensaje
				System.out.println("Tus números son distintos");
		}
		//Cerramos el escaner
		sc.close();
	}

}