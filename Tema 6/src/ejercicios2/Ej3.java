package ejercicios2;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		String frase;
		String esarf = "";
		char c;
		char uppercase;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserta la fase que quieras convertir a nomenclatura Camel: ");
		frase = sc.nextLine();
		sc.close();
		
		frase = frase.toLowerCase();
		for(int i = 1; i<frase.length(); i++) {
			c = frase.charAt(i);
			if(frase.charAt(i-1) == ' ') {
			}
		}
		System.out.println(frase);

	}

}
