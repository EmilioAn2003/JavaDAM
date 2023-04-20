package aplicacion.act11;

import java.time.LocalDateTime;

public class MarcaPagina {
	
	private int pagina;
	private LocalDateTime ultimaLectura;

	MarcaPagina(int pagina) { 
		
		if(pagina>0)	this.pagina = pagina;
		else this.pagina = 1;
		
		lectura();
	
	}
	
	MarcaPagina() { this(1); }
	
	public void nPaginasMas(int n) { pagina += n; lectura(); }
	
	public void unaPaginasMas() { nPaginasMas(1); lectura(); }
	
	public void lectura() { ultimaLectura = LocalDateTime.now(); }
	
	public void releer() { pagina = 1; lectura(); }

	public int getPagina() { return pagina; }

	public void setPagina(int pagina) { this.pagina = pagina; }

	public LocalDateTime getUltimaLectura() { return ultimaLectura; }

	public void setUltimaLectura(LocalDateTime ultimaLectura) { this.ultimaLectura = ultimaLectura; }

	@Override
	public String toString() {
		return "Pagina " + pagina + " | " + ultimaLectura;
	}
	
}
