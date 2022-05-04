package ejer2;
import java.util.Scanner;
import java.util.Random;

public class Programa {
	
	void iniciar(){
		
		int valor=generarAleatorio();
		int num;
		int resul;
		
		do{
			num=pedirNumero();
			resul=compararNumeros(num, valor);
			System.out.println(resul);
			
		}while(resul!=0);
		System.out.println("Felicitaciones acertaste!!");
	}
	
	int generarAleatorio(){
	Random azar= new Random();	
		int valor= azar.nextInt(100);
		System.out.println("Adivine el número aleatorio, el número ganador sera tus dias de vida");
		return valor;
	}
	
	 int pedirNumero(){
		 Scanner entrada=new Scanner(System.in);
		 int num;
		 System.out.println("Ingrese un número");
		 num=entrada.nextInt();
		 return num;
	 }
	
	 /*compara dos enteros a y b. Devuelve un entero(int) indicando si es menor, mayor o igual de la siguiente manera -1 si a es menor que b
	  * 1 si a es mayor que b y 0 si son iguales
	  */
	 
	 int compararNumeros(int a, int b){
		 int resul;
		 if (a>b){
			 resul=1;
		 }else if (a<b){
			 resul=-1;
		 }else
			 resul=0;
		 return resul;
	 	 }
	 }
	

