package tema2bucle;

import java.util.Random;
import java.util.Scanner;

public class Ej7Bucle {
public static void main(String[] args) {
	Random r=new Random();
	int num1=r.nextInt(1,101);
	int num2;
	Scanner sc=new Scanner(System.in);
	System.out.println("Introduce el número que crees que tienes");
	num2=sc.nextInt();
	
	while(num1!=num2 && num2!=-1) {
		if (num2<num1) {
			System.out.println("El número "+num2+"  es más chico que el número que estás buscando.");
		}
		else {
			System.out.println("El número "+num2+"  es más grande que el número que estás buscando.");	
		}
		System.out.println("Introduce otro número, -1 para rendirte.");	
		num2=sc.nextInt();
	}
	System.out.println("Terminaste");
	sc.close();
}
}
