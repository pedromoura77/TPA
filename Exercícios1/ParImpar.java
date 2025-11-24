package exercicios;
import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite o número inteiro");
		n = ler.nextInt();
		
		System.out.println("Número: "+n);
		
		if(n%2==0) {
			System.out.println("Par");
		}
		
		else {
			System.out.println("Impar");
		}


	}

}
