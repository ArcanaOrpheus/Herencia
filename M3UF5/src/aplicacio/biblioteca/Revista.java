package aplicacio.biblioteca;

public class Revista extends Fitxa{

	short any;
	short nro;
	
	Revista(String ref, String tit, short year, short n){
		super(ref, tit);
		any=year;
		nro=n;
	}
	
}
