package exercicios;

import java.util.Scanner;

public class Media2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double nota1, nota2, media, novaMedia, exame;
		
		System.out.println("Digite a nota");
		nota1 = ler.nextDouble();
		
		System.out.println("Digite a nota");
		nota2 = ler.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		System.out.println("Media:"+media);
		
		
		if(media<3) {
			System.out.println("O aluno está Reprovado");
		}
		
		else if(media>=6) {
			System.out.println("O aluno está Aprovado");		
			}
		
		else {
			System.out.println("O aluno está em Exame");
			
			System.out.println("Digite a nota do exame");
			exame = ler.nextDouble();
			novaMedia = (media + exame) / 2;
			System.out.println("Nova media: "+novaMedia);
			
			if(novaMedia>=6){
				System.out.println("O aluno está Aprovado");
			}
			
			else{
				System.out.println("O aluno reprovado");
			}
		}
		
		
		
		
	}

}
