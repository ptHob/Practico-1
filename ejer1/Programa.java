package ejer1;
import java.util.Scanner;
public class Programa {

	Scanner entrada=new Scanner(System.in);
	
		String apellido;
		int cedula, edad;
		double altura;
	
	public void iniciar() {
			cargar();
			imprimir();
		}//fin iniciar

	private void imprimir() {
		System.out.println("apellido: "+apellido);
		System.out.println("edad: "+edad);
		System.out.println("cedula "+cedula);
		System.out.println("altura "+altura);
		
	}

	private void cargar() {
		System.out.println("Ingrese apellido");
		apellido=entrada.nextLine();
		
		System.out.println("Ingrese cedula");
		cedula=entrada.nextInt();
		
		System.out.println("Ingrese edad");
		edad=entrada.nextInt();
		
		System.out.println("Ingrese altura");
		altura=entrada.nextDouble();
	}
	
}