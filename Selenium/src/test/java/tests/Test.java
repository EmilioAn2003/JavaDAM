package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import helpers.User;
import pages.Gmail;

public class Test {
	
	private WebDriver driver;
	
	private Gmail gmail;

	public void setUp() {
		
		DesiredCapabilities capas = new DesiredCapabilities();
		
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
		
		driver = new ChromeDriver();
		
		gmail = new Gmail(driver);
	}

	public void test() {
		User user1 = new User("correo@gmail.com", "contraseña");
		user1.abrirNavegador(driver);
		gmail.iniciarSesion(user1);
		user1.cerrarNavegador(driver);
	}

	
}
