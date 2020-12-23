package ec.espol.edu.workshops.second;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class StatementCoverageTest {
	int pbase;

	//test id 1
	@Test
	public void TestFirst() {
		CarInsurance primero = new CarInsurance("F",55,"Married", false);
		pbase = primero.calculo();
		assertEquals(-1, pbase, 0.0);
	}
		
	//test id 2
	@Test
	public void TestSecond() {
		CarInsurance second = new CarInsurance("M",20,"notmarried", true);
		pbase = second.calculo();
		assertEquals(2100, pbase, 0.0);	
		}
		
	//test id 3
	@Test
	public void TestThird() {
		CarInsurance tercero = new CarInsurance("F",55,"Married", true);
		pbase = tercero.calculo();
		assertEquals(300, pbase, 0.0);
		
	}
}
