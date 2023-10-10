package tema2;

import java.util.Scanner;

public class Ejercicio4switch {
	public static void main(String[] args) {
		
	
	//
	
	int num1, num2, suma;
	String numero, numero2;
	// Inizializamos el escaner
	Scanner sc = new Scanner(System.in);

	//Pedimos la puntuación de la tirada 1 
	System.out.println("Introduce tu primera puntuación en mayúsculas");
	// la leemos del teclado
	numero=sc.nextLine();
	
	//Pedimos la puntuación de la tirada 2 
	System.out.println("Introduce tu segunda puntuación en mayúsculas");
	// la leemos del teclado
	numero2=sc.nextLine();

	//Creamos un switch dependiendo de la tirada del usuario se dará un valor a num1 u otro
	 switch (numero) {

	case "UNO" :
		num1=1;
	    break;
	case "DOS" :
		num1=2;
        break;
	case  "TRES":
		num1=3;
		break;
	case "CUATRO":
		num1=4;
		break;
	case "CINCO":
		num1=5;
		break;
	case "SEIS":
		num1=6;
		break;
	default :
		num1=13;
	 }
	 
	 //Creamos otro switch según la 2º tirada pero en vez de darle los valores a num1 se los damos a num2
	 switch (numero2) {
	case "UNO" :
		num2=1;
	    break;
	case "DOS" :
		num2=2;
		break;	
	case  "TRES":
		num2=3;
		break;
	case "CUATRO":
		num2=4;
		break;
	case "CINCO":
		num2=5;
		break;
	case "SEIS":
		num2=6;
		break;
	default :
		num2=12;
	 }
	 //tenemos un if, si num1 o num2 es mayor que 10, el número no será aceptado, si los dos son menores se sumarán
	 if (num1<10 && num2<10) {
		 //hacemos la suma
		 suma=num1+num2;
		 //Damos el resultado
		 System.out.println("La primera tirada "+num1+ " mas la segunda tirada "+num2+" es = " +suma);
	 }
	  else {
		  System.out.println("Error, algún número no es correcto");
	  }
	 //Cerramos el escaner
	 sc.close();
		}
}
