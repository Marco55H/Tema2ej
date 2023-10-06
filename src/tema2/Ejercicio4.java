package tema2;

import java.util.Scanner;

public class Ejercicio4 {
public static void main(String[] args) {
	//definimos la variable num1
	int num1;
	//definimos la variable num2
	int num2;
	//Iniciamos el escaner
	Scanner sc = new Scanner(System.in);
	
	//Pedimos al usuario el primer número
	System.out.println("Dime el número 1");
	//Leemos la variable num1
	num1=sc.nextInt();
	
	//Pedimos al usuario el segundo número
	System.out.println("Dime el número 2");
	//Leemos la variable num2
	num2=sc.nextInt();
	
	//Creamos un condicional if-else, si num1 es mayor a num2 
	if (num1>num2) {
		//Imprimimos por pantalla el siguiente mensaje
		System.out.println("Tus números ordenados son: "+num2+ " < "+num1);
		//El else if, se dará si num1 es igual de num2
		
	} else if (num1==num2){
		//Imprimimos por pantalla el siguiente mensaje
			System.out.println("Tus números son iguales");
	
	    //El else se dará si num2>num1, ya que es lo único que nos queda
	} else{
	    	//Imprimimos por pantalla el siguiente mensaje
		    System.out.println("Tus números ordenados son: "+num1+ " < "+num2);
	 }
	
	//Cerramos el escaner
	sc.close();
}

	
}

