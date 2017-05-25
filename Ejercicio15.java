import javax.swing.*;
public class Ejercicio15 {
public static void main(String args[]){
	double suma=0,num,multi=1;
	try{
	for(int i=1;i<=10;i++){
		num=Double.parseDouble(JOptionPane.showInputDialog(null,"Intruduzca Un Numero"));
		suma=suma+num;
		multi=multi*num;
	}
	JOptionPane.showMessageDialog(null, "La Suma De Todos Los Numeros Es= "+suma+ " y el producto= "+multi);
}catch(NumberFormatException entero){
	JOptionPane.showMessageDialog(null, "Por Favor Ingresa Solo Numeros");
}
	finally{
		JOptionPane.showMessageDialog(null, "Gracias");
	}
}
}
