package exercisesPart4;

import java.util.Random;

public class Ex13Sena {

	public static void main(String[] args) {
		Random rand = new Random();
		int dezena[] = new int[6];
		int aux = 0;
		
		System.out.println("Gerando dezenas...");
		for(int i = 0; i < dezena.length; i++) {
			dezena[i] = rand.nextInt(60) + 1;	
		}
		
		/*Gerando as dezenas sem repetição
		for(int i = 0; i < dezena.length; i++) {
			boolean teste = true;
			while(teste) {
				dezena[i] = rand.nextInt(60) + 1;
				teste = false;
				for(int j = 0; j < i; j++) {
					if(dezena[i] == dezena[j] )
						teste = true;
				}
			}
		} 
		*/
		
		//ordenando as dezenas do vetor
		for(int i = 0; i < dezena.length; i++) {
			for(int j = 1; j < dezena.length; j++) {
				if(dezena[i] > dezena[j]) {
					aux = dezena[i];
					dezena[i] = dezena[j];
					dezena[j] = aux;
				}
			}
		}
		
		System.out.println("Dezenas da Mega-Sena:");
		for(int x : dezena) {
			System.out.printf("%02d ", x);
		}

	}

}
