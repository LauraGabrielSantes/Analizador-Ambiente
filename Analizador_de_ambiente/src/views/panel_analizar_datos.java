package views;

import javax.swing.JPanel;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Interfaces.Lectura_datos_Sensor;
import test.LecturaSensor;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class panel_analizar_datos extends JPanel {
	/**
	 * Create the panel.
	 */
	JTextArea textArea = new JTextArea();
	public panel_analizar_datos() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Slecciona el archivo de datos");
		JFileChooser j = new JFileChooser();
		
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(23, 24, 188, 48);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Seleccionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				j.showSaveDialog(null);
			}
		});
		btnNewButton.setBounds(311, 32, 129, 33);
		add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("File:");
		lblNewLabel_1.setBounds(33, 76, 83, 20);
		add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Analizar");
		btnNewButton_1.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
			
				}
		});
		btnNewButton_1.setBounds(33, 154, 89, 23);
		add(btnNewButton_1);
		

		textArea.setBounds(201, 80, 239, 209);
		add(textArea);
		
		JButton btnNewButton_2 = new JButton("Graficas");
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.setBounds(33, 211, 89, 23);
		add(btnNewButton_2);

	}

}
