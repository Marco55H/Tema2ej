package tema2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
	//definimos la variable
	double num1;
	//Iniciamos el escaner
	Scanner sc = new Scanner(System.in);
	sc.useLocale(Locale.US);
	
	//Presentamos el siguiente enunciado
	System.out.println("Escriba su número");
	//Leemos por el teclado nuestra variable
	num1=sc.nextFloat();
	
	
    //Creamos un if, si se dan las condiciones el número es casi cero
	if(num1!=0 && num1<1 && num1>-1) {
		//Presentamos el siguiente enunciado
		System.out.println("Tu número  es casi-cero");}
	//En el else if se da si el num1 es 0
	else if(num1==0) {
		//Presentamos el siguiente enunciado
        System.out.println("Tu número es 0");
	}
	//En el else  se da si no se cumple nada de lo anterior
	else {
		
		
		//Presentamos el siguiente enunciado
		System.out.println("Tu número no es casi-cero");}
	//Cerramos el escaner
	sc.close();
	
	}
}

