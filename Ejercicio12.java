import javax.swing.JOptionPane;

//import java.util.Scanner;

public class Ejercicio12 {
public static void main(String [] args){
	//Scanner d = new Scanner(System.in);
	double radio,pi=3.14,area,perimetro;
	try{
	radio=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese El Radio Del Circulo"));
	area=pi*(radio*radio);
	perimetro = (radio*2)*pi;
	JOptionPane.showMessageDialog(null, "El Ciurculo Tiene Un Area De= "+area+"cm2 Y Un Perimetro De= "+perimetro+"cm");
	}catch(NumberFormatException x){
		JOptionPane.showMessageDialog(null, "Has Ingresado Una Letra");
	}
}
}
