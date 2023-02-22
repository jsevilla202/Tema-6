package ejecicios;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		String frase;
		String buscar;
		String[] palabras;
		int contador = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserte una frase en la que buscar: ");
		frase = sc.nextLine();
		System.out.print("Inserte una palabra para buscar: ");
		buscar = sc.next();
		sc.close();
		
		palabras = frase.split(" ");
		
		for(int i = 0; i<palabras.length; i++) {
			if(palabras[i].equals(buscar)) {
				contador++;
			}
		}
		
		System.out.println("La palabra aparece un total de: " + contador + " veces");

	}

}
