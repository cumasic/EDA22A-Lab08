package Ejercicio2;
import java.util.Scanner;
public class TestDFS {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
          DFS G=new DFS();
        G.Ingresar();
        G.Mostrar();
        System.out.println("Para buscar según DFS en este grafo");
        System.out.println("De el vertice de partida");
        int i=scan.nextInt();
        System.out.println("De el vertice a llegar");
        int j=scan.nextInt();
        G.dfs(i,j);
    }
}
