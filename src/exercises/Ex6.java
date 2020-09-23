package exercises;
import java.awt.*;
import javax.swing.*;

public class Ex6 extends JFrame {

	private JLabel labelNome, labelEnd;
	private JTextField tFNome, tFEndereco;
	private JButton btOk;

	public Ex6() {
		super("Exemplo GridLayout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		labelNome = new JLabel("Nome: ");
		tFNome = new JTextField(15);
		labelEnd = new JLabel("Endereco: ");
		tFEndereco = new JTextField(20);
		btOk = new JButton("OK");

		Container janela;
		janela = getContentPane();
		janela.setLayout(new GridLayout(3, 2));

		janela.add(labelNome);
		janela.add(tFNome);
		janela.add(labelEnd);
		janela.add(tFEndereco);
		janela.add(btOk);
		pack();

	}

	public static void main(String[] args) {
		Ex6 exGridLayout = new Ex6();
		exGridLayout.setVisible(true);
	}
}