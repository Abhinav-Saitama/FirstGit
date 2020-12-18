package testngpract;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//import junit.framework.Assert;

public class testcase2 {
	
	@Test(groups="failed")
	public void first() {
		SoftAssert SA=new SoftAssert();
		System.out.println("launch browser");
		SA.assertFalse(3>5, "chutiye 3 nahi hota bada");
		System.out.println("after fails browser");
		SA.assertTrue(3>5, "chutiye 3 nahi hota bada");
		System.out.println("after fails trye assert");
		SA.assertAll();
		

		
	}

}
