package views;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class panel_inicio extends JPanel {
	principal pantallaPrincipal;
	/**
	 * Create the panel.
	 */

	public panel_inicio(principal a) {
		setLayout(null);
		pantallaPrincipal=a;
		this.setVisible(true);
		JButton btnNewButton = new JButton("Leer datos del ambiente");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new principal(Ventanas_frame.log_datos); 
			}
		});
		btnNewButton.setBounds(22, 118, 195, 60);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Analizar datos ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.cambiaPantalla(Ventanas_frame.analizar);
			}
		});
		btnNewButton_1.setBounds(251, 118, 154, 60);
		add(btnNewButton_1);

	}
}
