package aplicacio.biblioteca;

public class Volum extends Obra{
	
	short nro;
	
	Volum(String ref, String tit, String aut, short n, short vol){
		super(ref,tit,aut,n);
		nro=vol;
	}
	
}
