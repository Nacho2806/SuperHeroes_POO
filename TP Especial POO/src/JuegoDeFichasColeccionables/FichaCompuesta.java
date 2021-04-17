package JuegoDeFichasColeccionables;

import java.util.ArrayList;

public class FichaCompuesta extends FichaAbs{
	private ArrayList<FichaAbs> miembros;
	
	public FichaCompuesta(String nombre){
		super(nombre);
		this.miembros = new ArrayList<FichaAbs>();
	}
	
	/***************** SETTERS ************************/
	public void addMiembro(FichaAbs fa){
		this.miembros.add(fa);
	}
	
	/***************** GETTERS ************************/
	public ArrayList<FichaAbs> getMiembros(){return this.miembros;}
	
	public double getValor(String atributo){
		double suma = 0.0;
		for(FichaAbs fa: miembros){
			suma+=fa.getValor(atributo);
		}
		return (suma/this.miembros.size());
	}

	@Override
	public ArrayList<FichaAbs> buscar(Filtro f) {
		// TODO Auto-generated method stub
		ArrayList<FichaAbs> aux = new ArrayList<FichaAbs>();
		for(FichaAbs i: this.miembros){
			if(f.cumple(i))
				aux.add(i);
		}	
		return aux;
	}
	
	/*
	public int compareTo(FichaAbs fa) {
		// TODO Auto-generated method stub
		return super.compareTo(fa);
	}*/
}
