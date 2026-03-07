package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.List;
import org.openqa.selenium.WebElement;

public class NavigationPage {

	WebDriver driver;

	By navigationItems = By.cssSelector("header a");

	public NavigationPage(WebDriver driver) {
		this.driver = driver;
	}

	public int getNavigationMenuCount() {

		List<WebElement> menus = driver.findElements(navigationItems);

		return menus.size();

	}

	public boolean clickMenu(String menuName) {

		List<WebElement> menus = driver.findElements(navigationItems);

		for (WebElement menu : menus) {

			if (menu.getText().equalsIgnoreCase(menuName)) {

				menu.click();
				return true;

			}

		}

		return false;

	}

}
