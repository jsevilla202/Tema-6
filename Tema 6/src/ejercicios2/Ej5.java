package ejercicios2;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		String palabra;
		String trozo;
		int dividir;
		int repeticiones;
		int resto;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserta la palabra: ");
		palabra = sc.next();
		
		System.out.print("En cuanto quiere dividir la palabra: ");
		dividir = sc.nextInt();
		sc.close();
		
		if(palabra.length() >= dividir) {
			repeticiones = (int) (palabra.length()/dividir);
			resto = palabra.length()%dividir;
			for(int i = 0, j = dividir; i<repeticiones; i++, j += dividir) {
				trozo = palabra.substring(j-dividir, j);
				System.out.println(trozo);
			}
			trozo = palabra.substring(palabra.length()-resto, palabra.length());
			System.out.println(trozo);
			}
		else {
			System.out.println(palabra);
		}

	}

}
