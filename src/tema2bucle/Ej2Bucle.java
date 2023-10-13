package tema2bucle;

import java.util.Scanner;

public class Ej2Bucle {
	public static void main(String[] args) {
		
		//Definimos la variable que guadará la cantidad de números
		int cantnum=0;
		//Definimos la variable que pediremos al usuario
		int num;
		
		//Iniciamos el escáner
		Scanner sc=new Scanner(System.in);
		
		// el número
		System.out.println("Introduce en número. Negativo para salir.");
		num=sc.nextInt();
		
		//creamos el while para cuando la variable num sea mayor que 0
		while(num >= 0) {
			//Comenzamos a almacenar la cantidad de números introducidos
		cantnum=cantnum+1;
		//Pedimos otro número para repetir el bucle
		System.out.println("Introduce en número. Negativo para salir.");
		num=sc.nextInt();
		}
		
		//Presentamos en la pantalla la solución
		System.out.println("La cantidad de números que has escrito es de :"+cantnum);

		//Cerramos escáner
		sc.close();
}
}