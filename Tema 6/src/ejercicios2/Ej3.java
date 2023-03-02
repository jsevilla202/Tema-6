package ejercicios2;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		String frase;
		String esarf = "";
		String[] palabras;
		String inicio;
		String finalString;
		String palabra = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserta la fase que quieras convertir a nomenclatura Camel: ");
		frase = sc.nextLine();
		sc.close();
		
		frase = frase.toLowerCase();
		palabras = frase.split(" ");
		esarf += palabras[0];
		for(int i = 1; i<palabras.length; i++) {
			palabra = "";
			inicio = palabras[i].substring(0, 1);
			finalString = palabras[i].substring(1);
			inicio = inicio.toUpperCase();
			palabra += inicio+finalString;
			esarf += palabra;
		}
		System.out.println(esarf);

	}

}
