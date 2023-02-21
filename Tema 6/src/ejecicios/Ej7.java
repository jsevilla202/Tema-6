package ejecicios;

import java.text.Normalizer;
import java.util.Scanner;

public class Ej7 {
	
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
		String esarf = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca una frase y el programa le dirá si es palíndroma: ");
		frase = sc.nextLine();
		sc.close();
		
		frase = frase.replace(" ", "");
		frase = frase.toLowerCase();
		frase = quitaDiacriticos(frase);
		
		
		for(int i = 0; i<frase.length();i++) {
			esarf += frase.charAt(frase.length()-i-1);
		}
		
		if(frase.equals(esarf)) {
			System.out.println("Su frase es palindroma");
		}
		else {
			System.out.println("Su frase no es palindroma");
		}

	}

}
