package JuegoDeFichasColeccionables;

public class FiltroMayor extends FiltroComparador{
	
	public FiltroMayor(double referencia,String atributo){		
		super(referencia,atributo);
	}
	
	public boolean cumple(FichaAbs fa){
		return(fa.getValor(atributo)> referencia); /** Cumple si el valor del atributo es mayor al de referencia**/
	}
}
