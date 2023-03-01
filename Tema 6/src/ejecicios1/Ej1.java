package ejecicios1;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		String frase1;
		String frase2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca la primera frase: ");
		frase1 = sc.next();
		System.out.print("Introduzca la segunda frase: ");
		frase2 = sc.next();
		sc.close();
		
		if(frase1.compareTo(frase2)> 0) {
			System.out.println("La primera fase es mayor que la segunda");
		}
		else if(frase1.compareTo(frase2)< 0) {
			System.out.println("La segunda fase es mayor que la primera");
		}
		else {
			System.out.println("Las frases son iguales");
		}

	}

}
