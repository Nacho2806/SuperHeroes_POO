package JuegoDeFichasColeccionables;

import java.util.Comparator;

public class CompararPorHP implements Comparator<FichaAbs>{

	@Override
	public int compare(FichaAbs fa1, FichaAbs fa2) {
		// TODO Auto-generated method stub
		if(fa1.getValor("HP") < fa2.getValor("HP"))   //Orden de Menor a Mayor
			return -1;
		else if(fa1.getValor("HP") > fa2.getValor("HP"))
			     return 1;
		else return 0;
	}

}
