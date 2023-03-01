package ejercicios2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		String titulo;
		String parrafo;
		String[] parrafos;
		String esarf = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserte el titulo del HTML: ");
		titulo = sc.nextLine();
		
		System.out.print("Inserte el parrafo del HTML: ");
		parrafo = sc.nextLine();
		
		sc.close();
		parrafos = parrafo.split(" ");
		
		for(int i = 0; i<parrafos.length; i++) {
			esarf += parrafos[i] + " ";
			if(i%10 == 0 && i != 0) {
				esarf += "\n";
			}
		}
		
		System.out.println("<html>\n"+"<body>\n"+"<h1>"+titulo+"</h1>\n"+"<p>"+esarf+"</p>\n"+"</body>\n"+"</html>");

	}

}
