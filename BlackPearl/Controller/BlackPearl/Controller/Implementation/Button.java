package BlackPearl.Controller.Implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BlackPearl.Controller.Interfaces.IButton;

public final class Button implements IButton {

	private ObjectBuilder ObjObjectBuilder = ObjectBuilder.GetObjectBuilderInstance();
	private WebElement element = null;

	@Override
	public void Click(WebDriver webDriver, String ObjectAlias) {
		try {
			element = ObjObjectBuilder.getElement(webDriver, ObjectAlias);
			element.click();
		} catch (Exception exception) {
		}
	}

	@Override
	public void Submit(WebDriver webDriver, String ObjectAlias) {
		try {
			element = ObjObjectBuilder.getElement(webDriver, ObjectAlias);
			element.submit();
		} catch (Exception exception) {
		}
	}

}