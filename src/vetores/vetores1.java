package vetores;

import java.util.Scanner;

public class vetores1 {

	public static int[] main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números que digitar: ");
		int qtd = sc.nextInt();
		
		if(qtd > 10) {
			System.out.println("Quantidade inválida, por favor, escrevaum número até 10");
		}else {
			
			int[] vec = null;
			for(int i = 0; i<= qtd; ++i) {
				System.out.print("Digite um número");
				int n =  sc.nextInt();
				if(n < 0) {
					vec[i] = n;
				}			
				
			}
			
			return vec;
		}
		
	}

}
