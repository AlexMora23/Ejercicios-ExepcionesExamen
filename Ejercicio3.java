//Ejercicio 3 con uso de exepciones
import javax.swing.JOptionPane;
public class Ejercicio3{ 
public static void main(String args[]){
	String numero;
	double cantidad;
	try{JOptionPane.showMessageDialog(null,"***RecargasTelcel***");
	numero = JOptionPane.showInputDialog(null,"Por Favor Digite Su Numero Telefonico");
	cantidad = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese La Cantidad A Recargar"));
	JOptionPane.showMessageDialog(null, "Se Han Abonado $"+cantidad+" Al Numero "+numero);
	}catch(NumberFormatException x){
	JOptionPane.showMessageDialog(null, "Ha ingresado una letra");
}
	finally{
		JOptionPane.showMessageDialog(null, "Operacion Finalizada");
	}
}
}
