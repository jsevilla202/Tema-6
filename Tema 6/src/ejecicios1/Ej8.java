package ejecicios1;

import java.util.Scanner;

public class Ej8 {
	static final String prefijojavaland = "Javalín, javalón";
	static final String sufijojavaland = "javalén, len, len";
	
	public static void main(String[] args) {
		String frase;
		boolean prefijo;
		boolean sufijo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserte una frase que desea traducir: ");
		frase = sc.nextLine();
		sc.close();
		
		frase = frase.replace("\t", "");
		prefijo = frase.startsWith(prefijojavaland);
		sufijo = frase.endsWith(sufijojavaland);
		
		if(prefijo == true) {
			frase = frase.replace(prefijojavaland, "");
			frase = frase.trim();
			System.out.println(frase);
		}
		else if(sufijo == true){
			frase = frase.replace(sufijojavaland, "");
			frase = frase.trim();
			System.out.println(frase);
		}
		else {
			System.out.println("ERROR: La frase no está en el idioma de Javalandia");
		}
		

		

	}

}
