//Ejercico 4 con uso de exepciones
import java.util.Arrays;
import javax.swing.JOptionPane;
public class Ejercicio4 {
	public static void main(String args[]){
		try{
		String [] nombres = new String [4];
		nombres[0]="Mario";
		nombres[1]="Pablo";
		nombres[2]="Marco";
		nombres[3]="Jesus";
		nombres[4]="Manuel";
		
		JOptionPane.showMessageDialog(null, "Los Nombres Ingrasado Son: "+Arrays.toString(nombres));
		}catch(ArrayIndexOutOfBoundsException c){
			JOptionPane.showMessageDialog(null, "Se Sobrepasa el limite del arreglo");
			
		}
	}

}
