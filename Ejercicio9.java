
import java.util.*;
public class Ejercicio9 {
@SuppressWarnings("resource")
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
	int num;
	String car;
	try{
	System.out.println("Ingrese un valor entero >");
	num = sc.nextInt();
	System.out.println("Ingrese un caracter >");
	car = sc.next();
	
	for (int i=0;i<num;i++){
    System.out.println(car);
	}

}catch(InputMismatchException Uno){
	System.out.println("Ha Ingresado Una Letra");
}
	finally{
		System.out.println("Fin");
	}
}
}
