package Interfaces;

import Modelos.DatoSensor;

public interface Lectura_datos_Sensor {
	
	static boolean FuncionaSensorTemperaturaHumedad = true;
	static boolean FuncionaSensorPolvo = true;
	static boolean FuncionaSensorGas = true;
	
	abstract public DatoSensor[] TodosLosDatos();
	abstract public DatoSensor[] TodosLosDatosTemperatura();
	abstract public DatoSensor[] TodosLosDatosHumedad();
	abstract public DatoSensor[] TodosLosDatospolvo();
	abstract public DatoSensor[] TodosLosDatosGas();
	
}
