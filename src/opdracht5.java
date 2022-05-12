public class opdracht5{
	public static void main(String[] args) {
		Auto ferari = new Auto(false, true, false, true);
		
		Monteur jan = new Monteur();
		jan.repareren(ferari);
	}
}

class Monteur{
	void repareren(Auto auto) {
		auto.motor = true;
		auto.deur = true;
		auto.voorruit = true;
		auto.uitlaat = true;
		System.out.println("the auto is klaar");
	}
}

class Auto{	
	boolean motor = false;
	boolean deur = false;
	boolean voorruit = false;
	boolean uitlaat = false;
	
	Auto (boolean motor, boolean deur, boolean voorruit, boolean uitlaat) {
		this.motor = motor;
		this.deur = deur;
		this.voorruit = voorruit;
		this.uitlaat = uitlaat;
	}
}