package screenprint;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import listpractice.BaseCLass;

public class failedscreen extends BaseCLass{
	
	public static void screenshot() throws IOException {
			
			System.out.println("take screenshot");
			Date d= new Date();
			String filename=d.toString().replace(" ", "_").replace(":", "_")+".jpg";
			
			File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(ss, new File("D:\\Selenium repository\\Screenshot\\"+filename));
	}
	
}
