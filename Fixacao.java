package curso_programacao;

import java.util.Locale;

public class Fixacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String product1  = "computer";
		String product2 = "office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2= 650.50;
		double measure = 53.234567;
		
		
		System.out.printf("%s wich price is $%.2f%n", product1,price1);
			
		System.out.printf("%s wich price is $%.2f%n",product2,price2);
		
		System.out.printf("Record:%d years old code %d and gender: F%n", age,code,gender);
		System.out.printf("Measue with eight decimal places :%.6f%n", measure);
		System.out.printf("Rouded: %.2f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f",measure);
		
		

	}

}
