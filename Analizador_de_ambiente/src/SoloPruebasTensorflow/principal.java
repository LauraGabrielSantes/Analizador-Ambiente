package SoloPruebasTensorflow;
import java.util.List;
import java.io.IOException;
import java.util.LinkedList;
public class principal {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("holaaaaa");
		
		List <String> comando =  new LinkedList <String>();
		//comando.add("conda activate tensorEnv");
		comando.add("python");
		comando.add("8+6");
		
		ProcessBuilder proceso = new ProcessBuilder(comando);
		Process a = proceso.start(); //corre comandos
		int resultado = a.waitFor();  //espera que termine de ejecutsr los comandos
		System.out.println(resultado);
	}

}
