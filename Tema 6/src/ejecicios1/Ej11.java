package ejecicios1;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		String frase;
		String[] palabras;
		int palabra = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserte una frase: ");
		frase = sc.nextLine();
		sc.close();
		
		palabras = frase.split(" ");
		
		for(int i = 1; i<palabras.length; i++) {
			if(palabras[i].length()>palabras[palabra].length()) {
				palabra = i;
			}
		}
		
		System.out.println("La palabra más larga es: " + palabras[palabra] + " con un tamaño de " + palabras[palabra].length());
			

	}

}
