package grafos;

import java.util.Random;

public class Main
{
	public static void main(String [] arg0)
	{
		//char[][] mat = new char[21000][21000];
		
		MatrizSimétrica mat = new MatrizSimétrica(5);
		
		mat.setPosicion(0, 1, true);
		mat.setPosicion(0, 2, true);
		mat.setPosicion(1, 3, true);
		mat.setPosicion(2, 3, true);
		mat.setPosicion(3, 4, true);
		
		System.out.println(mat.getPosición(0, 1));
		System.out.println(mat.getPosición(0, 3));
		System.out.println(mat.getPosición(0, 0));
		System.out.println(mat.getPosición(3, 1));
		System.out.println(mat);
		
		
		Random r = new Random();
		System.out.println(new GeneradorGrafo().obtenerGrafoProbabilidad(5, 0.9));
		
	}
}
