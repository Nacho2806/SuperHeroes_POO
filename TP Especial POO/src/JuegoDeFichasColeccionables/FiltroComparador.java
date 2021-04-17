package JuegoDeFichasColeccionables;

public abstract class FiltroComparador implements Filtro{
	protected double referencia;
	protected String atributo;
	
	public FiltroComparador(double referencia,String atributo){
		this.referencia = referencia;
		this.atributo = atributo;
	}
	
	public abstract boolean cumple(FichaAbs fa);
}
