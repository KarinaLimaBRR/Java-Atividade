package curso_programacao;

public class area_exercico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//boa pr�tica � sempre indicar o tipo do n�mero, se a express�o for de ponto flutuante (n�o inteiro) para double use 0. para flutuante float f//
		double b,B,h,area;
		b= 6.0;
		B= 8.0;
		h= 5.0;
		area= 0;
		
		area =(b+B) / 2.0 * h;
		
		System.out.println(area );
		
		
		// Exercico2//
		// acrescentado double para que java apresente o resultado com cada decimal, j� que o exercico declara como inteiro os valores//
		int a,b1;
		double resultado; 
		
		a= 5;
		b1= 2;
		resultado = (double) a/b1;
		System.out.println(resultado);
		
		
	}

}
