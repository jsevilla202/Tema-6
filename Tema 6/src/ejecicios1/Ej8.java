package ejecicios1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		String frase;
		String frasetraducida = "";
		String[] palabras;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserte una frase que desea traducir: ");
		frase = sc.nextLine();
		sc.close();
		palabras = frase.split(", ");
		palabras = frase.split(" ");
		
		if(palabras[0].equals("Javalín,") && palabras[1].equals("javalón")) {
			for(int i = 2; i<palabras.length; i++) {
				frasetraducida += palabras[i];
				frasetraducida += " ";
			}
			
			System.out.println("La frase traducida es: \n"+frasetraducida);
		}
		else if(palabras[palabras.length-1].equals("len") && palabras[palabras.length-2].equals("len,") && palabras[palabras.length-3].equals("javalén,")) {
			for(int i = 0; i<palabras.length-3; i++) {
				frasetraducida += palabras[i];
				frasetraducida += " ";
			}
			
			System.out.println("La frase traducida es: \n"+frasetraducida);
		}
		else {
			System.out.println("ERROR: La frase no está en el idioma de Javalandia");
		}
		

		

	}

}
