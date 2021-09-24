package Interfaces;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class panel_log_datos extends JPanel {

	/**
	 * Create the panel.
	 */
	public panel_log_datos() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("Pausar");
		btnNewButton.setBounds(10, 126, 115, 40);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Iniciar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(10, 31, 115, 40);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Finalizar");
		btnNewButton_2.setBounds(10, 223, 115, 40);
		add(btnNewButton_2);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(174, 61, 266, 228);
		add(textPane);
		
		JLabel lblNewLabel = new JLabel("Lecura de datos");
		lblNewLabel.setFont(new Font("Lucida Sans", Font.PLAIN, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(184, 11, 231, 39);
		add(lblNewLabel);

	}
}
