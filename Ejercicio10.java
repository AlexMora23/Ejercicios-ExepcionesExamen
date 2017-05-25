import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio10 {
public static void main(String []args){
	int n1,n2,n3;
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	try{
	System.out.println("Ingrese un valor entero>");
	n1=sc.nextInt();
	System.out.println("Ingrese un valor entero>");
	n2=sc.nextInt();
	System.out.println("Ingrese un valor entero>");
	n3=sc.nextInt();
	
	if((n1>n2)&&(n2>n3)){
		System.out.println("El mayor es= "+n1);
	}
	if((n2>n1)&&(n1>n3)){
		System.out.println("El mayor es= "+n2);
	}
	if((n3>n2)&&(n2>n1)){
		System.out.println("El mayor es= "+n3);
		}
	else{
		System.out.println("Los numeros son iguales");
	}
	}catch(InputMismatchException n){
		System.out.println("Por Favor Solo Ingresa Numeros Enteros");
	}
	finally{
		System.out.println("Fin");
	}
}
}
