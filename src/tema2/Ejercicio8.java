package tema2;

import java.util.Scanner;

public class Ejercicio8 {
public static void main(String[] args) {
		
		//definimos num1 como int
		int num1;
		
		//Iniciamos el escáner
		Scanner sc= new Scanner(System.in);
		
		//Pedimos el dato
		System.out.println("¿Cuánto has sacado?");
		//Lo recibimos por el teclado
		num1=sc.nextInt();
		
		//Creamos un if para ver la nota y comparar
		//La nota que tendrá el alumno si está entre el 0 y el 4
		if (num1 >= 0 && num1 <= 4 ) { 
			//Damos la calificación correspondiente
			System.out.println("Has suspendido INSUFICIENTE");
		}
		//La nota que tendrá el alumno si está entre el 5 y el 5
		else if (num1 >= 5 && num1 <= 5 ){
			//Damos la clasificación correspondiente
			System.out.println("SUFICIENTE");
		}
		//La nota que tendrá el alumno si está entre el 6 y el 6
		else if (num1 >= 6 && num1 <= 6 ){
			//Damos la clasificación correspondiente
			System.out.println("BIEN");
		}
		//La nota que tendrá el alumno si está entre el 7 y el 8
		else if (num1 >= 7 && num1 <= 8 ){
			//Damos la clasificación correspondiente
			System.out.println("NOTABLE");
		}
		//La nota que tendrá el alumno si está entre el 9 y el 10
		else if (num1 >= 9 && num1 <= 10 ){
			//Damos la clasificación correspondiente
			System.out.println("ENHORABUENA SOBRESALIENTE");
		}
		//Se dará si el usuario da un número que no está entre el 0 y el 10
		else  {
			//Decimos que ese dato no es viable en nuestro programa
			System.out.println("El número "+num1+ " no se encuentra en el rango permitido por este programa");
		}
		//Cerramos el escáner
		sc.close();
	}
	}

