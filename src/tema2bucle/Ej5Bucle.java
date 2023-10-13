package tema2bucle;

import java.util.Scanner;

public class Ej5Bucle {
	public static void main(String[] args) {
		float medianeg =0;
		int sumneg=0;
		int cantneg=0;
        int sumpos=0;
		int cant0 = 0;
		int num;
		int cantnum = 0;
		Scanner sc = new Scanner(System.in);

		while (cantnum < 10) {
			System.out.println("Introduce el número. Llevas " +cantnum+ " números" );
			num=sc.nextInt();
			cantnum=cantnum+1;

			if (num == 0) {
				cant0 = cant0 + 1;
			}
				else if (num > 0) {
					sumpos+=num;
					
				} else if (num < 0) {
					
					cantneg=cantneg+1;
					sumneg+=num;
					
				
				}
			}
		medianeg=(float)sumneg/cantneg;
		
		System.out.println("Tienes "+cant0+" números 0");
		System.out.println("La suma de los números positivos es "+sumpos);
		System.out.println("La media de los números negativos es de "+medianeg );
		sc.close();
	}
}
