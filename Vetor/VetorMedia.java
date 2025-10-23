import java.util.Scanner;

public class VetorMedia {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		final int TAM = 10;

		int a[], i;
		int soma = 0;
		double media;
		
		a = new int[TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor A");
			a[i] = ler.nextInt();
			
			soma += a[i] ;
			
		}
		
		media = soma/TAM;
		
		System.out.println("A media dos números é: "+media);

	}

}
