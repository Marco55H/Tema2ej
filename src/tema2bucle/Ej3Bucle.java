package tema2bucle;

import java.util.Scanner;

public class Ej3Bucle {
	public static void main(String[] args) {
		
		//Definimos la variable que guadará la suma de los números
		int suma=0;
		//Definimos la variable que pediremos al usuario
		int num;
		//Definimos la variable que guardará la cantidad de números
		int cantnum=0;
		//Definimod la variable que guardará la media de todos los números introducidos
		float media;
		
		//Iniciamos el escáner
		Scanner sc=new Scanner(System.in);
		
		// el número
		System.out.println("Introduce en número. Negativo para salir.");
		num=sc.nextInt();
		
		//creamos el while para cuando la variable num sea mayor que 0
		while(num >= 0) {
			//Comenzamos a almacenar la suma de los números introducidos
		suma +=num;
		//Comenzamos a almacenar la cantidad de los números introducidos
		cantnum = cantnum + 1;
		//Pedimos otro número para repetir el bucle
		System.out.println("Introduce en número. Negativo para salir.");
		num=sc.nextInt();
		}
		media =(float) suma/cantnum;
		
		//Presentamos en la pantalla la solución
		System.out.println("La media de los números que has escrito es de :" + media);

		//Cerramos escáner
		sc.close();
		
	}
}
