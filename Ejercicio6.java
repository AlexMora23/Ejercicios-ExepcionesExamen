
public class Ejercicio6 {
	public static void main(String args[]){
	int i=0;
	try{
	int x []={9};
	
	while(i<5){
		System.out.println(x[i]);
		i++;
	}
	}
	catch(ArrayIndexOutOfBoundsException exception){
		System.out.println("Limite de arreglo superado");
		
	}
	finally{
		System.out.println("Fin");
	}
	}
	}	
