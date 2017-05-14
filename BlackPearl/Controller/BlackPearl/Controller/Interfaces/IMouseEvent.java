package BlackPearl.Controller.Interfaces;

import org.openqa.selenium.WebDriver;

public interface IMouseEvent {
	public void MoveToElement(WebDriver webDriver, java.lang.String ObjectAlias, java.lang.String StrValue);

	public void ContextClick(WebDriver webDriver, java.lang.String ObjectAlias, java.lang.String StrValue);

	public void DoubleClick(WebDriver webDriver, java.lang.String ObjectAlias, java.lang.String StrValue);

	public void DragAndDrop(WebDriver webDriver, java.lang.String ObjectAlias, java.lang.String StrValue);

	public void DragAndDropBy(WebDriver webDriver, java.lang.String ObjectAlias, java.lang.String StrValue);

	public void MoveByOffset(WebDriver webDriver, java.lang.String ObjectAlias, java.lang.String StrValue);

	public void Release(WebDriver webDriver, java.lang.String ObjectAlias, java.lang.String StrValue);

}
