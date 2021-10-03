package Interfaces;

import javax.swing.JTextArea;

import Exceptions.ExcepcionLectura;
import Modelos.DatoSensor;

public interface Lectura_datos_Sensor {
	
	static boolean FuncionaSensorTemperaturaHumedad = true;
	static boolean FuncionaSensorPolvo = true;
	static boolean FuncionaSensorGas = true;
	abstract public boolean LecturaDatos() throws ExcepcionLectura;
	abstract public boolean PausaLectura()throws ExcepcionLectura;
	abstract public boolean Finalizar();
	abstract public String ImprimeDatos();
	abstract public void ControladorDatos(JTextArea a) throws InterruptedException;
	abstract public DatoSensor[] TodosLosDatos();
	abstract public DatoSensor[] TodosLosDatosTemperatura();
	abstract public DatoSensor[] TodosLosDatosHumedad();
	abstract public DatoSensor[] TodosLosDatospolvo();
	abstract public DatoSensor[] TodosLosDatosGas();
	
}
