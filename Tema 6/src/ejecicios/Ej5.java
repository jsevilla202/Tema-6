package ejecicios;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		String frase="";
		String palabra;
		boolean fin = false;
		
		Scanner sc = new Scanner(System.in);
		
		while(fin == false) {
			System.out.print("Inserta la palabra: ");
			palabra = sc.next();
			if(palabra.compareToIgnoreCase("fin") != 0) {
				frase += palabra;
				frase += " ";
			}
			else {
				fin = true;
			}
		}
		sc.close();
		
		System.out.println("Su frase es: \n" + frase);

	}

}
