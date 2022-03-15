  package curso_programacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Olá Mundo");
		//quebra de linha//
		System.out.println("Bom Dia!");
		//sem quebra de linha//
		System.out.print("\nBom Dia!\n");
		
		//exercico//
		
		int y= 32;
		double x = 10.35784;
		System.out.println(y);
		System.out.println(x);
		//casa decimal. F representa formatado 2 especifica quantidade de casas //
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		
		//Exercicos variaveis//
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d e ganha R$ %.2f reias %n",nome,idade,renda);
	}

}
