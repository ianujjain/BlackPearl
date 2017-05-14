package BlackPearl.Controller.Interfaces;

import org.openqa.selenium.WebDriver;

public interface IKeyboardEvent {

	public void KeyDown(WebDriver webDriver, java.lang.String ObjectAlias, java.lang.String StrValue);

	public void KeyUp(WebDriver webDriver, java.lang.String ObjectAlias, java.lang.String StrValue);

	public void SendKeys(WebDriver webDriver, java.lang.String ObjectAlias, java.lang.String StrValue);

}
