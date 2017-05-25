//import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio7 {
public static void main(String args[]){
	@SuppressWarnings("resource")
	Scanner leer = new Scanner(System.in);
	try{
	int [] x= new int[3];
	for(int i=0;/*i<3*/i<4;i++){
		System.out.println("Ingrese Un Numero");
		x[i]=leer.nextInt();
	}
	System.out.println(Arrays.toString(x));
}
	catch(ArrayIndexOutOfBoundsException v){
	System.out.println("Limite Superado");	
	}
	catch(InputMismatchException n){
		System.out.println("Ha Ingresado una letra");
	}
}
}
