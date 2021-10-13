/*
 * Create una classe impiegato che abbia le seguenti proprietà: name, eta.
 * La classe deve implementare i vari metodi di get e set ed il metodo toString.
 */
public class Impiegato {
	
	private String name;
	private int eta;
	
	public Impiegato(String name, int eta) {
		this.name = name;
		this.eta = eta;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}
	
	public String toString() {
		return "Name: " + name + "\neta: " + eta;
	}
}
