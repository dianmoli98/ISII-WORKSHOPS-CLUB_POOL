package ec.espol.edu.workshops.second;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		//test 1
		CarInsurance user4 = new CarInsurance("M",45,"Married", true);

		
		System.out.println("El valor del seguro para el cliente es:"+user4.calculo());
	}
}
