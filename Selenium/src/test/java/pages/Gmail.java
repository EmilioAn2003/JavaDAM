package pages;


import org.openqa.selenium.WebDriver;

import helpers.User;
import pages.elementos.eGmail;

public class Gmail extends Page{
	
	private final static String PAGINA = "https://www.gmail.com";
	
	public Gmail(WebDriver driver) { super(driver, PAGINA); }

	
	public void iniciarSesion(User user) {
		
		if( user.verifica("Inicia sesión", eGmail.B_INICIASESION, driver) ){
			user.click(eGmail.B_INICIASESION, driver);
		}

		user.input(eGmail.L_CORREO, user.getCorreo(), driver);
		user.click(eGmail.B_SIGUIENTE, driver);
		
		if( user.verifica("No se ha podido iniciar sesión", eGmail.T_PROHIBIDO, driver) ){
			
			user.click(eGmail.B_REINTENTAR, driver);
		
		}else {
		
			user.input(eGmail.L_CONTRASENYA, user.getContrasenya(), driver);
			user.click(eGmail.B_INGRESO, driver);
			
			if( user.verifica("Contraseña incorrecta", eGmail.T_DENEGADO, driver) ) {
				user.cerrarNavegador(driver);
			}
		}
	}
	
}
