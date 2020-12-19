package testngpract;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import listpractice.BaseCLass;

//import listpractice.BaseCLass;


public class testcase1 extends BaseCLass{

	@Test(priority=0)
	public void login() throws InterruptedException {
		System.out.println("inside test case1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h3/span[text()='Way2Automation']")).click();
		System.out.println("inside test case1 second");
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div[2]/div/div[2]/div/a[1]")).click();
	}
	
	@Test(priority=1)
	public void failure() throws InterruptedException {
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("Abhinav");
		System.out.println("download in change starts");
	}
}
