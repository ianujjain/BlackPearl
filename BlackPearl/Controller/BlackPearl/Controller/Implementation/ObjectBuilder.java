package BlackPearl.Controller.Implementation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BlackPearl.Controller.Interfaces.IObjectBuilder;

import BlackPearl.Controller.Helper.ControllerConfig;
import BlackPearl.Controller.Enum.Locators;

public final class ObjectBuilder implements IObjectBuilder {

	private static ObjectBuilder instance = null;
	private By by = null;
	private WebElement element = null;
	private List<WebElement> elementList = null;

	private String strFindBy = null, strSelectorValue = null;
	private String[] arrObjectXpathAlias = null;

	private ObjectBuilder() {
	}

	public static ObjectBuilder GetObjectBuilderInstance() {
		if (instance == null) {
			instance = new ObjectBuilder();
		}
		return instance;
	}

	@Override
	public By GetObject(String strFindBy, String strSelectorValue) {
		// TODO Auto-generated method stub
		try {

			switch (Locators.valueOf(strFindBy.toUpperCase())) {
			case CLASS_NAME:
				by = By.className(strSelectorValue);
				break;
			case CSS_SELECTOR:
				by = By.cssSelector(strSelectorValue);
				break;
			case ID:
				by = By.id(strSelectorValue);
				break;
			case LINK_TEXT:
				by = By.linkText(strSelectorValue);
				break;
			case NAME:
				by = By.name(strSelectorValue);
				break;
			case PARTIAL_LINK_TEXT:
				by = By.partialLinkText(strSelectorValue);
				break;
			case TAG_NAME:
				by = By.tagName(strSelectorValue);
				break;
			case XPATH:
				by = By.xpath(strSelectorValue);
				break;
			case JAVASCRIPT:
				by = By.xpath(strSelectorValue);
				break;
			default:
				by = null;
				break;
			}
			return by;
		} catch (IllegalArgumentException e) {
			return by;
		} catch (Exception e) {
			return by;
		}
	}

	@Override
	public WebElement getElement(WebDriver webDriver, String ObjectAlias) {
		try {
			arrObjectXpathAlias = ObjectAlias.split(ControllerConfig.DELIMA_COLON);
			strFindBy = arrObjectXpathAlias[0];
			strSelectorValue = arrObjectXpathAlias[1];
			by = GetObject(strFindBy, strSelectorValue);
			element = webDriver.findElement(by);
			return element;
		} catch (NoSuchElementException objException) {
			return element;
		}
	}

	@Override
	public List<WebElement> getElements(WebDriver webDriver, String ObjectAlias) {
		try {
			arrObjectXpathAlias = ObjectAlias.split(ControllerConfig.DELIMA_COLON);
			strFindBy = arrObjectXpathAlias[0];
			strSelectorValue = arrObjectXpathAlias[1];
			by = GetObject(strFindBy, strSelectorValue);
			elementList = webDriver.findElements(by);
			return elementList;
		} catch (NoSuchElementException objException) {
			return elementList;
		}
	}

	@Override
	public WebElement getElementByJS(WebDriver webDriver, String ObjectAlias) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WebElement> getElementsByJS(WebDriver webDriver, String ObjectAlias) {
		// TODO Auto-generated method stub
		return null;
	}

}
