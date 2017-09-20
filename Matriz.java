package app;

import java.util.Scanner;

public class Matriz {
	
Scanner lector = new Scanner(System.in);
	
	int aux, dim, numerosx;
	int Matriz[][]= new int [20][20];
	int Matriz2[][]= new int [20][20];
	int vector[]= new int [20];

	
	public Matriz() {
		// TODO Auto-generated constructor stub
		System.out.println("Ingresar la dimension de la matriz");
		dim= lector.nextInt();// En dim guardamos el rango que le daremos a nuestra matriz
		for (int i = 0; i < dim; i++) {
			for (int j = 0; j < dim; j++) {
				Matriz[i][j] = numerosx= (int) Math.floor(Math.random() * (20 - 1 + 1) + 1);// dentro de la matriz guardamos 
				//una serie de numeros aleatorios del 1 al 20 
				Matriz2[i][j]= Matriz[i][j]; //guardamos en matriz2 la primer matriz para luego trabajar con ella 
				
			}
		}
		System.out.println("--------------------------------------------");
		System.out.println("Diagonal Principal");
		for (int i = 0; i < dim; i++) {
			
			for (int j = 0; j < dim; j++) {
				
				if(i==j){
				//aqui le decimos que si la posicion i es igual a la posicion j me cambie el valor que tenemos por 1
					Matriz[i][j]=1;
				
				}else
				// si no coincide con esta instruccion entonces cambiamos el valor por 0
					Matriz[i][j]=0;
				
				System.out.print("[" + Matriz[i][j] + "]");	// mostramos la diagonal principal con 1 y 0 al resto
			}
			
			System.out.println();
		}	
	}
	public void Diagonalsec (){
		
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println("Diagonal Secundaria");
		for (int i = 0; i < dim; i++) {
			
			for (int j = 0; j < dim; j++) {
				
				if(i+j==dim-1){
				//si i+j es igual al rango de la matriz menos 1 entonces el valor de el numero en esa posicion sera 0
					
					Matriz[i][j]=0;
					
				}else
					// Si no cumple con la instruccion entonces el valor sera 1
					Matriz[i][j]=1;
				
				System.out.print("[" + Matriz[i][j] + "]");	//mostramos la diagonal secundaria con 0 y el resto con 1
			}
			System.out.println();
		}	
		System.out.println();
	}
	 
	public void MatrizNormal(){
		System.out.println("--------------------------------------------");
		System.out.println("Matriz Normal");
		for (int i = 0; i < dim; i++) {
			
			for (int j = 0; j < dim; j++) {
			
				System.out.print("[" + Matriz2[i][j] + "]");// mostramos la matriz que generamos al inicio para visualizar
				//los valores que tenemos dentro de ella para poder realizar las otras actividades
			}
			System.out.println();
		}	
	System.out.println();	
	}
	
	public void SumaNumPar(){
		System.out.println("--------------------------------------------");

		System.out.println();
		
		
		System.out.println("Los numeros pares son:");
		
		for (int i = 0; i < dim; i++) {
			
			for (int j = 0; j < dim; j++) {
				
			if(Matriz2[i][j]%2==0){
				// si el numero en la posicion [i][j]%2 es igual a 0 quiere decir que el numero es par
				System.out.print(Matriz2[i][j]+" ");
				
			vector[i]+=Matriz2[i][j];// guardaremos cada numero par y luego pasaremos a realizar la suma de todos los numeros
			}
			}
			System.out.println();
			}
		System.out.println("Suma de numeros pares por fila:");
		System.out.println();
		for (int i = 0; i < dim; i++) {
			
			
			
			System.out.println("La suma de los numeros pares es: "+vector[i]);// mostramos la suma de los numeros de las filas
		}	
			System.out.println();
		}	
	
	public void MayorMenor(){
		System.out.println("--------------------------------------------");
		System.out.println("Posicion de numero mayor y numero menor");
		System.out.println();
		int menor,mayor, auxiliar=0;
		menor=mayor=Matriz2[0][0];
		while(auxiliar<=1)
		{
			for (int i = 0; i < dim; i++) {
				
				for (int j = 0; j < dim; j++) {		
					
					if(Matriz2[i][j]>mayor && auxiliar==0){
						
						mayor=Matriz2[i][j];//recorremos el arreglo en busca de el numero mayor y lo guardamos 
					}
					if(auxiliar==1 &&mayor==Matriz2[i][j])
					{
						System.out.println("Numero Mayor :" +mayor+" en la posicion ["+(i+1)+"]"+"["+(j+1)+"]");
					
					}
					if(Matriz2[i][j]<menor && auxiliar==0){
						
						menor=Matriz2[i][j];//recorremos el arreglo en busca de el numero menor y lo guardamos 
					}
					if(auxiliar==1 &&menor==Matriz2[i][j])
					{
						System.out.println("Numero Menor :" +menor+"  en la posicion ["+(i+1)+"]"+"["+(j+1)+"]");
						
					}
				}
			}
			auxiliar++;
		}
	}
}









