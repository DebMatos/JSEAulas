package experiencias.io.altar.exemplos;
import java.util.Scanner;



public class TryCatchExemple {
static Scanner sc= new Scanner(System.in);

	public static void main(String[] args) {
		
		getNumero();

	}

	public static void getNumero(){
	System.out.println("Numero: ");
	try{
		int value=sc.nextInt();
		System.out.println("value : "+ value);
		clearScanner();
	}catch(Exception e){
		System.out.println("Erro : "+e);
		clearScanner();
		getNumero();
	}
	
}
	
	public static void clearScanner(){
		sc.nextLine();
	}
	
	
	
}
