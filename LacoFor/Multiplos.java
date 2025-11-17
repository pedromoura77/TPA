
public class Multiplos {

	public static void main(String[] args) {
		
		int soma = 0;
		
		for(int i = 1; i <= 400; i++) {
			
			if(i %5 == 0) {
				soma+= i;
			}
					
		}
		
		System.out.println("A soma dos numeros multiplos de 5 de 1 a 400 é: "+soma);


	}

}
