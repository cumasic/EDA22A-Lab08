package Ejercicio2;
import java.util.Scanner;
public class BFS {
	
	private int A[][];
	private int B[][];
    public BFS(){
    	this.A= new int [6][6];
    	this.B= new int [6][6];
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
    	System.out.println("\nEsta es la MATRIZ de adyacencia");
    	for(int i=1;i<=5;i++){
    		System.out.print("|_"+i+"_| : ");
    		for(int j=1;j<=5;j++){
    			if(A[i][j]==1)
    				System.out.print(j+", ");
    		}
    		System.out.print("\n");
    	}
    }
    public void Multiplica(int x){
    		int c[][]=new int[6][6];
    		int j, i, k;
    	if (x<=2){
    		for(i=1; i<=5; i++){
		          for(j=1; j<=5;j++){
		                for(k=1; k<=5; k++){
		                   B[i][j]=B[i][j]+(A[i][k]*A[k][j]);
		                }
		          }
		      }
	    }
	    else{
			for(i=1; i<=5; i++){
			    for(j=1; j<=5;j++){
			          for(k=1; k<=5; k++){
			              c[i][j]=c[i][j]+(A[i][k]*B[k][j]);
			          }
			      }
			}
			this.B=c;
	    }
    }
    public void bfs(int i, int j){
    	boolean ban=false;
    	int cont=0;
    	while(ban==false && cont<5){
    		cont=cont+1;
    		if (cont==1){
    			if(A[i][j]==1){
    				System.out.println("El camino de "+i+" a "+j+" es de longitud: "+cont);
    				ban=true;
    			}
    		}
    		else{
    			Multiplica(cont);
    			if(B[i][j]!=0){
    				System.out.println("El camino de "+i+" a "+j+" es de longitud: "+cont);
    				ban=true;
    			}
    		}
    	}
    	if (ban==false)
    		System.out.println("NO existe camino de "+i+" a "+j);
    }
}
