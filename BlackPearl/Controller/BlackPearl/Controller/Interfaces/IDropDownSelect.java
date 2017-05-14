package BlackPearl.Controller.Interfaces;

import org.openqa.selenium.WebDriver;

public interface IDropDownSelect {

	void SelectByValue(WebDriver webDriver, java.lang.String value,java.lang.String ObjectAlias);

	void SelectByIndex(WebDriver webDriver,int index,java.lang.String ObjectAlias);

	void SelectByVisibleText(WebDriver webDriver,java.lang.String text,java.lang.String ObjectAlias);
	
}
