package ejecicios;

import java.util.Scanner;

public class Ej2_2 {

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
		
		for(int i = 0; i<frase1.length();i++) {
			if(frase1.charAt(i)==frase2.charAt(i)) {
				System.out.print(frase1.charAt(i));
			}
			else {
				System.out.print("*");
			}
		}
		if(frase2.equals(frase1)) {
			System.out.println("La adivinastes!!!!");
			contraseña = false;
		}
		System.out.println();
		}
		sc.close();

	}

}
