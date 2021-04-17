package JuegoDeFichasColeccionables;

public class FiltroMenor extends FiltroComparador{
	
	public FiltroMenor(double referencia,String atributo){
		super(referencia,atributo);
	}
	
	public boolean cumple(FichaAbs fa){
		return(fa.getValor(atributo)< referencia);
	}
}