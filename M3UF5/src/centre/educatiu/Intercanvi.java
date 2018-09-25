package centre.educatiu;

public final class Intercanvi extends Estudiant{
	
	private String paisOrigen;
	
	Intercanvi (String dt, int age, String nif, String paisOrigen) {
		super(dt,paisOrigen,nif, age, paisOrigen);
		this.paisOrigen=paisOrigen;
	}
	
	Intercanvi (Estudiant e, String paisOrigen){
		super(e);
		this.paisOrigen=paisOrigen;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
