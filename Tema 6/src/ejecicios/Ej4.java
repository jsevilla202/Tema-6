package ejecicios;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		String frase;
		String esarf = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca una frase y el programa contara los espacios: ");
		frase = sc.nextLine();
		sc.close();
		
		for(int i = 0; i<frase.length();i++) {
			esarf += frase.charAt(frase.length()-i-1);
		}
		
		System.out.println("Su frase invertida es: " + esarf);

	}

}
