package grafos;

import java.util.Arrays;

public class MatrizSimétrica 
{
	private boolean[] contenedor;
	
	public MatrizSimétrica (int tam)
	{
		contenedor = new boolean[(tam * (tam - 1)) / 2];
	}
	
	public void setPosicion (int fila, int columna, boolean val)
	{
		if (columna == fila)
			throw new ArithmeticException("No se admiten bucles");
		
		if (fila > columna)
		{
			int aux = columna;
			columna = fila;
			fila = aux;
		}
			
		contenedor[fila * getOrden() + columna - ((int) Math.pow(fila, 2) + 3 * fila + 2) / 2] = val;
	}

	private int getOrden() {
		return (int) (1 + Math.sqrt(1 + 8 * contenedor.length)) / 2;
	}
	
	public boolean getPosición (int fila, int columna)
	{
		if (columna == fila)
			return false;
		if (fila > columna)
		{
			int aux = columna;
			columna = fila;
			fila = aux;
		}
		return contenedor[fila * getOrden() + columna - ((int) Math.pow(fila, 2) + 3 * fila + 2) / 2];
	}

	@Override
	public String toString() {
		return "MatrizSimétrica [vec=" + Arrays.toString(contenedor) + "]";
	}
}