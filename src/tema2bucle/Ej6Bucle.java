package tema2bucle;

import java.util.Scanner;

public class Ej6Bucle {
	public static void main(String[] args) {
		
		//Definimos la variable que pediremos al usuario
		int num;
		int total=0;
		int cant=0;
		float media;
		//Definimos la variable que nos dará el resto del número entre 2
		int cant18=0;
		
		//Iniciamos el escáner
		Scanner sc=new Scanner(System.in);
		
		// pedimos el número
		System.out.println("Introduce una edad, negativo para salir.");
		num=sc.nextInt();
		
	
		while(num >= 0) {
			cant=cant+1;
	   total=num+total;
		if (num >= 18) {
			cant18++;
		}
			
		System.out.println("Introduce una edad, negativo para salir.");
		num=sc.nextInt();
		}
		media = (float) total/cant;
		System.out.println("La media de edad es de "+media);
		System.out.println("La suma de todas las edades es de "+total);
		System.out.println("Tienes "+cant18+" alumnos mayores de edad");
         //Damos a conocer que el programa ha terminado
		System.out.println("Fin");
		
		//Cerramos escáner
		sc.close();
	}
}


