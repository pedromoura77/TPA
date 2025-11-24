package exercicios;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.println("Digite o primeiro valor");
		a = ler.nextDouble();
		
		System.out.println("Digite o segundo valor");
		b = ler.nextDouble();
		
		System.out.println("Digite o terceiro valor");
		c = ler.nextDouble();
		
		
		if(a> b+c || b > c+a || c> a +b) {
			System.out.println("Não é um triângulo");
		}
		
		else if(a == b && b==c){
			System.out.println("Triângulo Equilatero (Três lados iguais)");
		}
		
		else if(a != b && b != c && a != c) {
			System.out.println("Triângulo Escaleno (Três lados diferentes)");
		}
		
		else {
			System.out.println("Triângulo Isosceles (Dois lados iguais e um lado diferente)");
		}


	}
}