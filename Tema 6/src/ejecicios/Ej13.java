package ejecicios;

import java.text.Normalizer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Ej13 {
	/*
	 * Este código no es mío, se encarga de eliminar las tildes
	 * https://es.stackoverflow.com/questions/31178/c%C3%B3mo-limpiar-string-de-tildes-en-java
	 */
	public static String quitaDiacriticos(String s) {
	    s = Normalizer.normalize(s, Normalizer.Form.NFD);
	    s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
	    return s;
	}

	public static void main(String[] args) {
		String frase;
		char palabras[];
		int contador = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca una frase: ");
		frase = sc.nextLine();
		sc.close();
		
		frase = frase.toLowerCase();
		frase = quitaDiacriticos(frase);
		frase = frase.replace(" ", "");
		
		palabras = frase.toCharArray();
		Arrays.sort(palabras);
		
		for(int i = 0, j = 0; i<palabras.length; i++) {
			contador = 0;
			while(palabras[i] == palabras[j]) {
				contador++;
				j++;
			}
			System.out.println("Hay un total de " + contador + " de la letra " + palabras[i]);
			i = j-1;
		}
		
		
	}

}
