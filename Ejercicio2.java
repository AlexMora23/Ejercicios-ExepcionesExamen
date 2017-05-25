//Ejercico 2 con uso de exepciones

import java.util.Arrays;

import javax.swing.JOptionPane;
public class Ejercicio2 {
public static void main(String [] args){
	double i;
	double [] prom = new double [7];
	try{
	for(i=0;i<7;i++){
		prom[(int) i]= Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese sus calificaciones"));
	}
	JOptionPane.showMessageDialog(null, "Sus calificacones son: "+ Arrays.toString(prom));
	}catch(NumberFormatException a){
		JOptionPane.showMessageDialog(null,"Has Ingresado una letra!! "
				+"Por favor ingresa solo valores numericos");
		
	}
	finally{
		JOptionPane.showMessageDialog(null,"Gracias!, Hasta Luego :)");
	}
}
}
