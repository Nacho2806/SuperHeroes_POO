package JuegoDeFichasColeccionables;
import java.util.Hashtable;
import java.util.ArrayList;

public class FichaSimple extends FichaAbs{
	private Hashtable<String,Double> atributos;
	
	public FichaSimple(String nombre){
		super(nombre);
		this.atributos = new Hashtable<String,Double>();
	}
	
	/***************** SETTERS ************************/
	public void addAtributo(String atributo,double valor){this.atributos.put(atributo, valor);}
	
	/***************** GETTERS ************************/
	public double getValor(String atributo){
		if(atributos.containsKey(atributo))
		     return atributos.get(atributo);
		else return 0.0;
	}

	@Override
	public ArrayList<FichaAbs> buscar(Filtro f) {
		// TODO Auto-generated method stub
		ArrayList<FichaAbs> aux = new ArrayList<FichaAbs>();
		if(f.cumple(this))
			aux.add(this);
		return aux;
	}

}

