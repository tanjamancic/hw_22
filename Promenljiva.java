package domaci;

public class Promenljiva extends Izraz {
	
	private String ime;
	private int vrednost;

	public Promenljiva(String ime, int vrednost) {
		super();
		this.ime = ime;
		this.vrednost = vrednost;
	}

	@Override
	public double izracunaj() {
		return vrednost;
	}

	public String toString() {
		return ime + vrednost;
	}
}
