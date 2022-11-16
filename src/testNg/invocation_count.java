package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocation_count {

	@Test()
	
	public void TC1() {
		Reporter.log("running Tc1",true);
	}
	
   @Test
	
	public void TC2() {
		Reporter.log("running Tc1",true);
   }
}
