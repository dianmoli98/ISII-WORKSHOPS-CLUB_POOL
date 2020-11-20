package ec.espol.edu.workshops.second;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		//test 1
		CarInsurance user1 = new CarInsurance("M",20,"Not married", true);

		
		System.out.println("El valor del seguro para el cliente es:"+user1.calculo());
		//test 2
		
		CarInsurance user2 = new CarInsurance("F",25,"married", true);

		
		System.out.println("El valor del seguro para el cliente es:"+user2.calculo());
		
		//test 3
		
		CarInsurance user3 = new CarInsurance("M",55,"Not married", true);

		
		System.out.println("El valor del seguro para el cliente es:"+user3.calculo());
		
		//test4
		CarInsurance user4 = new CarInsurance("M",64,"married", true);

		
		System.out.println("El valor del seguro para el cliente es:"+user4.calculo());
		
		//test5
//		CarInsurance user5 = new CarInsurance("F", 15.20,"Not Married", true);

		
//		System.out.println("El valor del seguro para el cliente es:"+user5.calculo());
		
		//test6
		CarInsurance user6 = new CarInsurance("H",30,"Not married", true);

		
		System.out.println("El valor del seguro para el cliente es:"+user6.calculo());
		
		//test7
		CarInsurance user7 = new CarInsurance("M",20,"marrie", true);

		
		System.out.println("El valor del seguro para el cliente es:"+user7.calculo());
		
		//test8
		CarInsurance user8 = new CarInsurance("M",20,"Not married", false);

		
		System.out.println("El valor del seguro para el cliente es:"+user8.calculo());
	}
}
