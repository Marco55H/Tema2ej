package tema2;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		//definimos la variable num1
		int num1;
		//definimos la variable num2
		int num2;
		//definimos la variable num2
		int num3;
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
		
		//Imprimimos por pantalla el siguiente mensaje
		System.out.println("Dime el número 3");
		//Leemos la variable num3
		num3=sc.nextInt();
		
		//Creamos un condicional if-else, si num1 + num2 es num3
		if (num1+num2 == num3 ) {
			//Imprimimos por pantalla el siguiente mensaje
			System.out.println("La suma de "+num1+" y "+num2+" es igual a "+num3+" ¡Bien Hecho!");
			//El else if, se dará si num3 + num1  es igual a num2
		}
			else if (num3+num1 == num2) {
				//Imprimimos por pantalla el siguiente mensaje
				System.out.println("La suma de "+num1+" y "+num3+" es igual a "+num2+" ¡Bien Hecho!");
		
		//El else if, se dará si num3 + num2  es igual a num1
		}
			else if (num3+num1 == num2) {
				//Imprimimos por pantalla el siguiente mensaje
				System.out.println("La suma de "+num2+" y "+num3+" es igual a "+num1+" ¡Bien Hecho!");
		}
		
			else {
			//Imprimimos por pantalla el siguiente mensaje
				System.out.println("La suma de cualquier combinación de dos tus números no dará como resultado el otro de tus números ¡Intentalo de nuevo!");
		}
		//Cerramos el escaner
		sc.close();
	}


}
