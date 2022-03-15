package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Excercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 double L,C,V,area,preco;
		 

		 L = 10.0;
		 C = 30.0;
		 V = 200.00;
		 
		 area = L * C;
		 preco = area * V;
		 
		 System.out.println(area);
		 System.out.println(preco);
		
		 
		 //Segundo formato
		 
		  Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		
		 double largura = sc.nextDouble();
		 double comprimento = sc.nextDouble();
		 double metroQuadrado = sc.nextDouble();
		 
		 double area1= largura * comprimento;
		 double preco1= area1 * metroQuadrado;
		 
		 System.out.printf(" AREA = %.2f%n",  area);
		 System.out.printf(" PRECO = %.2f%n", preco1);
		 
		 sc.close();
		 
		 
		 
		 
		 
		 
		
		 
		 
		 
		 
		 
	}

}
