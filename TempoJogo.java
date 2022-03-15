import java.util.Scanner;

public class TempoJogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc = new Scanner (System.in);
		
		int HoraInicial = sc.nextInt();
		int HoraFinal = sc.nextInt();
		
		int duracao;
		if (HoraInicial < HoraFinal) {
			duracao = HoraFinal - HoraInicial;
		}
		else {
			duracao = 24 - HoraInicial + HoraFinal;
		}
		
		System.out.println("O Jogo Durou\n" + duracao + "\nHora(s)");
	}

}
