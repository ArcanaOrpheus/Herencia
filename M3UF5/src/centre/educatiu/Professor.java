package centre.educatiu;

public final class Professor extends Treballador{
	
	private String titulacio;
	private String especialitat;
	
	Professor(String name, String adresa, String SS, String title, String esp) {
		super(name, adresa, SS);
		titulacio=title;
		especialitat=esp;
	}
	
	Professor (Treballador t, String title, String esp){
		super(t);
		titulacio=title;
		especialitat=esp;
	}
	
}
