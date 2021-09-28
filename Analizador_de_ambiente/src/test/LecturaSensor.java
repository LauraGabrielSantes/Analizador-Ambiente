package test;

import Interfaces.Lectura_datos_Sensor;
import Modelos.DatoSensor;
import Modelos.tipodesensor;

public class LecturaSensor implements Lectura_datos_Sensor {
	public LecturaSensor() {
		TodosLosDatos();
	}
	private DatoSensor[] TodosLosDatos;
	@Override
	public DatoSensor[] TodosLosDatos() {
		if(TodosLosDatos != null)
			return TodosLosDatos;
		
		TodosLosDatos = new DatoSensor[100];
		int i=0;
		for(; i<33; i++) {
			TodosLosDatos[i] =  new DatoSensor(Math.random()*10, tipodesensor.gas);
		}
		for(; i<66; i++) {
			TodosLosDatos[i] =  new DatoSensor(Math.random()*10, tipodesensor.temperatura);
		}
		for(; i<100; i++) {
			TodosLosDatos[i] =  new DatoSensor(Math.random()*10, tipodesensor.polvo);
		}
		return TodosLosDatos;
	}

	@Override
	public DatoSensor[] TodosLosDatosTemperatura() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DatoSensor[] TodosLosDatosHumedad() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DatoSensor[] TodosLosDatospolvo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DatoSensor[] TodosLosDatosGas() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String toString() {
		String Salida="";
		for(DatoSensor a: TodosLosDatos) {
			Salida +="Sensor "+ a.sensor +" Dato: "+a.Dato+"\n";
		}
		return Salida;
	}

	@Override
	public boolean LecturaDatos() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean PausaLectura() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Finalizar() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
