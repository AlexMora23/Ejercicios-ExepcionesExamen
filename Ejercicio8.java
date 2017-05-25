
import javax.swing.JOptionPane;
public class Ejercicio8 {
public static void main(String args[]){
	int dato=0;
	boolean isInt = false;
	while (!isInt) {
	try {
	dato=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un valor entero"));
	isInt = true;
	} catch (NumberFormatException n) {
	JOptionPane.showMessageDialog(null,"Error en la lectura del dato");
	}
	}
	JOptionPane.showMessageDialog(null,"Correcto, dato leido: " + dato);
	}

}
