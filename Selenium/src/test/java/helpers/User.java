package helpers;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.elementos.eGmail;

public class User {
	
	private String correo;
	private String contrasenya;

	public User(String correo, String contrasenya) {
		this.correo = correo;
		this.contrasenya = contrasenya;
	}
	
	public String getCorreo() { return correo; }
	public void setCorreo(String correo) { this.correo = correo; }

	public String getContrasenya() { return contrasenya; }
	public void setContrasenya(String contrasenya) { this.contrasenya = contrasenya; }
	
	private void espera(String texto) { JOptionPane.showMessageDialog(null, texto); }
	
	public String pideElemento(eGmail e) { return JOptionPane.showInputDialog("Error de elemento "+e.toString()); }
	
	public void abrirNavegador(WebDriver driver) { 
		espera("Abrir naveador"); driver.manage().window(); 
	}
	
	public void cerrarNavegador(WebDriver driver) { 
		espera("Cerrar navegador"); driver.close(); 
	}
	
	private WebElement elementoWeb(String xpath, WebDriver driver) { 
		return driver.findElement( By.xpath(xpath) ); 
	}
	
	public void click(eGmail e, WebDriver driver) { 
		espera("Hacer Click"); elementoWeb( e.getXpath(), driver).click(); 
	}
	
	public void input(eGmail e, String texto, WebDriver driver) { 
		espera("Hacer Input"); elementoWeb( e.getXpath(), driver).sendKeys(texto); 
	}
	
	public boolean verifica(String texto, eGmail e, WebDriver driver) {
		espera("Verificar");
		try { return elementoWeb(e.getXpath(), driver).getText().contains(texto); } 
		catch(Exception ex) { return false; }
	}
	
	
	
	
}
