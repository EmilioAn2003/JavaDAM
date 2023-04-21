package pages;

import org.openqa.selenium.WebDriver;

public class Page {
	
	protected WebDriver driver;
	
	public Page(WebDriver driver, String pagina) {
		this.driver = driver;
		this.driver.navigate().to(pagina);
	}
	
	
}
