package exercicios;
import java.util.Scanner;

public class Celsius {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		double F, C;
		
		System.out.println("Digete os Fahrenheeit");
		F = ler.nextDouble();
		
		C = (F - 32) / 1.8 ;
		
		System.out.println("A temperatu em Celsius é: "+C);
		
		if(C<15) {
			System.out.println("Frio");
		}
		
		else if(C>=15 && C<22) {
			System.out.println("Ameno");
		}
		
		else {
			System.out.println("Calor");
		}
		
	}// main

}// class
