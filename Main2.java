package domaci;

public class Main2 {

	public static double[] vrednostPromenljive = { 10, 20 };

	public static void main(String[] args) {
		
		Broj b2 = new Broj(2);
		Promenljiva p0 = new Promenljiva("x1", 10);
		Broj bn11 = new Broj(-11);
		Promenljiva p1 = new Promenljiva("x2", 20);

		Sabiranje s1 = new Sabiranje(b2, p0);
		Oduzimanje o1 = new Oduzimanje(s1, bn11);
		Sabiranje s2 = new Sabiranje(o1, p1);

		System.out.println("Rezultat: " + s2.izracunaj());
	}
}

