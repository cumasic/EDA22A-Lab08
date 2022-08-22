package Ejercicio4;
import java.util.Scanner;
public class Test {
	public static void main (String[] args){
    	Scanner scan = new Scanner(System.in);
		Grafo G=new Grafo();
	    G.Ingresar();
	    G.Mostrar();
	    System.out.println("\nIngrese un vertice para ver si esta incluido en otro");
	    System.out.println("Vertice inicial");
	    int ini=scan.nextInt();
	    System.out.println("Vertice incluido");
	    int incl=scan.nextInt();
	    System.out.println("Es "+G.incluido(ini, incl)+" que el vertice este incluido");
	}
}
