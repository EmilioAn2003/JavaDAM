package pages.elementos;

public enum eGmail {
	
	L_CORREO("//*[@id=\"identifierId\"]"),
	B_SIGUIENTE("//*[@id=\"identifierNext\"]/div/button/span"),
	
	T_PROHIBIDO("//*[@id=\"headingText\"]/span"),
	B_REINTENTAR("//*[@id=\"next\"]/div/div/a"),
	
	B_INICIASESION("/html/body/header/div/div/div/a[2]"),
	
	L_CONTRASENYA("//*[@id=\"password\"]/div[1]/div/div[1]/input"),
	B_INGRESO("//*[@id=\"passwordNext\"]/div/button/span"),
	
	T_DENEGADO("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div[1]/div/form/span/section[2]/div/div/div[1]/div[2]/div[2]/span");
	
	private String xpath;
	
	private eGmail(String xpath) { this.xpath = xpath; }
	public String getXpath() { return xpath; }
}
