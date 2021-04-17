package JuegoDeFichasColeccionables;

public abstract class FiltroCompuesto implements Filtro{
	protected Filtro f1,f2;
	
	public FiltroCompuesto(Filtro f1,Filtro f2){
		this.f1 = f1;
		this.f2 = f2;
	}
	
	public abstract boolean cumple(FichaAbs fa);
}

