/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lavieja {
	public final int JUGADOR_A = 1;
	public final int JUGADOR_B = 2;
	private String[] lagunavieja = { "laguna vieja" };

	private int[][] Board = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
	public static int[][][] columnas = { { { 0, 0 }, { 1, 0 }, { 2, 0 } },
			{ { 0, 1 }, { 1, 1 }, { 2, 1 } }, { { 0, 2 }, { 1, 2 }, { 2, 2 } },
			{ { 0, 0 }, { 0, 1 }, { 0, 2 } }, { { 1, 0 }, { 1, 1 }, { 1, 2 } },
			{ { 2, 0 }, { 2, 1 }, { 2, 2 } }, { { 0, 0 }, { 1, 1 }, { 2, 2 } },
			{ { 2, 0 }, { 1, 1 }, { 0, 2 } }

	};

	// private static Object[] columnas={Object[]{int[]{0,0}}};
	public Lavieja(String value) {
		value=null;
		if (!(value==null)){
			//if ( !$this->importBoard( $saved ) ) throw new Exception('No se puede restaurar el juego.');
		}

	}
	public String __toString(){
		return null;
		
	}
	 //////////////////////////////////////////////////////////////////////// 
    /* Salida: (boolean)
     *  Creado por : Christian Vivas Santiago christian130@gmail.com
     * Fecha Creación: 02-09-2019
     * Fecha Modificacion:
     * Descripcion: Creacion del metodo hecho en PHP --- Traduccion del mismo. Metodo creado para hacer un check a la pizarra... basicamente es un intento de mi parte para extenderlo    *
     * Modificaciones:  se minimiza el codigo, para una posible futura implementacion   * 
     */
	public boolean CheckBoard(int[][] board){
		if (board!=null){
			board=this.Board;
		}
		if (board.length!=3){
			return false;
		}
		for (int x=0;x<board.length;x++){
			if (board.length!=3){return false;}
			for (int[] is : board) {
				//if (){}
				
			}
			
		}
		/*for (int[] ff : board) {
			
		}*/
		
		return false;
	}
////////////////////////////////////////////////////////////////////////
    /* Salida: (boolean)
     *  Creado por : Christian Vivas Santiago christian130@gmail.com
     * Fecha Creación: 06-09-2019
	 * Fecha Modificacion: 06-09-2019
     * Descripcion:    *
     * Modificaciones:   * 
     */
	public boolean revisarCuadricula(int abcisa,int ordenada){
		int[] arreglo={0,1,2};
		boolean jk=false;
		if (!(Arrays.asList(arreglo).contains(abcisa)) || !(Arrays.asList(arreglo).contains(ordenada)) ){
			jk=false;
		}else{
                    jk=true;
                }
		/*for(int g=0;g<arreglo.length;g++){
			if ((!(abcisa==arreglo[g])) || (!(ordenada==arreglo[g])) ){
				jk=false;
			}
		}
		for(int g2=0;g2<arreglo.length;g2++){
			if ((ordenada==arreglo[g2]) || (abcisa==arreglo[g2]) ){
				jk=true;
			}
		}*/
		return jk;
	}
	
	
	/*public static void main(String[] args)
	{
		System.out.println(String.valueOf(columnas[0][1][0]));
	}*/

}
