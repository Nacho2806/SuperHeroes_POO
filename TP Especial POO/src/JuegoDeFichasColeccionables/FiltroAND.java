package JuegoDeFichasColeccionables;

public class FiltroAND extends FiltroCompuesto{
	
	public FiltroAND(Filtro f1,Filtro f2){
		super(f1,f2);
	}
	
	public boolean cumple(FichaAbs fa){
		return(f1.cumple(fa) && f2.cumple(fa));
	}
}
