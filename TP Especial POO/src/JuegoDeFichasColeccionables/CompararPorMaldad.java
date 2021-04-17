package JuegoDeFichasColeccionables;

import java.util.Comparator;

public class CompararPorMaldad implements Comparator<FichaAbs>{

	@Override
	public int compare(FichaAbs fa1, FichaAbs fa2) {
		// TODO Auto-generated method stub
		if(fa1.getValor("Maldad") < fa2.getValor("Maldad"))   //Orden de Menor a Mayor
			return -1;
		else if(fa1.getValor("Maldad") > fa2.getValor("Maldad"))
			     return 1;
		else return 0;
	}

}
