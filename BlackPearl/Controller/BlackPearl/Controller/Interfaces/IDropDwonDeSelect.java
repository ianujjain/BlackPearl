package BlackPearl.Controller.Interfaces;

import org.openqa.selenium.WebDriver;

public interface IDropDwonDeSelect {

	void DeselectAll(WebDriver webDriver,java.lang.String ObjectAlias);

	void DeselectByValue(WebDriver webDriver,java.lang.String value, java.lang.String ObjectAlias);

	void DeselectByIndex(WebDriver webDriver,int index, java.lang.String ObjectAlias);

	void DeselectByVisibleText(WebDriver webDriver,java.lang.String text, java.lang.String ObjectAlias);
}
