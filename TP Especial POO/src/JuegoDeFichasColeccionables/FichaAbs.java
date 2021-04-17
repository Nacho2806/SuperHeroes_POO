package JuegoDeFichasColeccionables;

import java.util.ArrayList;

public abstract class FichaAbs {
	protected String nombre;
	
	public FichaAbs(String nombre){
		this.nombre = nombre;
	}
	
	/***************** SETTERS ************************/
	public void setNombre(String nombre){this.nombre = nombre;}
	
	/***************** GETTERS ************************/
	public String getNombre(){return this.nombre;}
	
	public abstract double getValor(String atributo);
	
	public abstract ArrayList<FichaAbs> buscar(Filtro f);
  
}
