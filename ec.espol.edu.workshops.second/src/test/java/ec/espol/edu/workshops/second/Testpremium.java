package ec.espol.edu.workshops.second;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Testpremium {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(BranchCoverageTest.class);
		Result result2 = JUnitCore.runClasses(PathCoverageTest.class);
		Result result3 = JUnitCore.runClasses(StatementCoverageTest.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
		for (Failure failure : result2.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result2.wasSuccessful());
		for (Failure failure : result3.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result3.wasSuccessful());
	}
}
