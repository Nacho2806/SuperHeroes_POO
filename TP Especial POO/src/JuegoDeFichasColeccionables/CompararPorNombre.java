package JuegoDeFichasColeccionables;

import java.util.Comparator;

public class CompararPorNombre implements Comparator<FichaAbs>{

	@Override
	public int compare(FichaAbs fa1, FichaAbs fa2) {
		// TODO Auto-generated method stub
		return((fa1.getNombre()).compareTo(fa2.getNombre())); //Orden alfabetico
	}
}
