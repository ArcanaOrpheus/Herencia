package centre.educatiu;

public final class PersonalGestio extends Treballador{

	private String posicio;
	
	public String getPosicio() {
		return posicio;
	}

	public void setPosicio(String posicio) {
		this.posicio = posicio;
	}

	protected PersonalGestio(String name, String adresa, String SS) {
		super(name, adresa, SS);
	}

	PersonalGestio(Treballador t){
		super(t);
	}	
	PersonalGestio(PersonalGestio pg){
		super(pg);
	}
	
	public String toString() {
		return super.toString()+" "+posicio;
	}
	
}
