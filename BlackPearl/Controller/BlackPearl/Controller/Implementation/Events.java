/**
 * 
 */
package BlackPearl.Controller.Implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BlackPearl.Controller.Helper.ControllerConfig;
import BlackPearl.Controller.Interfaces.IEvents;

/**
 * @author iAnuj
 *
 */
public final class Events implements IEvents {

	Actions actions = null;
	private ObjectBuilder ObjObjectBuilder = ObjectBuilder.GetObjectBuilderInstance();
	private WebElement elementTo = null;
	private WebElement elementFrom = null;
	
	private String ObjectAlias1 = null, ObjectAlias2 = null;
	private String[] arrObjectXpathAlias = null;

	@Override
	public void MoveToElement(WebDriver webDriver, String ObjectAlias, String StrValue) {
		try{			
			ExtractObjectAlias(ObjectAlias);
			actions = new Actions(webDriver);
			
			elementTo = ObjObjectBuilder.getElement(webDriver, ObjectAlias1);
			actions.moveToElement(elementTo);
			
			elementFrom = ObjObjectBuilder.getElement(webDriver, ObjectAlias2);
			actions.moveToElement(elementFrom);
			
			actions.click().build().perform();
			
		}catch(Exception exception){
			
		}
	}

	@Override
	public void ContextClick(WebDriver webDriver, String ObjectAlias, String StrValue) {

	}

	@Override
	public void DoubleClick(WebDriver webDriver, String ObjectAlias, String StrValue) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see BlackPearl.Controller.Interfaces.IMouseEvent#DragAndDrop(org.openqa.
	 * selenium.WebDriver, java.lang.String, java.lang.String)
	 */
	@Override
	public void DragAndDrop(WebDriver webDriver, String ObjectAlias, String StrValue) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * BlackPearl.Controller.Interfaces.IMouseEvent#DragAndDropBy(org.openqa.
	 * selenium.WebDriver, java.lang.String, java.lang.String)
	 */
	@Override
	public void DragAndDropBy(WebDriver webDriver, String ObjectAlias, String StrValue) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * BlackPearl.Controller.Interfaces.IMouseEvent#MoveByOffset(org.openqa.
	 * selenium.WebDriver, java.lang.String, java.lang.String)
	 */
	@Override
	public void MoveByOffset(WebDriver webDriver, String ObjectAlias, String StrValue) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * BlackPearl.Controller.Interfaces.IMouseEvent#Release(org.openqa.selenium.
	 * WebDriver, java.lang.String, java.lang.String)
	 */
	@Override
	public void Release(WebDriver webDriver, String ObjectAlias, String StrValue) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see BlackPearl.Controller.Interfaces.IKeyboardEvent#KeyDown(org.openqa.
	 * selenium.WebDriver, java.lang.String, java.lang.String)
	 */
	@Override
	public void KeyDown(WebDriver webDriver, String ObjectAlias, String StrValue) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * BlackPearl.Controller.Interfaces.IKeyboardEvent#KeyUp(org.openqa.selenium
	 * .WebDriver, java.lang.String, java.lang.String)
	 */
	@Override
	public void KeyUp(WebDriver webDriver, String ObjectAlias, String StrValue) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see BlackPearl.Controller.Interfaces.IKeyboardEvent#SendKeys(org.openqa.
	 * selenium.WebDriver, java.lang.String, java.lang.String)
	 */
	@Override
	public void SendKeys(WebDriver webDriver, String ObjectAlias, String StrValue) {
		// TODO Auto-generated method stub

	}
	
	private void ExtractObjectAlias(String ObjectAlias){
		try{
			arrObjectXpathAlias = ObjectAlias.split(ControllerConfig.DELIMA_COLON);
			ObjectAlias1 = arrObjectXpathAlias[0];
			ObjectAlias2 = arrObjectXpathAlias[1];
		}catch(Exception exception){
			
		}
	}

}
