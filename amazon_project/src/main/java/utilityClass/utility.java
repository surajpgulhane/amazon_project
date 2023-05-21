package utilityClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utility {
	;
	
	public static void screenshotMethod(WebDriver driver) throws IOException, InterruptedException {
	
	Date d=new Date();
	SimpleDateFormat set=new SimpleDateFormat("(dd-MM-yyyy)_(hh-mm-ss)");
	String date=set.format(d);
	
	File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File Destination =new File("C:\\soft testing\\ssFile\\TestProof"+date+".jpg");
	FileHandler.copy(source, Destination);
	
	Thread.sleep(2000);
	driver.close();

}
}