package BlackPearl.Controller.Interfaces;

import java.net.URL;

import org.openqa.selenium.WebDriver;

import BlackPearl.Controller.Enum.DriverType;

public interface IWebDriverInit {

	public WebDriver initWebDriver(URL url, DriverType driverType);
}
