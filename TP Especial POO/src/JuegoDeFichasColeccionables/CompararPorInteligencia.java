package JuegoDeFichasColeccionables;

import java.util.Comparator;

public class CompararPorInteligencia implements Comparator<FichaAbs>{

	@Override
	public int compare(FichaAbs fa1, FichaAbs fa2) {
		// TODO Auto-generated method stub
		if(fa1.getValor("Inteligencia") < fa2.getValor("Inteligencia"))   //Orden de Menor a Mayor
			return -1;
		else if(fa1.getValor("Inteligencia") > fa2.getValor("Inteligencia"))
			     return 1;
		else return 0;
	}

}
