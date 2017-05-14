package BlackPearl.Controller.Implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BlackPearl.Controller.Enum.TextType;
import BlackPearl.Controller.Interfaces.IText;
import BlackPearl.Controller.Helper.ControllerHelper;
import BlackPearl.Controller.Helper.ControllerConfig;

/**
 * @author iAnuj
 *
 */
public final class Text implements IText {

	private String arrStringLength[] = null;

	private WebElement element = null;

	private ObjectBuilder ObjObjectBuilder = ObjectBuilder.GetObjectBuilderInstance();

	@Override
	public void KeyIn(WebDriver webDriver,String ObjectAlias, String StrValue, TextType TypeText) {
		try {
			element = ObjObjectBuilder.getElement(webDriver, ObjectAlias);
			element.clear();
			switch (TypeText) {
			case TEXT:
				KeyInText(StrValue);
				break;
			case RANDOM_TEXT:
				KeyInRandText(StrValue);
				break;
			case INT:
				KeyInInt(StrValue);
				break;
			case RANDOM_INT:
				KeyInRandInt(StrValue);
				break;
			case FLOAT:
				KeyInDouble(StrValue);
				break;
			case RANDOM_FLOAT:
				KeyInRandDouble(StrValue);
				break;
			default:
				break;
			}
		} catch (Exception exception) {

		}
	}

	private void KeyInText(String StrValue) {
		try {
			element.sendKeys(StrValue);
		} catch (Exception exception) {
		}
	}

	private void KeyInRandText(String StrValue) {
		String strRandText = "";
		try {
			strRandText = ControllerHelper.GetRandomText(Integer.parseInt(StrValue));
			element.sendKeys(strRandText);
		} catch (Exception exception) {
		}
	}

	private void KeyInInt(String StrValue) {
		try {
			element.sendKeys(StrValue);
		} catch (Exception exception) {
		}
	}

	private void KeyInRandInt(String StrValue) {
		String strMin = "", stMax = "";
		int intRand = 0;
		try {
			arrStringLength = StrValue.split(ControllerConfig.DELIMA_HYPHEN);
			strMin = arrStringLength[0];
			stMax = arrStringLength[1];

			intRand = ControllerHelper.GetRandomIntNumber(Integer.parseInt(strMin), Integer.parseInt(stMax));
			element.sendKeys(String.valueOf(intRand));
		} catch (Exception exception) {
		}
	}

	private void KeyInDouble(String StrValue) {
		try {
			element.sendKeys(StrValue);
		} catch (Exception exception) {
		}
	}

	private void KeyInRandDouble(String StrValue) {
		String strMin = "", stMax = "";
		String doubleRand = "";
		try {
			arrStringLength = StrValue.split(ControllerConfig.DELIMA_HYPHEN);
			strMin = arrStringLength[0];
			stMax = arrStringLength[1];

			doubleRand = ControllerHelper.RandomDoubleNumber(Integer.parseInt(strMin), Integer.parseInt(stMax));
			element.sendKeys(String.valueOf(doubleRand));
		} catch (Exception exception) {
		}
	}
}
