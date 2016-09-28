/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author LIILY´S
 */
public class TanqueOxigeno {
private static int [][] ventas;
	
	public static int [][] arreglo(){
		int [][] muestra={{25,20,20,50,50,30},{20,15,15,90,80,90},
						{15,10,10, 40, 30,40}};
		ventas=muestra;
		return muestra; 
	} 
	
	public static String mostrarArreglo(int ventas[][]){
		String resultado="";
		for(int fila=0; fila<3; fila ++){
			for(int col=0; col<6; col++){//se revisa cuanta solumnas tiene
				resultado=resultado + ventas[fila][col]+", ";
			}
			resultado=resultado+"\n";
		}
		return resultado;
	}
	
	public static void sumaFilas(int ventas[][]){
		System.out.println("Suma de filas");
		double suma =0.0;
		for(int fila=0; fila<3; fila ++){
			suma =0;
			for(int col=0; col<6; col++){
				suma=suma+ventas[fila][col];
			}
			System.out.println("suma igual a:" +suma);
		}
		
	}
	
	public static void sumaColumnas(int ventas[][]){
		System.out.println();
		System.out.println("Suma de columnas");
		double suma =0.0;
		for(int col=0; col<6; col++){
			suma =0;
			for(int fila=0; fila<3; fila ++){
				suma=suma+ventas[fila][col];
			}
			System.out.println("suma igual a:" +suma);
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(mostrarArreglo(arreglo()));
		sumaFilas(ventas);
		sumaColumnas(ventas);
	}
}    

