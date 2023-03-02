package ejecicios1;

import java.util.Scanner;

public class Ej9 {
	
	static char codifica(char conjunto1[],char conjunto2[], char c) {
		int encontrado = -1;
		char devolver;
		
		for(int i = 0; i<conjunto1.length && encontrado == -1; i++) {
			if(c == conjunto1[i]){
				encontrado = i;
			}
		}
		if(encontrado != -1) {
			devolver = conjunto2[encontrado];
		}
		else {
			devolver = c;
		}
		return devolver;
	}

	public static void main(String[] args) {
		
		char[] conjunto1 = {'e','i', 'k', 'm', 'p', 'q', 'r','s', 't', 'u', 'v'};
		char[] conjunto2 = {'p','v','i', 'u', 'm', 't', 'e','r','k','q', 's'};
		String frase;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserte la frase que desea codificar: ");
		frase = sc.nextLine();
		sc.close();
		frase = frase.toLowerCase();
		
		for(int i = 0; i<frase.length(); i++) {
			frase = frase.substring(0, i) + codifica(conjunto1, conjunto2, frase.charAt(i)) + frase.substring(i+1);
		}
		
		System.out.println("Su frase codificada es: " + frase);
		
		
		
		

	}

}
