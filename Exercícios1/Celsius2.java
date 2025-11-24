package exercicios;
import java.util.Scanner;

public class Celsius2 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		double F, C;
		
		System.out.println("Digete os Fahrenheeit");
		F = ler.nextDouble();
		
		C = (F - 32) / 1.8 ;
		
		System.out.println("A temperatu em Celsius é: "+C);
		
		if(C<0) {
			System.out.println("Frio extremo");
		}
		
		else if(C<=10) {
			System.out.println("frio");
		}
		
		else if(C<=20) {
			System.out.println("frio moderado");
		}
		
		else if(C<=24) {
			System.out.println("clima ameno");
		}
		
		else {
			System.out.println("Calor");
		}
		
	}// main

}// class
