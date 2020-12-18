package report;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Generatereport {

	
	public ExtentHtmlReporter htmlreproter;
	public ExtentReports extents;
	public ExtentTest test;
	
	@BeforeTest
	public void setReport() {
		
		htmlreproter=new ExtentHtmlReporter("./reports/extent.html");
		htmlreproter.config().setDocumentTitle("Abhinav Shares");
		htmlreproter.config().setReportName("Share Prices");
		htmlreproter.config().setTheme(Theme.STANDARD);
		
		extents=new ExtentReports();
		extents.attachReporter(htmlreproter);
		
		extents.setSystemInfo("Dubay COmpany", "Upper circuit");
	}
	
	@AfterTest
	public void endReport() {
		extents.flush();
	}
	
	@Test
	public void login() {
		test=extents.createTest("KAMEHAMEHA");
		System.out.println("test case psased");
		
	}
	
	@AfterMethod
	public void teardowns(ITestResult result) {
		
		if (result.getStatus() == ITestResult.SUCCESS) {
			String methodname=result.getMethod().getMethodName();
			String text="<b>" + "TEST CASE :-"+methodname.toUpperCase()+"PASSED";
			Markup m = MarkupHelper.createLabel(text,ExtentColor.INDIGO);
			//MarkupHelper.createLabel(text, ExtentColor.GREEN);
			test.pass(m);
		}
	}
	
	
}
