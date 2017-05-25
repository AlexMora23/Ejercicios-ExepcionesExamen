
import javax.swing.*;
public class Ejercicio13 {
public static void main(String [] args){
	int c;
try{
	c=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa Tu Calificacion"));
	if(c<0){
		JOptionPane.showMessageDialog(null, "Has Ingresado Un Numero Negativo");
		c=Integer.parseInt(JOptionPane.showInputDialog(null,"Por Favor Vuelve a Introducir Tu Calificacion"));
	}
	switch(c){
	case 0:
	case 1:
	case 2:
	case 3:
	case 4:
	case 5:
	case 6:
		JOptionPane.showMessageDialog(null, "Calificacion Insuficiente");
		break;
	case 7:
	case 8:
	case 9:
		JOptionPane.showMessageDialog(null, "Calificacion Buena");
		break;
	case 10:
		JOptionPane.showMessageDialog(null, "Calificacion Exelente");
		break;
	default:
	}
}catch(NumberFormatException e){
	JOptionPane.showMessageDialog(null, "Por Favor Ingrese Solo Numeros Enteros");
}
}
}
