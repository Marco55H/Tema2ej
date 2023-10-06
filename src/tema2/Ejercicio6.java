package tema2;

import java.util.Scanner;

public class Ejercicio6 {
public static void main(String[] args) {
	
	//definimos a como double
	double a;
	//definimos b como double
	double b;
	//definimos c como double
	double c;
	//definimos x1 como double
	double x1;
	//definimos x2 como double
	double x2;
	//Iniciamos el escáner
	Scanner sc= new Scanner(System.in);
	
	//Empezamos a pedir el primer dato
	System.out.println("Da el primer dato");
	//Lo recibimos por el teclado
	a=sc.nextDouble();
	//Pedimos el segundo dato
	System.out.println("Da el segundo dato");
	//Lo recibimos por el teclado
	b=sc.nextDouble();
	//Pedimos el tercer dato
	System.out.println("Da el tercer dato");
	//Lo recibimos por el teclado
	c=sc.nextDouble();
	
	//Creamos un if para ver si la raiz cuadrada se puede resolver
	if (b*b >= 4*a*c) { 
		
		// Si la a es 0 la ecuación es de 1 grado
		if (a==0){ 
			System.out.println("La ecuación es de 1º grado");
			x1 = (-c/b);
			System.out.println("El resultado es "+x1);
		}
		else  {
		//En caso de que si se pueda resolver, calculamos las dos soluciones
		//x1 será la solución en la que la raíz es positiva
		x1 = (- b + Math.sqrt((b*b)-4*a*c)) /2*a;
		//x2 será la solución en la que la raíz es negativa
		x2 = (- b - Math.sqrt((b*b)-4*a*c)) /2*a;
		//Damos las dos soluciones
		System.out.println("Las soluciones de tu ecuación son: " +x1+ " y " +x2);
		}
	//Si la raíz cuadrada tiene un número negativo, no se podrá resolver
	}else {
		//Informamos de que no se puede resolver
		System.out.println("Tu ecuación no tiene solución");
		}

	//Cerramos el escáner
	sc.close();
}
}

