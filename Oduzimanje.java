package domaci;

public class Oduzimanje extends BinarnaOperacija {

	public Oduzimanje(Izraz levi, Izraz desni) {
		super(levi, desni);
	}

	@Override
	public double izracunaj() {
		return levi.izracunaj() - desni.izracunaj();
	}

	@Override
	public String toString() {
		return "Razlika: " + izracunaj() + "\n";
	}
}
