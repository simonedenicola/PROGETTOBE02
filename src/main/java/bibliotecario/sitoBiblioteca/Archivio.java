package bibliotecario.sitoBiblioteca;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;

import bibliotecario.ElementoLetterario.ElementoLetterario;
import bibliotecario.ElementoLetterario.Libro;

public class Archivio {
	
	private Map<String, ElementoLetterario> archivio = new HashMap<String, ElementoLetterario>();
	public void ricercaIsbn(String codIsbn) {
		
		ElementoLetterario lett = archivio.get(codIsbn);
		System.out.println(lett);
		
	};
	public void ricercaAnnoPubblicazione(int annoPubblicazione) {
		archivio.values()
		.stream()
		.filter(element -> annoPubblicazione == element.getAnnoPublicazione() )
		.forEach(element -> System.out.println(element));
		
	};
	public void aggiungiElemento(ElementoLetterario a) {
		archivio.put(a.getCodIsbn(), a);
	};
	public void rimuoviElemento(String codIsbn) {
		archivio.remove(codIsbn);
		System.out.println("Hai eliminato il file in modo corretto");
		
	};
	public void ricercaAutore(String autore) {
		archivio.values()
		.stream()
		
		.filter(element-> element instanceof Libro)
		.map(element-> (Libro)element)
		.filter(element -> autore.equals(element.getAutore()));
		
		
		
		
	};
	public void salvaElemento() {
		
		File elemento = new File ("Archivio/archivio.txt");
		String dato = "";
		for (ElementoLetterario element : archivio.values()) {
			dato += element.toString();
		}
		try {
			FileUtils.writeStringToFile(elemento, dato);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void caricamentoElemento() {
		File elemento = new File("Archivio/archivio.txt");
		try {
			String file = FileUtils.readFileToString(elemento);
			System.out.println(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	};
}

