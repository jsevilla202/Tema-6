package ejecicios1;

import java.text.Normalizer;
import java.util.Arrays;
import java.util.Scanner;

public class Ej12 {
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
		String palabra1;
		String palabra2;
		char palabras1[];
		char palabras2[];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca una palabra: ");
		palabra1 = sc.next();
		System.out.print("Introduzca la palabra anagrama: ");
		palabra2 = sc.next();
		sc.close();
		
		palabra1 = palabra1.toLowerCase();
		palabra1 = quitaDiacriticos(palabra1);
		palabra2 = palabra2.toLowerCase();
		palabra2 = quitaDiacriticos(palabra2);
		
		if(palabra1.length() == palabra2.length()) {
			palabras1 = palabra1.toCharArray();
			Arrays.sort(palabras1);
			palabras2 = palabra2.toCharArray();
			Arrays.sort(palabras2);
			System.out.println(Arrays.equals(palabras1, palabras2)?"Su palabra es un anagrama":"Su palabra no es un anagrama");
		}
		else {
			System.out.println("Su palabra no es un anagrama");
		}

	}

}
