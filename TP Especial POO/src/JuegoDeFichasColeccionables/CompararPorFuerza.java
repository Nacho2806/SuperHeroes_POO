package JuegoDeFichasColeccionables;

import java.util.Comparator;

public class CompararPorFuerza implements Comparator<FichaAbs>{

	@Override
	public int compare(FichaAbs fa1, FichaAbs fa2) {
		// TODO Auto-generated method stub
		if(fa1.getValor("Fuerza") < fa2.getValor("Fuerza"))   //Orden de Menor a Mayor
			return -1;
		else if(fa1.getValor("Fuerza") > fa2.getValor("Fuerza"))
			     return 1;
		else return 0;
	}

}