import javax.swing.JOptionPane;

public class Ex3_aula1 {

	public static void main(String[] args) {
		int option = JOptionPane.showConfirmDialog(null, "Deseja terminar?", "Mensagem Final", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		System.out.println(option);

	}

}
