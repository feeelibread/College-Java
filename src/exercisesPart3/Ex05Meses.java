package exercisesPart3;

import java.util.Scanner;

public class Ex05Meses {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String mes[] = {"Janeiro", "Fevereiro", "Mar�o", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		
		int x;
		do {
			System.out.print("Numero do m�s: ");
			x = ler.nextInt();
			if(x >= 1 && x <= 12)
				System.out.println("M�s: " + mes[x - 1]);
			else if (x != 0)
				System.out.println("N�mero inv�lido!");
		} while(x != 0);
		
		System.out.println("Fim do Programa");
		
		ler.close();
			
		
	}

}
