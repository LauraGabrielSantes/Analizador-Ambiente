package views;
import javax.swing.JPanel;
import javax.swing.JButton;

public class panel_inicio extends JPanel {

	/**
	 * Create the panel.
	 */
	public panel_inicio() {
		setLayout(null);
		
		/*JButton btnNewButton = new JButton("Leer datos del ambiente");
		btnNewButton.setBounds(22, 118, 195, 60);
		add(btnNewButton);*/
		
		JButton btnNewButton_1 = new JButton("Analizar datos ");
		btnNewButton_1.setBounds(251, 118, 154, 60);
		add(btnNewButton_1);

	}
}
