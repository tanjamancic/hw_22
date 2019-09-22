package domaci;

public class Sabiranje extends BinarnaOperacija {

	public Sabiranje(Izraz levi, Izraz desni) {
		super(levi, desni);
	}

	@Override
	public double izracunaj() {
		return levi.izracunaj() + desni.izracunaj();
	}

	@Override
	public String toString() {
		return "Zbir:" + izracunaj() + "\n";
	}
}
