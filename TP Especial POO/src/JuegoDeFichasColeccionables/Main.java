package JuegoDeFichasColeccionables;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

public static void main(String[] args) {
// TODO Auto-generated method stub

//----------------------------------------------------------------------------//
//------------------------------- Inciso 1) ----------------------------------//
//----------------------------------------------------------------------------//
	FichaSimple f1 = new FichaSimple("Flash");
				f1.addAtributo("Altura", 1.78);
				f1.addAtributo("Peso", 90);
				f1.addAtributo("Fuerza", 900);
				f1.addAtributo("Peleas Ganadas", 10);
				f1.addAtributo("Velocidad", 800000);
				f1.addAtributo("Inteligencia", 50);
	FichaSimple f2 = new FichaSimple("Capit�n Fr�o");
				f2.addAtributo("Altura", 1.88);
				f2.addAtributo("Peso", 95);
				f2.addAtributo("Fuerza", 600);
				f2.addAtributo("Peleas Ganadas", 20);
				f2.addAtributo("Velocidad", 48);
				f2.addAtributo("Maldad", 50);
	FichaSimple f3 = new FichaSimple("Superman");
				f3.addAtributo("Altura", 1.92);
				f3.addAtributo("Peso", 107);
				f3.addAtributo("Fuerza", 2600);
				f3.addAtributo("Peleas Ganadas", 200);
				f3.addAtributo("Velocidad", 1200);
	FichaSimple f4 = new FichaSimple("Batman");
				f4.addAtributo("Altura", 1.89);
				f4.addAtributo("Peso", 96);
				f4.addAtributo("Fuerza", 950);
				f4.addAtributo("Peleas Ganadas", 15);
				f4.addAtributo("Velocidad", 120);
				f4.addAtributo("Inteligencia", 150);
	FichaSimple f5 = new FichaSimple("Robin");
				f5.addAtributo("Altura", 1.75);
				f5.addAtributo("Peso", 65);
				f5.addAtributo("Fuerza", 710);
				f5.addAtributo("Peleas Ganadas", 8);
				f5.addAtributo("Velocidad", 60);
				f5.addAtributo("Inteligencia", 100);
	FichaSimple f6 = new FichaSimple("Guas�n");
				f6.addAtributo("Altura", 1.85);
				f6.addAtributo("Peso", 72);
				f6.addAtributo("Fuerza", 300);
				f6.addAtributo("Peleas Ganadas", 3);
				f6.addAtributo("Velocidad", 60);
				f6.addAtributo("Inteligencia", 150);
				f6.addAtributo("Maldad", 100);
	FichaSimple f7 = new FichaSimple("Lex Luthor");
				f7.addAtributo("Altura", 1.88);
				f7.addAtributo("Peso", 95);
				f7.addAtributo("Fuerza", 1000);
				f7.addAtributo("Peleas Ganadas", 1);
				f7.addAtributo("Velocidad", 70);
				f7.addAtributo("Maldad", 75);
	FichaSimple f8 = new FichaSimple("Gat�bela");
				f8.addAtributo("Altura", 1.69);
				f8.addAtributo("Peso", 51);
				f8.addAtributo("Fuerza", 720);
				f8.addAtributo("Peleas Ganadas", 5);
				f8.addAtributo("Velocidad", 90);
				f8.addAtributo("Inteligencia", 150);
				f8.addAtributo("Maldad", 25);
				
//----------------------------------------------------------------------------//
//------------------------------- Inciso 2) ----------------------------------//
//----------------------------------------------------------------------------//
	FichaCompuesta fc1 = new FichaCompuesta("Duo dinamico");
			       fc1.addMiembro(f4); 	//Agrego a Batman
			       fc1.addMiembro(f5); 	//Agrego a Robin
			    
	FichaCompuesta fc2 = new FichaCompuesta("Liga de la Justicia");
				   fc2.addMiembro(f1);   //Agrego a Flash
				   fc2.addMiembro(f3);   //Agrego a Superman
				   fc2.addMiembro(fc1);  //Agrego a "Dúo dinámico"
					  
	FichaCompuesta fc3 = new FichaCompuesta("Liga de la Injusticia");
		    	   fc3.addMiembro(f2);   //Agrego a Capit�n Fr�o
		    	   fc3.addMiembro(f6);   //Agrego a Guas�n
		           fc3.addMiembro(f7);   //Agrego a Lex Luthor
		    	   fc3.addMiembro(f8);   //Agrego a Gat�bela

	Coleccion ColMarvelGr = new Coleccion("ColMarvelGr");
			  ColMarvelGr.addColeccion(fc1);   //Agrego "Dúo dinámico"
			  ColMarvelGr.addColeccion(fc2);   //Agrego "Liga de la Justicia"
			  ColMarvelGr.addColeccion(fc3);   //Agrego "Liga de la Injusticia"
			  
//----------------------------------------------------------------------------//
//------------------------------- Inciso 3) ----------------------------------//
//----------------------------------------------------------------------------//	
    ArrayList<String> atributos = new ArrayList<String>();
	atributos.add("Fuerza");
	atributos.add("Peleas Ganadas");
	atributos.add("Inteligencia");
	atributos.add("Maldad");
	ColMarvelGr.imprimir(atributos);
	
//----------------------------------------------------------------------------//
//------------------------------- Inciso 4) ----------------------------------//
//----------------------------------------------------------------------------//	
	Coleccion ColMarvel = new Coleccion("ColMarvel");
			  ColMarvel.addColeccion(f1);
			  ColMarvel.addColeccion(f2);
			  ColMarvel.addColeccion(f3);
			  ColMarvel.addColeccion(f4);
			  ColMarvel.addColeccion(f5);
			  ColMarvel.addColeccion(f6);
			  ColMarvel.addColeccion(f7);
			  ColMarvel.addColeccion(f8);
			  ColMarvel.addColeccion(fc1);   
			  ColMarvel.addColeccion(fc2);   
			  ColMarvel.addColeccion(fc3);
	
	ArrayList<FichaAbs> ColCompletaMarvel = new ArrayList<FichaAbs>();
/*-------------------------------------------------------------------------------------------------------------------*/
/*4.a)Listado de fichas/grupos con velocidad mayor a 100,ordenado por velocidad(descendentemente)*/
	
	FiltroMayor fm1 = new FiltroMayor(100, "Velocidad");
	System.out.println("\n"+"\"VELOCIDAD MAYOR A 100,ORDEN DESCENDENTE POR VELOCIDAD\""+"\n");
	Coleccion col1 = new Coleccion("4.a)");
	ColCompletaMarvel = ColMarvel.buscar(fm1);
	for(Object i: ColCompletaMarvel){
		col1.addColeccion((FichaAbs)i);
	}
	col1.ordenarDescendentemente(new CompararPorVelocidad());
	ArrayList<String> atVel = new ArrayList<String>();
	atVel.add("Velocidad");
	col1.imprimir(atVel);
/*-------------------------------------------------------------------------------------------------------------------*/
/*4.b)Listado de fichas/grupos con fuerza menor que 900, ordenado por fuerza (ascendentemente)*/
	
	FiltroMenor fm2 = new FiltroMenor(900, "Fuerza");
	System.out.println("\n"+"\"FUERZA MENOR A 900,ORDEN ASCENDENTE POR FUERZA\""+"\n");
	Coleccion col2 = new Coleccion("4.b)");
	ColCompletaMarvel = ColMarvel.buscar(fm2);
	for(Object i: ColCompletaMarvel){
		col2.addColeccion((FichaAbs)i);
	}
	col2.ordenarAscendentemente(new CompararPorFuerza());
	ArrayList<String> atFuerza = new ArrayList<String>();
	atFuerza.add("Fuerza");
	col2.imprimir(atFuerza);
/*-------------------------------------------------------------------------------------------------------------------*/
/*4.c)Listado de fichas/grupos con maldad mayor o igual a 50% e inteligencia mayor a 80, en cualquier orden*/

	FiltroMayor fm3 = new FiltroMayor(50,"Maldad");
	FiltroIgual fi = new FiltroIgual(50,"Maldad");
	FiltroOR fOR1 = new FiltroOR(fm3,fi);
	FiltroMayor fm4 = new FiltroMayor(80,"Inteligencia");
	FiltroAND fAND1 = new FiltroAND(fOR1,fm4);
	System.out.println("\n"+"\"MALDAD MAYOR O IGUAL A 50% E INTELIGENCIA MAYOR A 80,ORDEN ASCENDENTE POR MALDAD\""+"\n");
	Coleccion col3 = new Coleccion("4.c)");
	ColCompletaMarvel = ColMarvel.buscar(fAND1);
	for(Object i: ColCompletaMarvel){
		col3.addColeccion((FichaAbs)i);
	}
	col3.ordenarAscendentemente(new CompararPorMaldad());
	ArrayList<String> atMaleInt = new ArrayList<String>();
	atMaleInt.add("Maldad");
	atMaleInt.add("Inteligencia");
	col3.imprimir(atMaleInt);
/*---------------------------------------------------------------------------------------------------------------------*/
/*4.d)Listado de fichas/grupos con peso mayor a 70, ordenado por nombre(descendente)*/
	
	FiltroMayor fm5 = new FiltroMayor(70,"Peso");
	System.out.println("\n"+"\"PESO MAYOR A 70,ORDEN DESCENDENTE POR NOMBRE\""+"\n");
	Coleccion col4 = new Coleccion("4.d)");
	ColCompletaMarvel = ColMarvel.buscar(fm5);
	for(Object i: ColCompletaMarvel){
		col4.addColeccion((FichaAbs)i);
	}
	col4.ordenarDescendentemente(new CompararPorNombre());
	ArrayList<String> atPeso = new ArrayList<String>();
	atPeso.add("Peso");
	col4.imprimir(atPeso);
//----------------------------------------------------------------------------//
//------------------------------- Inciso 5) ----------------------------------//
//----------------------------------------------------------------------------//
	FichaSimple f9 = new FichaSimple("Chevrolet Cruze");
				f9.addAtributo("Velocidad", 220);
				f9.addAtributo("HP", 153);
				f9.addAtributo("Cilindros", 4);
				f9.addAtributo("RPM", 5000);
				f9.addAtributo("Aceleraci�n", 8.5);
				f9.addAtributo("Cm3", 1400);
				f9.addAtributo("Precio en USD", 12000);
	FichaSimple f10 = new FichaSimple("Chevrolet S10");
				f10.addAtributo("Velocidad", 200);
				f10.addAtributo("HP", 200);
				f10.addAtributo("Cilindros", 4);
				f10.addAtributo("RPM", 3600);
				f10.addAtributo("Aceleraci�n", 7.5);
				f10.addAtributo("Cm3", 2800);
				f10.addAtributo("Precio en USD", 31000);
	FichaSimple f11 = new FichaSimple("Chevrolet Camaro");
				f11.addAtributo("Velocidad", 380);
				f11.addAtributo("HP", 405);
				f11.addAtributo("Cilindros", 8);
				f11.addAtributo("RPM", 5900);
				f11.addAtributo("Aceleraci�n", 3);
				f11.addAtributo("Cm3", 6100);
	FichaSimple f12 = new FichaSimple("Ford Ka");
				f12.addAtributo("Velocidad", 180);
				f12.addAtributo("HP", 105);
				f12.addAtributo("Cilindros", 4);
				f12.addAtributo("RPM", 6000);
				f12.addAtributo("Aceleraci�n", 10);
				f12.addAtributo("Cm3", 1500);
				f12.addAtributo("Precio en USD", 12500);
	FichaSimple f13 = new FichaSimple("Ford Ranger");
				f13.addAtributo("Velocidad", 210);
				f13.addAtributo("HP", 166);
				f13.addAtributo("Cilindros", 4);
				f13.addAtributo("RPM", 5500);
				f13.addAtributo("Aceleraci�n", 8);
				f13.addAtributo("Cm3", 2500);
				f13.addAtributo("Precio en USD", 28000);
	FichaSimple f14 = new FichaSimple("Ford Mustang");
				f14.addAtributo("Velocidad", 450);
				f14.addAtributo("HP", 503);
				f14.addAtributo("Cilindros", 8);
				f14.addAtributo("RPM", 7000);
				f14.addAtributo("Aceleraci�n", 4);
				f14.addAtributo("Precio en USD", 95000);
	FichaSimple f15 = new FichaSimple("Honda Fit");
				f15.addAtributo("Velocidad", 230);
				f15.addAtributo("HP", 132);
				f15.addAtributo("Cilindros", 4);
				f15.addAtributo("RPM", 6600);
				f15.addAtributo("Aceleraci�n", 7.5);
				f15.addAtributo("Cm3", 1500);
				f15.addAtributo("Precio en USD", 24000);
	FichaSimple f16 = new FichaSimple("Honda Accord");
				f16.addAtributo("Velocidad", 320);
				f16.addAtributo("HP", 280);
				f16.addAtributo("Cilindros", 6);
				f16.addAtributo("RPM", 6600);
				f16.addAtributo("Aceleraci�n", 5);
				f16.addAtributo("Cm3", 3500);
				
//----------------------------------------------------------------------------//
//------------------------------- Inciso 6) ----------------------------------//
//----------------------------------------------------------------------------//
	FichaCompuesta fc4 = new FichaCompuesta("Japoneses");
				   fc4.addMiembro(f15);    //Agrego Honda Fit
				   fc4.addMiembro(f16);	   //Agrego Honda Accord
				   
	FichaCompuesta fc5 = new FichaCompuesta("Sedan");
				   fc5.addMiembro(f9);     //Agrego Chevrolet Cruze
				   fc5.addMiembro(f12);    //Agrego Ford Ka
				   fc5.addMiembro(fc4);    //Agrego "Japoneses"
				   
	FichaCompuesta fc6 = new FichaCompuesta("Carrera");
				   fc6.addMiembro(f11);    //Agrego Chevrolet Camaro
				   fc6.addMiembro(f14);    //Agrego Ford Mustang
				   
	FichaCompuesta fc7 = new FichaCompuesta("Camionetas");
				   fc7.addMiembro(f10);    //Agrego Chevrolet S10
				   fc7.addMiembro(f13);    //Agrego Ford Ranger
				   
	FichaCompuesta fc8 = new FichaCompuesta("Potencia");
				   fc8.addMiembro(fc7);    //Agrego "Camionetas"
				   fc8.addMiembro(fc6);    //Agrego "Carrera"
	
				   
	Coleccion ColAutosGr = new Coleccion("ColAutosGr");
	          ColAutosGr.addColeccion(fc4);
	          ColAutosGr.addColeccion(fc5);
	          ColAutosGr.addColeccion(fc6);
	          ColAutosGr.addColeccion(fc7);
	          ColAutosGr.addColeccion(fc8);
	
	ArrayList<String> atributosAutos = new ArrayList<String>();
	atributosAutos.add("Velocidad");
	atributosAutos.add("Aceleraci�n");
	atributosAutos.add("Precio en USD");
	ColAutosGr.imprimir(atributosAutos);
//----------------------------------------------------------------------------//
//------------------------------- Inciso 7) ----------------------------------//
//----------------------------------------------------------------------------//
	Coleccion ColAutos = new Coleccion("ColAutosClasicos");
	          ColAutos.addColeccion(f9);
	          ColAutos.addColeccion(f10);
	          ColAutos.addColeccion(f11);
	          ColAutos.addColeccion(f12);
	          ColAutos.addColeccion(f13);
	          ColAutos.addColeccion(f14);
	          ColAutos.addColeccion(f15);
	          ColAutos.addColeccion(f16);
	          ColAutos.addColeccion(fc4);
	          ColAutos.addColeccion(fc5);
	          ColAutos.addColeccion(fc6);
	          ColAutos.addColeccion(fc7);
	          ColAutos.addColeccion(fc8);
	          
	 ArrayList ColCompletaAutos = new ArrayList<>();
/*-------------------------------------------------------------------------------------------------------------------*/
/*7.a)Listado de fichas/grupos con velocidad mayor a 200, ordenado por velocidad (descendente).*/
	 
	 FiltroMayor fm6 = new FiltroMayor(200,"Velocidad");
	 System.out.println("\n"+"\"VELOCIDAD MAYOR A 200,ORDEN DESCENDENTE POR VELOCIDAD\""+"\n");
	 Coleccion col5 = new Coleccion("7.a)");
	 ColCompletaAutos = ColAutos.buscar(fm6);
	 for(Object i: ColCompletaAutos){
		 col5.addColeccion((FichaAbs)i);
	 }
	 col5.ordenarDescendentemente(new CompararPorVelocidad());
	 col5.imprimir(atVel);
		
/*-------------------------------------------------------------------------------------------------------------------*/
/*7.b)Listado de fichas/grupos con cilindrada menor que 2000, ordenado por cilindrada (ascendente)*/
		
		FiltroMenor fm7 = new FiltroMenor(2000,"Cm3");
		System.out.println("\n"+"\"CILINDRADA MENOR A 2000,ORDEN ASCENDENTE POR CILINDRADA(Cm3)\""+"\n");
		Coleccion col6 = new Coleccion("7.b)");
		ColCompletaAutos = ColAutos.buscar(fm7);
		for(Object i: ColCompletaAutos){
	    	 col6.addColeccion((FichaAbs)i);
		}
		col6.ordenarAscendentemente(new CompararPorCilindrada());
		ArrayList<String> atCil = new ArrayList<String>();
		atCil.add("Cm3");
		col6.imprimir(atCil);
/*-------------------------------------------------------------------------------------------------------------------*/
/*7.c)Listado de fichas/grupos con HP mayor a 150 y precio mayor a 15000 USD, en cualquier orden.*/
		
		FiltroMayor fm8 = new FiltroMayor(150,"HP");
		FiltroMayor fm9 = new FiltroMayor(15000,"Precio en USD");
		FiltroAND fAND2 = new FiltroAND(fm8,fm9);
		System.out.println("\n"+"\"HP MAYOR A 150 Y PRECIO EN USD MAYOR A 15000,ORDEN DESCENDENTE POR HP\""+"\n");
		Coleccion col7 = new Coleccion("7.c)");
		ColCompletaAutos = ColAutos.buscar(fAND2);
		for(Object i: ColCompletaAutos){
	    	 col7.addColeccion((FichaAbs)i);
		}
		col7.ordenarDescendentemente(new CompararPorHP());
		ArrayList<String> atHPyPr = new ArrayList<String>();
		atHPyPr.add("HP");
		atHPyPr.add("Precio en USD");
		col7.imprimir(atHPyPr);
}    
}