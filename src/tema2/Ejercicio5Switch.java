package tema2;

import java.util.Scanner;

public class Ejercicio5Switch {
	public static void main(String[] args) {

			//definimos la variable carnet
			String carnet;
			//Iniciamos el escaner
			Scanner sc = new Scanner(System.in);
     carnet=sc.nextLine();
			
			
	 //Creamos otro switch según el permiso que tienes, según el que pongas el programa te responderá una cosa u otra
	 switch (carnet) {
	case "E" :
		System.out.println("Enhorabuena, tienes el permiso de Remolques");
	    break;
	case "D" :
		System.out.println("Enhorabuena, tienes el permiso de Autobuses");
		break;	
	case  "C1","C2","C5","C4","C3":
		System.out.println("Enhorabuena, tienes el permiso de Camiones");
		break;
	case "A":
		System.out.println("Enhorabuena, tienes el permiso de Motocicletas");
		break;
	case "B1","B2":
		System.out.println("Enhorabuena, tienes el permiso de Automóviles");
		break;
	default :
		System.out.println("Categoría no contemplada");
}
	 sc.close();
}
}