package exercisesPart4;

import java.util.Random;
import javax.swing.JOptionPane;

public class Ex15Intervalo {

	public static void main(String[] args) {
		final int QUANTIDADE_NUMEROS = 100;
		final int VALOR_INICIAL = 1000;
		final int VALOR_FINAL = 10000;
		
		Random r = new Random();
		int numeros[] = new int[QUANTIDADE_NUMEROS];
		int inicio, fim, frequencia;
		
		//Gerando os numeros de 1000 até 10000
		for(int i = 0; i < QUANTIDADE_NUMEROS; i++) {
			numeros[i] = r.nextInt(VALOR_FINAL - VALOR_INICIAL + 1) + VALOR_INICIAL;
		}
		
		System.out.println("Numeros gerados...");
		for(int x : numeros) {
			System.out.printf("%d", x);
		}
		
		inicio = Integer.parseInt(JOptionPane.showInputDialog("Digite o inínio do intervalo: "));
		fim = Integer.parseInt(JOptionPane.showInputDialog("Digite o fim do intervalo: "));
		
		//contando os numeros do intervalo
		frequencia = 0;
		for(int x : numeros) {
			if(x >= inicio && x <= fim) {
				frequencia++;
			}
		}
		
		//mostrando resultados
		JOptionPane.showMessageDialog(null, String.format("Frequencia de numeros no Intervalo de %d até %d: \n" + "%03d numeros", inicio, fim, frequencia ));

	}

}
