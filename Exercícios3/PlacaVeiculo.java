import java.util.Scanner;

public class PlacaVeiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite o último número da placa do seu veículo");
		n = ler.nextInt();
		
		switch(n) {
			case 1:
			case 2:
				System.out.println("Não pode circular na segunda-feira");
			break;
			case 3:
			case 4:
				System.out.println("Não pode circular na terça-feira");
			break;
			case 5:
			case 6:
				System.out.println("Não pode circular na quarta-feira");
			break;
			case 7:
			case 8:
				System.out.println("Não pode circular na quinta-feira");
			break;
			case 9:
			case 0:
				System.out.println("Não pode circular na sexta-feira");
			default:
				System.out.println("Placa inválida");
			
		}
		

	}

}
