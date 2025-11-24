package exercicios;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		double s;
		
		System.out.print("Digite seu salario");
		s = ler.nextDouble();
		
		System.out.println("Salário: "+s);
		
		if(s<1303.00) {
			System.out.println("Abaixo");
		}
		
		else {
			System.out.println("Acima");
		}
		

	}// main

}// class
