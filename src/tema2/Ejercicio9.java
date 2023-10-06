package tema2;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		
		//
		final String PIEDRA = "PIEDRA";
		final String TIJERA = "TIJERA";
		final String PAPEL = "PAPEL";
		//definimos la variable jug1
		String jug1;
		//definimos la variable jug2
		String jug2;
		

		//Iniciamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos al usuario el primer string
		System.out.println("Jugador 1 de su jugada ");
		//Leemos la variable num1
		jug1 = sc.next();
		
		//Pedimos al usuario el segundo string
		System.out.println("Jugador 2 de su jugada ");
		//Leemos la variable num2
		jug2 = sc.next();
		
		//Creamos un condicional if-else, si jug1 es tijera y jug2 piedra 
		if ( jug1.equals(TIJERA) && jug2.equals(PIEDRA)) {
			//Imprimimos por pantalla el siguiente mensaje
			System.out.println("Ha ganado el jugador 2");
				
				
		} else if ( jug1.equals(PAPEL) && jug2.equals(TIJERA)){
			//Imprimimos por pantalla el siguiente mensaje
				System.out.println("Ha ganado el jugador 2");
				
				
					//El else if, se dará si jug1 es piedra y jug2 tijera
		} else if ( jug1.equals(PIEDRA) && jug2.equals(TIJERA)){
			//Imprimimos por pantalla el siguiente mensaje
				System.out.println("Ha ganado el jugador 1");
				
				
		} else if ( jug1.equals(PAPEL) && jug2.equals(PIEDRA)){
			//Imprimimos por pantalla el siguiente mensaje
				System.out.println("Ha ganado el jugador 1");
		
				
		} else if ( jug1.equals(PIEDRA) && jug2.equals(PAPEL)){
			//Imprimimos por pantalla el siguiente mensaje
				System.out.println("Ha ganado el jugador 2");
				
				
		} else if ( jug1.equals(TIJERA) && jug2.equals(PAPEL)){
			//Imprimimos por pantalla el siguiente mensaje
				System.out.println("Ha ganado el jugador 1");
		    //El else se dará si jug1 y jug2 escriben los mismo, ya que es lo único que nos queda
				
		} else if (( jug1.equals(TIJERA) && jug2.equals(TIJERA))||( jug1.equals(PIEDRA) && jug2.equals(PIEDRA))||( jug1.equals(PAPEL) && jug2.equals(PAPEL))){
			//Imprimimos por pantalla el siguiente mensaje
				System.out.println("EMPATE");
		    //El else se dará si jug1 y jug2 escriben los mismo, ya que es lo único que nos queda		
				
		} else{
		    	//Imprimimos por pantalla el siguiente mensaje
			    System.out.println("Esa palabra no existe en el juego");
		 }
		
		//Cerramos el escaner
		sc.close();
	}

}
