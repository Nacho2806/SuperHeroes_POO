package JuegoDeFichasColeccionables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Coleccion {
	private String nombre;
	private ArrayList<FichaAbs> fichas;
	
	public Coleccion(String nombre){
		this.nombre = nombre;
		this.fichas = new ArrayList<FichaAbs>();
	}
	
	/***************** SETTERS ************************/
	public void setNombre(String nombre){this.nombre = nombre;}
	
	public void addColeccion(FichaAbs fa){     //Una coleccion esta formado por 1 o mas elementos
		this.fichas.add(fa);
	}
	
	/***************** GETTERS ************************/
	public String getNombre(){ return this.nombre;}
	
	public ArrayList<FichaAbs> getMiembros(){ return this.fichas;}
	
	public FichaAbs getElemento(int pos){return this.fichas.get(pos);}
	
	public void ordenarAscendentemente(Comparator<FichaAbs> c){ 
		Collections.sort(this.fichas, c);
	}
	
	public void ordenarDescendentemente(Comparator<FichaAbs> c){ 
		Collections.sort(this.fichas, c.reversed());
	}
	
	public ArrayList<FichaAbs> buscar(Filtro f){
		ArrayList<FichaAbs> aux = new ArrayList<FichaAbs>();
		for(FichaAbs i: this.fichas){
			if(f.cumple(i))
				aux.add(i);
		}
		return aux;
	}
	
	public void imprimir(ArrayList<String> atributos){            //Imprimo coleccion. Imprimo nombre y atributos 
		for(FichaAbs i: this.fichas){							  //que lleguen por parametros
			System.out.println("NOMBRE= "+ i.getNombre()+"\n");
			for(String j: atributos){
				System.out.println(j+"= "+i.getValor(j));
			}
			System.out.println("\n");
		}
	}
}
