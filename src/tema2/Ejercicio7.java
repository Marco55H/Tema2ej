package tema2;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		//definimos num1 como int
		int num1;
		
		//Iniciamos el escáner
		Scanner sc= new Scanner(System.in);
		
		//Pedimos el dato
		System.out.println("Da el dato");
		//Lo recibimos por el teclado
		num1=sc.nextInt();
		
		//Creamos un if para ver el número de cifras que tiene
		if (num1 >= 0 && num1 <= 9 ) { 
			//Damos las dos soluciones 
			System.out.println("El número "+num1+ " tiene 1 cifra");
		}
		//Las cifras que tendrá el número si está entre el 10 y el 99
		else if (num1 >= 10 && num1 <= 99 ){
			//Damos el número de cifras
			System.out.println("El número "+num1+ " tiene 2 cifra");
		}
		//Las cifras que tendrá el número si está entre el 100 y el 999
		else if (num1 >= 100 && num1 <= 999 ){
			//Damos el número de cifras
			System.out.println("El número "+num1+ " tiene 3 cifra");
		}
		//Las cifras que tendrá el número si está entre el 1000 y el 9999
		else if (num1 >= 1000 && num1 <= 9999 ){
			//Damos el número de cifras
			System.out.println("El número "+num1+ " tiene 4 cifra");
		}
		//Las cifras que tendrá el número si está entre el 10000 y el 99999
		else if (num1 >= 10000 && num1 <= 99999 ){
			//Damos el número de cifras
			System.out.println("El número "+num1+ " tiene 5 cifra");
		}
		//Se dará si el usuario da un número que no está entre el 0 y el 99999
		else  {
			//Decimos que ese dato no es viable en nuestro programa
			System.out.println("El número "+num1+ " no se encuentra en el rango permitido por este programa");
		}
		//Cerramos el escáner
		sc.close();
	}
	}


