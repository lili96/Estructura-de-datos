
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author LIILY´S
 */
public class Ejercicio2 {
    private static int [][] juego;
	private static int [][] juegoVacio;
	
	public static int[][]arreglo(){
		int [][] juegoVacio={{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0}};
		return juegoVacio;
	}
	
	public static int [][] arregloMinas(){
		int [][] juego={{0,0,1,0},
						{1,0,0,0},
						{0,0,0,0},
						{0,1,0,0},
						{1,0,0,1}};
		return juego;
	}
	
	public static String mostrarArreglo(int juegoVacio[][]){
		String resultado="";
		for(int fila=0; fila<5; fila ++){
			for(int col=0; col<4; col++){
				resultado=resultado + juegoVacio[fila][col]+", ";
			}
			resultado=resultado+"\n";
		}
		return resultado;
	}
	
	
	public static void main(String[] args) {
		Scanner lector= new Scanner(System.in);
		Ejercicio2 obj= new Ejercicio2();
		arreglo();
		juego=arregloMinas();
		System.out.println(mostrarArreglo(arreglo()));
		int contador=0;
		int fila;
		int col;
		for (int i = 0; i < 5; i++) {
			System.out.println("Ingrese fila: ");
			fila=lector.nextInt();
			System.out.println("Ingrese columna: ");
			col=lector.nextInt();
			
			if(juego[fila][col]==0){
				contador++;
				System.out.println("Continua Jugando");
			}else{
				System.out.println("Perdiste");
				break;
			}
			
		}
		if(contador==5){
			System.out.println("Ganaste");
		}
		
	}
	

}

