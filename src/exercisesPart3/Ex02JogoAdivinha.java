package exercisesPart3;

import java.util.*;


public class Ex02JogoAdivinha {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Random rand = new Random();
		int numero, contador, palpite;
		
		numero = rand.nextInt(100);
		contador = 0;
		palpite = -1;
		
		while(palpite != numero) {
			System.out.print("Digite o palpite: ");
			palpite = ler.nextInt();
			contador++;
			
			if(palpite > numero) {
				System.out.println("Digite um n�mero MENOR!");
			}
			else if(palpite < numero) {
				System.out.println("Digite um n�mero MAIOR!");
			}
			else {
				System.out.println("\nPARAB�NS!!! ");
				System.out.println("Voc� acertou com " + contador + " tentativas.");
			}
		}
		
		ler.close();

	}

}
