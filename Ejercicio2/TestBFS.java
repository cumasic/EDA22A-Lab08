package Ejercicio2;
import java.util.Scanner;
public class TestBFS {
	 public static void main (String[] args){
	    	Scanner scan = new Scanner(System.in);
		  	BFS G=new BFS();
	    	G.Ingresar();
	    	G.Mostrar();
	    	System.out.println("Buscando según bfs");
    		G.bfs(1,5);
	}
}