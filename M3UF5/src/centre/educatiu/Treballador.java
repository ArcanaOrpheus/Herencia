package centre.educatiu;

public class Treballador extends Persona{

	private String numSS;
	private static String adresa;
	
	public String getNumSS() {
		return numSS;
	}
	
	
	public void setNumSS(String numSS) {
		this.numSS = numSS;
	}
	
	public static String getAdresa() {
		return adresa;
	}
	
	public void setAdresa(String adresa) {
		Treballador.adresa = adresa;
	}
	
	protected Treballador(String name, String adresa, String SS) {
		super(name, adresa);
		numSS=SS;
	}
	Treballador (Treballador t){
		super(t);
		this.numSS=t.numSS;
	}
	
	public void obtenirAdreses(){
		
		System.out.println("El treballador "+ nom +" viu a "+ adreça + " i treballa a "+ adresa);
	}
	
	public String toString() {
		return nom+" "+adresa+" "+ numSS+" "+ adreça;
	}
}
