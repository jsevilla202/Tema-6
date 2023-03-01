package ejercicios2;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		String frase;
		String esarf = "";
		String[] palabras;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserte su código en C: ");
		frase = sc.nextLine();
		sc.close();
		
		palabras = frase.split(" /*");
		palabras = frase.split(" */");
		for(int i = 0; i<palabras.length; i++) {
			if(!palabras[i].startsWith("*")) {
				esarf += palabras[i];
			}
		}
		
		System.out.println(esarf);
		
		

	}

}
