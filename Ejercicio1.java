//Ejercicio 1 con el uso de exepciones

import javax.swing.JOptionPane;
public class Ejercicio1 {
	public static void main(String [] args){
		int x, y;
		try{
	x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un valor entero para x"));
	y= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un valor entero para y"));
	
	int suma = x+y;
	JOptionPane.showMessageDialog(null, "El resultado de la suma es= "+ suma);
		}
		catch(NumberFormatException g){
		System.out.println("¡¡Por favor solo ingrese numeros!!");	
		}
			
		}
}
