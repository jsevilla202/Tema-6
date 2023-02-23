package ejecicios;

import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {
		String frase;
		String adivina;
		String esarf = "";
		char[] letras;
		char[] letrasrandom;
		boolean rinde = false;
		int eleccion;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca una frase y el programa creara un anagrama: ");
		frase = sc.nextLine();
		
		if(frase.equals(" ")) {
			System.out.println("ERROR: No puede introducir una cadena vacia");
		}
		else {
			letras = frase.toCharArray();
			letrasrandom = new char [letras.length];
			for(int i = 0; i<letras.length; i++) {
				int azar = (int) (Math.random()*letras.length);
				if(letrasrandom[azar] == 0) {
					letrasrandom[azar] = letras[i];
				}
				else {
					i--;
				}
			}
			
			for(int i = 0; i<letrasrandom.length; i++) {
				esarf += letrasrandom[i];
			}
			
			System.out.println(esarf);
			System.out.println();
			
			while(rinde == false){
				System.out.println();
				System.out.print("Elija:\n 1. Jugar\n 2. Rendirse\n¿Que desea hacer? ");
				eleccion = sc.nextInt();
				sc.nextLine();
				if(eleccion == 1) {
					System.out.print("Intenta adivinar que pone: ");
					adivina = sc.nextLine();
					if(adivina.equals(frase)) {
						System.out.print("LO HAS ADIVINADO!!!!!");
						rinde = true;
					}
					else {
						System.out.print("Sigue intentandolo");
					}
				}
				else if(eleccion == 2) {
					rinde = true;
					System.out.println("La frase era: " + frase);
					break;
				}
				else {
					System.out.println("ERROR: Eleccion no valida");
				}
			}
			sc.close();
			
		}

	}

}
