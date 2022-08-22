package Ejercicio1;
import java.util.*;
public class Grafo {
	private int A[][];
    public Grafo(){
    	this.A= new int [6][6];
    }
    public void Ingresar(){
    	Scanner valores = new Scanner(System.in);
    	int tam=0;
    	for (int i=1;i<=5;i++){
    		System.out.println("Da el numero de vertices adyacentes al vertice "+i+" :");
    		tam = valores.nextInt();
    		if(tam!=0 && tam<=5){
    			System.out.println("Da los vertices adyacentes: ");
    			for(int j=1;j<=tam;j++){
    				int dato=valores.nextInt();
    				A[i][dato]=1;
    			}
    		}
    		else{
    			if(tam>5)
    				System.out.println("No pueden ser el numero dado");
    		}
    	}
    }
    public void Mostrar(){
    	System.out.println("\nEsta es la lista de adyacencia");
    	for(int i=1;i<=5;i++){
    		System.out.print("|_"+i+"_| : ");
    		for(int j=1;j<=5;j++){
    			if(A[i][j]==1)
    				System.out.print(j+", ");
    		}
    		System.out.print("\n");
    	}
    }
}