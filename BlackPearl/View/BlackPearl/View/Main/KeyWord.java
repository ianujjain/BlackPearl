package BlackPearl.View.Main;

import java.util.EnumSet;



public enum KeyWord {
	KEYIN, KEYINRANDTEXT, KEYINRANDEMAIL, KEYINRANDNUM, CLICK, SUBMIT;

	public static EnumSet<KeyWord> TextBox = EnumSet.of(KEYIN, KEYINRANDTEXT, KEYINRANDEMAIL, KEYINRANDNUM);

	public static EnumSet<KeyWord> Button = EnumSet.of(CLICK, SUBMIT);
}
