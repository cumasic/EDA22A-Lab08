package Ejercicio2;
import java.util.Scanner;
public class TestDijkstra {
	public static void main(String args[])
	{
		int nver;
    	Scanner valores = new Scanner(System.in);
		System.out.print("De el numero de vertices del Grafo: ");
		nver=valores.nextInt();
		Dijkstra grafo=new Dijkstra(nver);
		grafo.leetecl(nver);
		grafo.infinito(nver);
		grafo.dijkstra(nver);
		grafo.Imprime(nver);
	}
}
