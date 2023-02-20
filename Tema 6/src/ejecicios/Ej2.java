package ejecicios;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		String frase1;
		String frase2;
		boolean contraseña = true;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca la contraseña: ");
		frase1 = sc.next();
		
		while(contraseña == true){
		System.out.print("Adivina a contraseña: ");
		frase2 = sc.next();
		
		if(frase1.compareTo(frase2)> 0) {
			System.out.println("La contraseña es más larga");
		}
		else if(frase1.compareTo(frase2)< 0) {
			System.out.println("La contraseña es más corta");
		}
		else {
			System.out.println("ACERTASTES!!");
			contraseña = false;
		}
		}
		sc.close();

	}

}
