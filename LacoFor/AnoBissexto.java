import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int anoInicial, qtdAnos=0, anoFinal,bissexto = 0;
		
		System.out.println("Digite o ano inicial");
		anoInicial = ler.nextInt();
		
		System.out.println("Digite o ano final");
		anoFinal = ler.nextInt();
		
		int i = anoInicial;
		
		while(i<=anoFinal) {
			
			
			if(i%4==0) {
				bissexto = i;
				System.out.println(bissexto);
				qtdAnos++;
			}	
		
			i++;
			
		}
		
		System.out.println("Quantidade de anos bissextos: "+qtdAnos);
		
	}

}
