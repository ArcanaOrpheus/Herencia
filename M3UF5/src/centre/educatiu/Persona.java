package centre.educatiu;

public class Persona {
	
	 static String nom;
	 static String adre�a;
	
	Persona(String name, String adress) {
		nom=name;
		adre�a=adress;
	}
	Persona (Persona p){
		Persona ps= new Persona(p.nom, p.adre�a);
	}
}
