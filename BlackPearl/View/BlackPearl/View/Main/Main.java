package BlackPearl.View.Main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Main {

	static com.relevantcodes.extentreports.ExtentReports extent;
	static com.relevantcodes.extentreports.ExtentTest test;

	static final Logger reportsLog = Logger.getLogger("ReportsLog");
	static final Logger errorLog = Logger.getLogger("ErrorLog");
	static final Logger Log = Logger.getLogger(Main.class.getName());
	static WebDriver webDriver = null;

	static final String filePath = "D:\\Automation Setup\\BlackPearlGitRepository\\BlackPearl\\Logs\\log4j.properties";

	static {

		FileInputStream in;
		FileOutputStream out;
		Properties props = new Properties();
		try {
			in = new FileInputStream(filePath);
			props.load(in);
			in.close();
			out = new FileOutputStream(filePath);
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
			System.out.println(dateFormat.format(new Date()));
			props.setProperty("current.date", dateFormat.format(new Date()));
			props.setProperty("AppName", "HelloDude");
			props.store(out, null);
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			
			FirefoxProfile profile = new FirefoxProfile();
			profile.setAssumeUntrustedCertificateIssuer(true);
			profile.setAcceptUntrustedCertificates(true);
			
			FirefoxDriver driver = new FirefoxDriver();
			
			System.setProperty("webdriver.gecko.driver", "D:\\Automation Setup\\BlackPearlGitRepository\\BlackPearl\\Resources\\Driver\\geckodriver.exe");
			driver.get("http://www.google.com");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {

		}
	}
}
