import java.util.Scanner;

public class Lanche1038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double Total;
		
		if (codigo == 1) {
		  Total = quantidade * 4.0;
		}
		
		else if (codigo == 2) {
			Total = quantidade * 4.50;
			
		}
		
		else if (codigo == 3) {
			Total = quantidade * 5.00;
		}
		
		else if (codigo == 4) {
			Total = quantidade * 2.0;
		}
		else {
			Total = quantidade * 1.50;
		}
		
		System.out.printf("Total : R$ %.2f%n",Total);
		
		sc.close();
	}
	

}
