package Arreglos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int numeros[] = new int [5];
		int ceros=0,positivos=0, negativos=0;
		int cantidadNegativos=0, cantidadPositivos=0;

		
		for (int i=0; i<5; i++) {
			
			System.out.println("Ingresa los numeros " + (i+1));
			
			numeros[i] = entrada.nextInt();
			
			if (numeros[i]==0) {
				ceros++;
			}
			
			else if (numeros[i] > 0) {
				positivos = positivos + numeros[i];
				cantidadPositivos++;
			}
			else if (numeros[i] < 0) {
				negativos = negativos + numeros[i];
				cantidadNegativos++;
			}
			
		}
		

		for (int i=0; i<5; i++) {
			System.out.println("Cantidad de 0 " + ceros);
			System.out.println("Promedio positivos" +positivos/cantidadPositivos);
			System.out.println("Promedio negativos" +negativos/cantidadNegativos);
			
		}
		

	}

}
