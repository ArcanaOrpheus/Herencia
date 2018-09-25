package centre.educatiu;

public class MAin {
	public static void main(String[] args) {
		Persona Orpheus = new Persona ("Orpheus", "Tarot nº0, the fool"); 
		Estudiant e1 = new Estudiant("Sans", "Dance", "Tudei", 1, "Rlly dude?");
		Estudiant e2 =new Estudiant(Orpheus, "Tudai tu", 100, "This is a nif");
		Treballador t1 = new Treballador("Engineer",  "I live here","Uganda");
		t1.setNumSS("This is my SS num");
		t1.setAdresa("I work here");
		Treballador t2= new Treballador (t1);
		Intercanvi i1 = new Intercanvi(e1, "I'm from here boi");
		Professor p1 = new Professor(t1,"Memes", "Dank memes");
		PersonalGestio pg1= new PersonalGestio(t1);
		pg1.setPosicio("Here boi");
		PersonalGestio pg2= new PersonalGestio(pg1);
		pg2.setPosicio("Boi");
		t2.obtenirAdreses();
		System.out.println("Estudiant 1");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(p1);
		System.out.println(pg1);
		System.out.println(pg2);
		System.out.println(i1);
		
	}
}
