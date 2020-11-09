package ec.espol.edu.workshops.second;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {

	public static void main(String[] args) {
		
		
		CarInsurance user4 = new CarInsurance("M",45,"married", true);

		
		System.out.println("El valor del seguro para el cliente es:"+user4.calculo());
	}
		


}
