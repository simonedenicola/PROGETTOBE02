package bibliotecario.ElementoLetterario;

public abstract class ElementoLetterario {
	private String codIsbn;
	private String titolo;
	private int annoPublicazione;
	private int numPagg;
	
	public ElementoLetterario(String codIsbn, String titolo, int annoPublicazione, int numPagg) {
		this.codIsbn = codIsbn;
		this.titolo = titolo;
		this.annoPublicazione = annoPublicazione;
		this.numPagg = numPagg;
	}
	public String getCodIsbn() {
		return codIsbn;
	}
	public void setCodIsbn(String codIsbn) {
		this.codIsbn = codIsbn;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public int getAnnoPublicazione() {
		return annoPublicazione;
	}
	public void setAnnoPublicazione(int annoPublicazione) {
		this.annoPublicazione = annoPublicazione;
	}
	public int getNumPagg() {
		return numPagg;
	}
	public void setNumPagg(int numPagg) {
		this.numPagg = numPagg;
	}
	@Override
	public String toString() {
		return "ElementoLetterario [codIsbn=" + codIsbn + ", titolo=" + titolo + ", annoPublicazione="
				+ annoPublicazione + ", numPagg=" + numPagg + "]";
	}
	
	
	
	

}
