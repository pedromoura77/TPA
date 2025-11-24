package exercicios;

import java.util.Scanner;

public class Imposto {
	public static void main (String args[] ) {
	    Scanner ler = new Scanner(System.in);
		
		double s, ir, parc, imposto;
		
		System.out.println("digite seu salario: ");
		s = ler.nextDouble();
		
		if (s <= 1434.59) {
			ir = 0;
			parc = 0;
		} else if (s>= 1434.60 && s < 2150.00){
			ir = 7.5;
			parc = 107.59;
		} else if ( s>=2150.01 && s < 2866.70){
			ir = 15;
			parc = 268.84;
		} else if (s>=  2866.71 && s < 3582.00) {
			ir = 22.5;
			parc = 483.84;
		} else {
			ir = 27.5;
			parc = 662.91;
		}
		
	imposto = (s*ir/100)-parc;
	System.out.println("IRPF "+ imposto);
	
	ler.close();
	
	}

}