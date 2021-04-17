package JuegoDeFichasColeccionables;

import java.util.Comparator;

public class CompararPorPrecio implements Comparator<FichaAbs>{

	@Override
	public int compare(FichaAbs fa1, FichaAbs fa2) {
		// TODO Auto-generated method stub
		if(fa1.getValor("Precio en USD") < fa2.getValor("Precio en USD"))   //Orden de Menor a Mayor
			return -1;
		else if(fa1.getValor("Precio en USD") > fa2.getValor("Precio en USD"))
			     return 1;
		else return 0;
	}

}
