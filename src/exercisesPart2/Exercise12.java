package exercisesPart2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Exercise12 extends JFrame implements ActionListener {
	private JButton botao1, botao2;
	private JPanel panel;

	public Exercise12() {
		super("Ação do Mouse");
		
		botao1 = new JButton("PLAY");
		botao2 = new JButton("LIMPAR");
		panel = new JPanel();

		panel.add(botao1);
		botao1.addActionListener(this);
		botao2.addActionListener(this);

		getContentPane().add(panel);
		setSize(200, 100);
		setVisible(true);

	}

	public static void main(String[] args) {
		Exercise12 ex = new Exercise12();
		ex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botao1)
			panel.add(botao2);

		else
			panel.remove(botao2);
			this.repaint();
			setVisible(true);

	}

}
