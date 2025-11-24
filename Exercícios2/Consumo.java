package exercicios;

import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double distancia, capacidade, consumo;
		
		System.out.println("Digite a distância  percorrida em Km");
		distancia = ler.nextDouble();
		
		System.out.println("Digite a capacidade do tanque em litros");
		capacidade = ler.nextDouble();
		
		consumo = distancia / capacidade;
		
		System.out.println("O consumo do seu carro é: "+consumo);
		
		if(consumo>=10) {
			System.out.println("Econômico");
		}
		
		else {
			System.out.println("Não econômico");
		}


	}
}