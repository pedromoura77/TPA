package exercicios;

import java.util.Scanner;

public class Idade2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int anoAtual, dataNasc, idade;
		
		System.out.println("Digite o ano atual");
		anoAtual = ler.nextInt();
		
		System.out.println("Digite o ano de nascimento");
		dataNasc = ler.nextInt();
		
		idade = anoAtual-dataNasc;
		
		System.out.println("Sua idade é: "+idade);
		
		if(idade<10) {
			System.out.println("Criaça");
		}
		
		else if(idade<18) {
			System.out.println("Adolescente");
		}
		
		else if(idade<60) {
			System.out.println("Adulto");
		}
		
		else {
			System.out.println("Idoso");
		}


	}
}