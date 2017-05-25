//Ejercico 5 con uso de exepciones
import java.util.Arrays;
import javax.swing.JOptionPane;
public class Ejercicio5 {
	public static void main(String args[]){
		try{
		char [] letra = new char [5];
		letra[0]='k';
		letra[1]='d';
		letra[2]='f';
		letra[3]='g';
		letra[5]='i';
		
		JOptionPane.showMessageDialog(null, "Las Letras Ingrasadas Son: "+Arrays.toString(letra));
		}catch(ArrayIndexOutOfBoundsException c){
			JOptionPane.showMessageDialog(null, "Hay Un Error En Un Indice");
			
		}
	}
}
