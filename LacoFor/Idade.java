import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade, anoAtual, anoNasc, i = 1;
		
		
		do {
			
			System.out.println("Digite o ano atual");
			anoAtual = ler.nextInt();
			
			System.out.println("Digite o ano de nascimento");
			anoNasc = ler.nextInt();
			
			idade = anoAtual - anoNasc;
			
			System.out.println("Idade: "+idade);
			
			
			System.out.println("Deseja continuar? 1 – continuar / 0 – sair");
			i = ler.nextInt();
			
			
		}while(i == 1);

	}

}
