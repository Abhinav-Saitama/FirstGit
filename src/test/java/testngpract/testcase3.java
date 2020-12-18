package testngpract;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testcase3 {
	
	@DataProvider(parallel=true)
	public void launch() {
		System.out.println("launch browser on third test case");
	}
	
	@Test(groups="failed")
	public void second() {
		System.out.println("launch second method on third test case");
	}

}
