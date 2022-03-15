package curso_programacao;

public class area_exercico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//boa prática é sempre indicar o tipo do número, se a expressão for de ponto flutuante (não inteiro) para double use 0. para flutuante float f//
		double b,B,h,area;
		b= 6.0;
		B= 8.0;
		h= 5.0;
		area= 0;
		
		area =(b+B) / 2.0 * h;
		
		System.out.println(area );
		
		
		// Exercico2//
		// acrescentado double para que java apresente o resultado com cada decimal, já que o exercico declara como inteiro os valores//
		int a,b1;
		double resultado; 
		
		a= 5;
		b1= 2;
		resultado = (double) a/b1;
		System.out.println(resultado);
		
		
	}

}
