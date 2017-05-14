package BlackPearl.Controller.Implementation;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BlackPearl.Controller.Interfaces.IDropDown;
import BlackPearl.Controller.Implementation.ObjectBuilder;;

public final class DropDown implements IDropDown {

	private Select objSelect = null;
	
	private WebElement element = null;
	private List<WebElement> webEleListSelectedOption = null;
	private List<WebElement> webEleListOption = null;
	
	private List<String> strListSelectedOption = null;
	private List<String> strListOption = null;
	
	private ObjectBuilder ObjObjectBuilder = ObjectBuilder.GetObjectBuilderInstance();

	@Override
	public void SelectByValue(WebDriver webDriver, String value, String ObjectAlias) {
		try {
			element = ObjObjectBuilder.getElement(webDriver, ObjectAlias);
			objSelect = new Select(element);
			objSelect.selectByValue(value);
		} catch (Exception exception) {
		}
	}

	@Override
	public void SelectByIndex(WebDriver webDriver, int index, String ObjectAlias) {
		try {
			element = ObjObjectBuilder.getElement(webDriver, ObjectAlias);
			objSelect = new Select(element);
			objSelect.selectByIndex(index);
		} catch (Exception exception) {
		}
	}

	@Override
	public void SelectByVisibleText(WebDriver webDriver, String text, String ObjectAlias) {
		try {
			element = ObjObjectBuilder.getElement(webDriver, ObjectAlias);
			objSelect = new Select(element);
			objSelect.selectByVisibleText(text);
		} catch (Exception exception) {
		}
	}

	@Override
	public void DeselectAll(WebDriver webDriver, String ObjectAlias) {
		try {
			element = ObjObjectBuilder.getElement(webDriver, ObjectAlias);
			objSelect = new Select(element);
			objSelect.deselectAll();
		} catch (Exception exception) {
		}
	}

	@Override
	public void DeselectByValue(WebDriver webDriver, String value, String ObjectAlias) {
		try {
			element = ObjObjectBuilder.getElement(webDriver, ObjectAlias);
			objSelect = new Select(element);
			objSelect.deselectByValue(value);
		} catch (Exception exception) {
		}
	}

	@Override
	public void DeselectByIndex(WebDriver webDriver, int index, String ObjectAlias) {
		try {
			element = ObjObjectBuilder.getElement(webDriver, ObjectAlias);
			objSelect = new Select(element);
			objSelect.deselectByIndex(index);
		} catch (Exception exception) {
		}
	}

	@Override
	public void DeselectByVisibleText(WebDriver webDriver, String text, String ObjectAlias) {
		try {
			element = ObjObjectBuilder.getElement(webDriver, ObjectAlias);
			objSelect = new Select(element);
			objSelect.deselectByVisibleText(text);
		} catch (Exception exception) {
		}
	}

	@Override
	public String GetFirstSelectedOption(WebDriver webDriver, String ObjectAlias) {
		try {
			element = ObjObjectBuilder.getElement(webDriver, ObjectAlias);
			objSelect = new Select(element);
			return objSelect.getFirstSelectedOption().getText();
		} catch (Exception exception) {
			return null;
		}
	}

	@Override
	public List<String> GetAllSelectedOptions(WebDriver webDriver, String ObjectAlias) {
		try {
			element = ObjObjectBuilder.getElement(webDriver, ObjectAlias);
			objSelect = new Select(element);
			webEleListSelectedOption = objSelect.getAllSelectedOptions();
			for (WebElement selectoption : webEleListSelectedOption) {
				strListSelectedOption.add(selectoption.getText());
			}
			return strListSelectedOption;
		} catch (Exception exception) {
			return null;
		}
	}

	@Override
	public List<String> GetOptions(WebDriver webDriver, String ObjectAlias) {
		try {
			element = ObjObjectBuilder.getElement(webDriver, ObjectAlias);
			objSelect = new Select(element);
			webEleListOption = objSelect.getOptions();
			for (WebElement selectoption : webEleListOption) {
				strListOption.add(selectoption.getText());
			}
			return strListOption;
		} catch (Exception exception) {
			return null;
		}
	}

	@Override
	public boolean IsMultiple(WebDriver webDriver, String ObjectAlias) {
		boolean multiple = false;
		try {
			element = ObjObjectBuilder.getElement(webDriver, ObjectAlias);
			objSelect = new Select(element);
			multiple = objSelect.isMultiple();
			return multiple;
		} catch (Exception exception) {
			return multiple;
		}
	}
}
