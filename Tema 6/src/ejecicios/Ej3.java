package ejecicios;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		String frase;
		int espacios = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca una frase y el programa contara los espacios: ");
		frase = sc.nextLine();
		
		for(int i = 0; i<frase.length();i++) {
			if(frase.charAt(i) == ' ') {
				espacios++;;
			}
		}
		
		System.out.println("Su frase tiene un total de "+espacios+" espacios");

	}

}
