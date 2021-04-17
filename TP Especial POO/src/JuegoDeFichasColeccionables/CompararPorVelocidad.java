package JuegoDeFichasColeccionables;

import java.util.Comparator;

public class CompararPorVelocidad implements Comparator<FichaAbs>{
	
	@Override
	public int compare(FichaAbs fa1, FichaAbs fa2) {
		// TODO Auto-generated method stub
		if(fa1.getValor("Velocidad") < fa2.getValor("Velocidad"))   //Orden de Menor a Mayor
			return -1;
		else if(fa1.getValor("Velocidad") > fa2.getValor("Velocidad"))
			     return 1;
		else return 0;
	}
}