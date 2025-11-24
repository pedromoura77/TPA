package exercicios;
import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int nasc, atual, idade;
		
		System.out.println("Digite o ano atual");
		atual = ler.nextInt();
		
		System.out.println("Digite o ano de nascimento");
		nasc = ler.nextInt();
		
		idade = atual-nasc;
		
		System.out.println("Sua idade é: "+idade);
		
		if(idade>18) {
			System.out.println("Maior de idade");
		}
		
		else {
			System.out.println("Menor de idade");
		}


	}

}
