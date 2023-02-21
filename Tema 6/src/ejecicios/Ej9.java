package ejecicios;

import java.util.Scanner;

public class Ej9 {
	
	char codifica(char conjunto1[],char conjunto2[], char c) {
		char codificado;
		int i = 0;
		boolean encontrado = false;
		while(encontrado == false && i<conjunto1.length) {
			if(c == conjunto1[i]) {
				encontrado = true;
			}
			i++;
		}
		if(encontrado = true) {
			codificado = conjunto2[i-1];
		}
		else {
			codificado = c;
		}
		return codificado;
	}

	public static void main(String[] args) {
		Ej9 codifica = new Ej9();
		
		char[] conjunto1 = {'e','i', 'k', 'm', 'p', 'q', 'r','s', 't', 'u', 'v'};
		char[] conjunto2 = {'p','v','i', 'u', 'm', 't', 'e','r','k','q', 's'};
		String frase;
		String[] palabras;
		String frasecodificada = "";
		String palabracodificada = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserte la frase que desea codificar: ");
		frase = sc.nextLine();
		sc.close();
		frase = frase.toLowerCase();
		
		palabras = frase.split(" ");
		
		for(int i = 0; i<palabras.length; i++) {
			for(int j = 0; j<palabras[i].length(); j++) {
				palabracodificada += codifica.codifica(conjunto1, conjunto2, palabras[i].charAt(j));
			}
			frasecodificada += palabracodificada + " ";
		}
		
		System.out.println("Su frase codificada es: " + frasecodificada);
		
		
		
		

	}

}
