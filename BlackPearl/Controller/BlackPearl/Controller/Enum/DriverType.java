package BlackPearl.Controller.Enum;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.opera.OperaOptions;

import BlackPearl.Controller.Helper.ControllerConfig;

public enum DriverType {
	CHROME {
		@SuppressWarnings("unused")
		public WebDriver initWebDriver(URL url, DriverType driverType) {
			File chromeFile = new File(ControllerConfig.CHROME_DRIVER);

			DesiredCapabilities capability = DesiredCapabilities.chrome();
			capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			System.setProperty("webdriver.chrome.driver", chromeFile.getAbsolutePath());

			WebDriver WebDriver = new ChromeDriver(capability);
			WebDriver.manage().window().maximize();
			WebDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebDriver.navigate().to(url);
			return WebDriver;
		}
	},
	FIREFOX {
		@SuppressWarnings("unused")
		public WebDriver initWebDriver(URL url, DriverType driverType) {

			FirefoxProfile profile = new FirefoxProfile();
			profile.setAssumeUntrustedCertificateIssuer(true);
			profile.setAcceptUntrustedCertificates(true);

			WebDriver WebDriver = new FirefoxDriver();
			WebDriver.manage().window().maximize();

			WebDriver.navigate().to(url);
			return WebDriver;
		}
	},
	INTERNETEXPLORER {
		@SuppressWarnings("unused")
		public WebDriver initWebDriver(URL url, DriverType driverType) {
			DesiredCapabilities objDesiredCapabilities = DesiredCapabilities.internetExplorer();
			objDesiredCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

			System.setProperty("webdriver.ie.driver", ControllerConfig.INTERNET_EXPLORER_DRIVER);

			WebDriver WebDriver = new InternetExplorerDriver();
			WebDriver.manage().window().maximize();
			WebDriver.navigate().to("javascript:document.getElementById('overridelink').click()");
			WebDriver.navigate().to(url);
			return WebDriver;
		}
	},
	OPERA {
		@SuppressWarnings("unused")
		public WebDriver initWebDriver(URL url, DriverType driverType) {
			OperaOptions options = new OperaOptions();

			System.setProperty("webdriver.opera.driver", ControllerConfig.OPERA_DRIVER);
			options.setBinary(ControllerConfig.OPERA_BROWSER_LOCATION);

			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			capabilities.setCapability(OperaOptions.CAPABILITY, options);

			WebDriver WebDriver = new OperaDriver(capabilities);
			WebDriver.manage().window().maximize();
			WebDriver.navigate().to(url);
			return WebDriver;
		}
	};

}