package Interfaces;

import Modelos.CalidadAmbiente;

public interface Acceso_RED {
	static float NivelEntrenamientoCapas=0;
	static int numeroDeEntrenamiento=0;
	static float TiempoDeAnalisis=0;
	
	abstract public float[] frecuenciasTemperatura();
	abstract public CalidadAmbiente Calidad_Aire();
	abstract public CalidadAmbiente CapacidadBacteriana();
	abstract public CalidadAmbiente ratioRespiratorio();
}
