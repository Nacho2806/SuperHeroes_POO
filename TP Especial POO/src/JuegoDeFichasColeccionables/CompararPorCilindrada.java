package JuegoDeFichasColeccionables;

import java.util.Comparator;

public class CompararPorCilindrada implements Comparator<FichaAbs>{

	@Override
	public int compare(FichaAbs fa1, FichaAbs fa2) {
		// TODO Auto-generated method stub
		if(fa1.getValor("Cm3") < fa2.getValor("Cm3"))   //Orden de Menor a Mayor
			return -1;
		else if(fa1.getValor("Cm3") > fa2.getValor("Cm3"))
			     return 1;
		else return 0;
	}

}