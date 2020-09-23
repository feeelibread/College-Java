package exercisesPart2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise11 extends JFrame implements ActionListener {

	private JPanel painel;
	private JButton botaoOK;
	private JButton botaoCancel;

	public Exercise11() {

		super("Ação do mouse");
		botaoOK = new JButton("OK");
		botaoOK.setToolTipText("Botão OK");

		botaoCancel = new JButton("CANCELAR");
		botaoCancel.setToolTipText("Botão CANCELAR");

		botaoOK.addActionListener(this);
		botaoCancel.addActionListener(this);

		painel = new JPanel(new GridLayout(2, 1, 30, 10));
		painel.add(botaoOK);
		painel.add(botaoCancel);

		add(painel);

	}

	public static void main(String[] args) {
		Exercise11 ex = new Exercise11();
		ex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ex.setLocation(400, 200);
		ex.setSize(200, 150);
		ex.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botaoOK)
			JOptionPane.showMessageDialog(painel, "PRESSIONOU OK");
		else
			JOptionPane.showMessageDialog(null, "PRESSIONOU CANCELAR");

	}

}
