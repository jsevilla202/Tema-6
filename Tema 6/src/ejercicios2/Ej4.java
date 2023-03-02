package ejercicios2;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		String frase;
		String esarf = "";
		String[] palabras;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserta la fase: ");
		frase = sc.nextLine();
		sc.close();
		
		frase = frase.toLowerCase();
		palabras = frase.split(" ");
		Arrays.sort(palabras);
		
		for(int i = 0; i<palabras.length; i++) {
			esarf += palabras[i] + " ";
		}
		
		System.out.println(esarf);
	}

}
