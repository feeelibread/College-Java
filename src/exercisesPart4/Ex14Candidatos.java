package exercisesPart4;

import java.util.*;

public class Ex14Candidatos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] candidatos = new String[5];
		int[] contador = new int[5];
		int voto;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Candidato " + (i + 1) + ":");
			candidatos[i] = sc.nextLine();
			contador[i] = 0;
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite o numero do voto: ");
			voto = sc.nextInt();
			if (voto >= 1 && voto <= 5) {
				contador[voto - 1]++;
			}
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Candidato: " + candidatos[i] + " obteve " + contador[i] + " votos.");
		}
		
		sc.close();

	}

}
