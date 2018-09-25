package centre.educatiu;

public class Persona {
	
	 static String nom;
	 static String adreça;
	
	Persona(String name, String adress) {
		nom=name;
		adreça=adress;
	}
	Persona (Persona p){
		Persona ps= new Persona(p.nom, p.adreça);
	}
}
