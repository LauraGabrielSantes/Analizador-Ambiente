package views;

import java.awt.EventQueue;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Interfaces.Lectura_datos_Sensor;

import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import controladores.*;
import javax.swing.event.MenuListener;
import javax.swing.event.MenuEvent;

public class principal {

	private JFrame frmAnalizadorDeAmbiente;
	JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal window = new principal();
					window.frmAnalizadorDeAmbiente.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public principal() {
		cambiaPantalla(Ventanas_frame.inicio);
	}

	public principal(Ventanas_frame s) {
		cambiaPantalla(s);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAnalizadorDeAmbiente = new JFrame();
		frmAnalizadorDeAmbiente.setTitle("Analizador de Ambiente");
		frmAnalizadorDeAmbiente.setBounds(100, 100, 477, 373);
		frmAnalizadorDeAmbiente.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		frmAnalizadorDeAmbiente.getContentPane().add(panel, BorderLayout.CENTER);

		JMenuBar menuBar = new JMenuBar();
		frmAnalizadorDeAmbiente.setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);

		JMenu mnNewMenu_2 = new JMenu("Inicio");
		mnNewMenu_2.addMenuListener(new MenuListener() {
			public void menuCanceled(MenuEvent e) {
			}

			public void menuDeselected(MenuEvent e) {
			}

			public void menuSelected(MenuEvent e) {
				cambiaPantalla(Ventanas_frame.inicio);
			}
		});
		mnNewMenu.add(mnNewMenu_2);

		JMenuItem mntmNewMenuItem = new JMenuItem("Seleccionar red neuronal");
		mnNewMenu.add(mntmNewMenuItem);

		JMenu mnNewMenu_1 = new JMenu("Ayuda");
		menuBar.add(mnNewMenu_1);

	}

	public void cambiaPantalla(Ventanas_frame selec) {

		switch (selec) {
		case analizar:
			panel = new panel_analizar_datos();
			System.out.println("Cambio de prueba");
			break;
		case inicio:
			panel = new panel_inicio(this);
			break;
		case log_datos:
			panel = new panel_log_datos();
			System.out.println("algo");
			break;
		default:
			panel = new panel_inicio(this);
			break;

		}
		initialize();
		frmAnalizadorDeAmbiente.setVisible(true);
		
	}
}
