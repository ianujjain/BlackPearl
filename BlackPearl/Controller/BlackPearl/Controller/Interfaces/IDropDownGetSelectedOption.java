package BlackPearl.Controller.Interfaces;

import org.openqa.selenium.WebDriver;

public interface IDropDownGetSelectedOption {

	String GetFirstSelectedOption(WebDriver webDriver, java.lang.String ObjectAlias);

	java.util.List<String> GetAllSelectedOptions(WebDriver webDriver, java.lang.String ObjectAlias);

	java.util.List<String> GetOptions(WebDriver webDriver, java.lang.String ObjectAlias);
}