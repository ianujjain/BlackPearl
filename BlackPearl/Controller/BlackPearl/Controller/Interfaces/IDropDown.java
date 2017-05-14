package BlackPearl.Controller.Interfaces;

import org.openqa.selenium.WebDriver;

public interface IDropDown extends IDropDownSelect, IDropDwonDeSelect, IDropDownGetSelectedOption {

	boolean IsMultiple(WebDriver webDriver,java.lang.String ObjectAlias);

}
