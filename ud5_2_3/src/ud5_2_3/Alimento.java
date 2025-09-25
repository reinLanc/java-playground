/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud5_2_3;

/**
 *
 * @author gilguerei
 */
public class Alimento {

	String denominacion;
	double lipidos;
	double hidratos;
	double proteinas;
	boolean esOrigenAnimal;
	char contenidoVita;
	char contenidoMine;

    Alimento(String nombre) {
        denominacion = nombre;
    }


	Alimento(String nombre, double lp, boolean esOA,
		double hi, double pro, char v, char m){
		denominacion = nombre;
		lipidos=lp;
		hidratos=hi;
		proteinas=pro;
		esOrigenAnimal=esOA;
		contenidoVita=v;
		contenidoMine=m;	
	}


    boolean esDietetico() {
        return lipidos < 20 && contenidoVita != 'B';
    }

   String muestraAlimento() {
        		return "Nombre: "+denominacion+
			"\nAnálisis: \n\tLípidos: "+lipidos+
			"\n\tHidratos de carbono: "+hidratos+
			"\n\tProteínas: "+proteinas+
			"\nContenido en vitaminas: "+ (contenidoVita == 'A'?
			"alto" :contenidoVita == 'M'? "medio" : "bajo")+ 
			"\nContenido en minerales: "+ (contenidoMine == 'A'?
			"alto\n" :contenidoMine == 'M'? "medio\n" : "bajo\n")+
			(esOrigenAnimal? "Es de origen animal\n" :
			"No es de origen animal\n")+
			(esDietetico()? "Es dietético\n":"No es dietético\n")+
			(esRecomendableParaDeportistas()? "Es ":"No es ")+
			"recomendable para deportistas";
    }
   boolean esRecomendableParaDeportistas() {
       return lipidos >= 30 && lipidos <= 35 && proteinas >= 10 && proteinas <= 15 && hidratos >= 55 && hidratos <= 65;
   }
   	double calculaContenidoEnergetico(){
		return lipidos/100*9.4+ hidratos/100*4.1+ proteinas/100*5.3;
	}
}
