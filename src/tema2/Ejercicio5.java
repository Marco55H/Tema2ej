package tema2;

import java.util.Scanner;

public class Ejercicio5 {
public static void main(String[] args) {
	//definimos la variable num1
		int num1;
		//definimos la variable num2
		int num2;
		//definimos la variable num3
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
		
		//Creamos un condicional if-else, para comparar los 13 casos posibles entres los 3 números
		if (num1>num2 && num1>num3 && num2>num3) {
			//Imprimimos por pantalla el siguiente mensaje
			System.out.println(""+num1+ ">" +num2+ " >" +num3);}
			//El else, se dará si num1 es distinto de num2
		else if (num1>num2 && num1>num3 && num2<num3){
			//Imprimimos por pantalla el siguiente mensaje
				System.out.println(""+num1+ ">" +num3+ " >" +num2);}
		
		else if (num1>num2 && num1>num3 && num2==num3){
			//Imprimimos por pantalla el siguiente mensaje
				System.out.println(""+num1+ ">" +num2+ " = " +num3);}
		
		else if (num2>num1 && num2>num3 && num1<num3){
			//Imprimimos por pantalla el siguiente mensaje
				System.out.println (""+num2+ ">" +num3+ " >" +num1);}
		
		else if (num2>num1 && num2>num3 && num3<num1){
			//Imprimimos por pantalla el siguiente mensaje
				System.out.println(""+num2+ " > " +num1+ " > " +num3);}
		
		else if (num2>num1 && num2>num3 && num3==num1){
			//Imprimimos por pantalla el siguiente mensaje
				System.out.println(""+num2+ " > " +num1+ " = " +num3);}
		
		else if (num3>num2 && num3>num1 && num2<num1){
			//Imprimimos por pantalla el siguiente mensaje
				System.out.println(""+num3+ " > " +num1+ " > " +num2);}
		
		else if (num3>num2 && num3>num1 && num2>num1){
			//Imprimimos por pantalla el siguiente mensaje
				System.out.println(""+num3+ " > " +num2+ " > " +num1);}
				
		else if (num3>num2 && num3>num1 && num2==num1){
			//Imprimimos por pantalla el siguiente mensaje
				System.out.println(""+num3+ " > " +num2+ " = " +num1);}
		
		else if (num2<num3 && num2<num1 && num3==num1){
			//Imprimimos por pantalla el siguiente mensaje
				System.out.println(""+num1+ " = " +num3+ " > " +num2);}
		
		else if (num1<num2 && num1<num3 && num3==num2){
			//Imprimimos por pantalla el siguiente mensaje
				System.out.println("" +num2+ " = " +num3+ " > " +num1) ;}
		
		else if (num3<num2 && num3<num1 && num1==num3){
			//Imprimimos por pantalla el siguiente mensaje
				System.out.println(""+num2+ " = " +num1+ " > " +num3);}
	
		 else{
			//Imprimimos por pantalla el siguiente mensaje
			 System.out.println(""+num1+ " = " +num2+ " = " +num3);}
		
		//Cerramos el escaner
		sc.close();
	}
	}
