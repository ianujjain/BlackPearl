package BlackPearl.Controller.Interfaces;

import org.openqa.selenium.Cookie;

public interface ICookies {
	void AddCookie(Cookie cookie);

	void DeleteAllCookies();

	void DeleteCookie(Cookie cookie);

	void DeleteCookieNamed(final java.lang.String CookieName);

	void GetCookieNamed(final java.lang.String CookieName);

	java.util.Set<Cookie> GetCookies();
}
