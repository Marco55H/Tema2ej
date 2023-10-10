package tema2;

import java.util.Scanner;

public class Ejercicio1Switch {
	public static void main(String[] args) {
		//Definimos la variable nota, será la que intruduzca el usuario
int nota;
// Inizializamos el escaner
Scanner sc = new Scanner(System.in);

//Pedimos la nota
System.out.println("Introduce tu nota ( solo números enteros)");
// la leemos del teclado
nota=sc.nextInt();

//Creamos un switch dependiendo de la nota del usuario nos devolverá una frase u otra
 switch (nota) {

case 1,2,3,4 :
	System.out.println("Suspenso");
    break;
case 5 :
	System.out.println("Suficiente");

case  6:
	System.out.println("Bien");
	break;
case 7,8:
	System.out.println("Notable");
	break;
case 9,10:
	System.out.println("Sobresaliente");
	break;
default :
	System.out.println("Ese número no es una nota");
 }
 sc.close();
	}

	}
	

