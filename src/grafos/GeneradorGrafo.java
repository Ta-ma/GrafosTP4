package grafos;

import java.util.Random;

public class GeneradorGrafo
{
	Random random;
	double adyacencia;
	int tam;
	
	public GeneradorGrafo ()
	{
		random = new Random();
	}
	
	public MatrizSimétrica obtenerGrafoProbabilidad (int tam, double prob)
	{
		MatrizSimétrica mat = new MatrizSimétrica(tam);
		
		for (int i = 0; i < tam - 1; i++)
			for (int j = i + 1; j < tam; j++)
				mat.setPosicion(i, j, random.nextDouble() < prob);
		
		return mat;
	}
	public MatrizSimétrica obtenerGrafoAdyacencia (int tam, double adyacencia)
	{
		MatrizSimétrica mat = new MatrizSimétrica(tam);
		
		int aristasPosibles = (tam * (tam - 1)) / 2;
		int aristasPosta = (int) (aristasPosibles * adyacencia);
		
		for (int i = 0; i < aristasPosibles; i++)
		{
			// faltó implementar esto
			//mat.setPosicion(fila, columna, val);
		}
		
		return mat;
	}
	
	
}
