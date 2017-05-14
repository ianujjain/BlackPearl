package BlackPearl.Controller.Interfaces;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface IObjectBuilder {

	public By GetObject(final String strFindBy, final String strSelectorValue);

	public WebElement getElement(WebDriver Driver, String ObjectAlias);

	public List<WebElement> getElements(WebDriver Driver, String ObjectAlias);

	public WebElement getElementByJS(WebDriver Driver, String ObjectAlias);

	public List<WebElement> getElementsByJS(WebDriver Driver, String ObjectAlias);
}
