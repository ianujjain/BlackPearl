package BlackPearl.Controller.Interfaces;

import org.openqa.selenium.WebDriver;

import BlackPearl.Controller.Enum.TextType;

public interface IText {

	public void KeyIn(WebDriver webDriver, java.lang.String ObjectAlias, java.lang.String StrValue, TextType TypeText);

}
