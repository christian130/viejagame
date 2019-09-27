/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Arrays;
import controlador.Lavieja;

/**
 *
 * @author Christian
 */


public class JavaApplication3 {
    
    public boolean revisarCuadricula(int abcisa,int ordenada){
		int[] arreglo={0,1,2};
		boolean jk=false;
		/*if (Arrays.asList(arreglo).contains(abcisa)){
			
		}*/
		for(int g=0;g<arreglo.length;g++){
			if (!(abcisa==arreglo[g])){
				jk=false;
			}
		}
		for(int g1=0;g1<arreglo.length;g1++){
			if (!(ordenada==arreglo[g1])){
				jk=false;
			}
		}
		for(int g1=0;g1<arreglo.length;g1++){
			if ((ordenada==arreglo[g1]) || (abcisa==arreglo[g1]) ){
				jk=true;
			}
		}
		return jk;
	}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lavieja lavieja = new Lavieja("nuevojuego");
        System.out.println(String.valueOf(!lavieja.revisarCuadricula(1, 1)));
        
    }
    
}
