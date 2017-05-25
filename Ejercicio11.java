import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio11 {
public static void main(String args[]){
	@SuppressWarnings("resource")
	Scanner leer = new Scanner(System.in);
	int x;
	try{
	System.out.println("Ingresa un valor entero");
	x=leer.nextInt();
	if(x%2==0){
		System.out.println("El Numero Ingresado Es Par");
	}else{
		System.out.println("El Numero Es Impar");
	}
	}catch(InputMismatchException c){
		System.out.println("Por Favor Ingrese Solo Valores Numericos Enteros");
	}
}
}
