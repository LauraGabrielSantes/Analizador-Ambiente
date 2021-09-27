package Interfaces;

import Modelos.CalidadAmbiente;

public interface Acceso_RED {
	abstract public float[] frecuenciasTemperatura();
	abstract public CalidadAmbiente Calidad_Aire();
	abstract public CalidadAmbiente CapacidadBacteriana();
	abstract public CalidadAmbiente ratioRespiratorio();
}
