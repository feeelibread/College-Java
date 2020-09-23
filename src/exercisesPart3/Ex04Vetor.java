package exercisesPart3;

import javax.swing.JOptionPane;

public class Ex04Vetor {

	public static void main(String[] args) {

		int[] tempo = new int[10];
		int max, soma;
		float media;
		StringBuffer msg = new StringBuffer();
		for (int i = 0; i < tempo.length; i++) {
			tempo[i] = Integer
					.parseInt(JOptionPane.showInputDialog("Digite o tempo de profissão do professor: ") + (i + 1));

		}
		max = 0;
		soma = 0;
		
		for(int i = 0; i < tempo.length; i++) {
			soma += tempo[i];
			if(tempo[i] > tempo[max])
				max = i;
		}
		
		media = (float) soma / 10;
		msg.append(String.format("\nMedia: %.1f\n", media));
		msg.append("Mais antigo professor: " + (max + 1) + " com " + tempo[max] + " anos.");
		JOptionPane.showMessageDialog(null, msg.toString());
		

	}

}
