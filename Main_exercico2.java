package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Main_exercico2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//para armazenar dados com ponto flutuante que o usurario inserir
		double base  = sc.nextDouble();
		double altura = sc.nextDouble();
		
		double area = base * altura;
		double perimetro = 2.0 * (base +  altura);
		//math.sqrt que representa raiz quadrada
		// subistituindo base*base  = Math.pow
		// altura*altura = Math.pow
		double diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));
		
		
		System.out.printf(" area = %.4f%n",area);
		System.out.printf("perimeto = %.4f%n ",perimetro);
		System.out.printf("diagonal = %.4f%n",diagonal);
		
		sc.close();
		
	}

}
