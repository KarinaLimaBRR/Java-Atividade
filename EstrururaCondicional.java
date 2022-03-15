package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class EstrururaCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//ler 2 notas que um aluno obteve.
		//mostrar a nota final com um texto justificando 
		//exibir a mensagem reprovado ou aprovado
		
		double N1, N2;
		
		System.out.printf("\nDigite a nota N1:\n");
		N1 = sc.nextDouble();
		
		System.out.printf("\nDigite a nota N2:\n");
		N2 = sc.nextDouble();
		
		double notaFinal = N1 + N2;
		System.out.printf("Nota final = %.1f%n", notaFinal);
		
		if (notaFinal <60.0) {
			System.out.println("Você foi reprovado!");
		 }
		else {
			System.out.println("Você foi aprovado!");
		}
	sc.close();	
	}

}
