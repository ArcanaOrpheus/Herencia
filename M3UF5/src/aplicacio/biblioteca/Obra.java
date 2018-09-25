package aplicacio.biblioteca;

public class Obra extends Fitxa{
	
	String autor;
	short nrePags;
	
	Obra(String ref, String tit, String aut, short n){
		super(ref,tit);
		autor=aut;
		nrePags=n;
	}

}
