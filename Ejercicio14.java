import javax.swing.*;
public class Ejercico14 {
	public static void main(String [] args){
int fac=1,num;
try{
num= Integer.parseInt(JOptionPane.showInputDialog("Introduce Un Numero"));
for(int i=num;i>0;i--){
	fac=fac*i;
}
JOptionPane.showMessageDialog(null, "El Factorial de "+num+" es "+fac);
}catch(NumberFormatException v){
	JOptionPane.showMessageDialog(null, "Has Ingresado Un Caracter O Un Valor No Entero");
}
finally{
	JOptionPane.showMessageDialog(null, "Fin");
}
}
	}
