package JuegoDeFichasColeccionables;

public class FiltroIgual extends FiltroComparador{
	
	public FiltroIgual(double referencia,String atributo){
		super(referencia,atributo);
	}
	
	public boolean cumple(FichaAbs fa){
		return(fa.getValor(atributo)== referencia);
	}
}
