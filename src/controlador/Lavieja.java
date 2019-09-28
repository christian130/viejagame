/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Lavieja {

    public final int JUGADOR_A = 1;
    public final int JUGADOR_B = 2;
    private String[] lagunavieja = {"laguna vieja"};

    private int[][] Board = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    // private int Board05=this.Board[0][1];
    public static int[][][] columnas = {{{0, 0}, {1, 0}, {2, 0}},
    {{0, 1}, {1, 1}, {2, 1}}, {{0, 2}, {1, 2}, {2, 2}},
    {{0, 0}, {0, 1}, {0, 2}}, {{1, 0}, {1, 1}, {1, 2}},
    {{2, 0}, {2, 1}, {2, 2}}, {{0, 0}, {1, 1}, {2, 2}},
    {{2, 0}, {1, 1}, {0, 2}}

    };

    // private static Object[] columnas={Object[]{int[]{0,0}}};
    public Lavieja(String value) {
        value = null;
        if (!(value == null)) {
            //if ( !$this->importBoard( $saved ) ) throw new Exception('No se puede restaurar el juego.');
        }

    }

    public String __toString() {
        return null;

    }
    //////////////////////////////////////////////////////////////////////// 

    /* Salida: (boolean)
     *  Creado por : Christian Vivas Santiago christian130@gmail.com
     * Fecha Creación: 05-07-2018
     * Fecha Modificacion: 06-09-2019
     * Descripcion: Creacion del metodo hecho en PHP --- Traduccion del mismo. Metodo creado para hacer un check a la pizarra... basicamente es un intento de mi parte para extenderlo    *
     * Modificaciones:  se minimiza el codigo, para una posible futura implementacion. Se cambia el nombre del metodo   * 
     */
    public boolean RevisarTablero(int[][] board) {
        if (board != null) {
            board = this.Board;
        }
        int[] tablero = {0, 1, 2};
        if (board.length != 3) {
            return false;
        }
        for (int x = 0; x < board.length; x++) {
            if (board.length != 3) {
                return false;
            }
            for (int[] is : board) {
                if (Arrays.asList(tablero).contains(is)) {
                    return false;
                }
            }
        }
        return true;
    }
    ////////////////////////////////////////////////////////////////////////

    /* Salida: (boolean)
     *  Creado por : Christian Vivas Santiago christian130@gmail.com
     * Fecha Creación: 05-07-2018
	 * Fecha Modificacion: 06-09-2019
     * Descripcion: recorre el arreglo definido arreglo y revisa si contiene trazas de    *
     * Modificaciones:  se utiliza la estructura Arrays.asList() para convertir el arreglo a una lista List<int> lista = new ArrayList<int>
     */
    public boolean revisarCuadricula(int abcisa, int ordenada) {
        List<Integer> listaArreglo = new ArrayList<Integer>();
        listaArreglo.add(0);
        listaArreglo.add(1);
        listaArreglo.add(2);
        boolean jk = false;
        if (!(listaArreglo.contains(abcisa)) || !(listaArreglo.contains(ordenada))) {
            jk = false;
        } else {
            jk = true;
        }
        return jk;
    }

    ////////////////////////////////////////////////////////////////////////
    /* Salida: (boolean)
     *  Creado por : Christian Vivas Santiago christian130@gmail.com
     * Fecha Creación: 05-07-2018
	 * Fecha Modificacion: 06-09-2019
     * Descripcion: recorre el arreglo previamente convertido en una lista para verificar que el JUGADOR_A el JUGADOR_B esta permitido     *
     * Modificaciones: 
     */
    public boolean revisarJugador(int jugador) {
        int[] jugadores = {JUGADOR_A, JUGADOR_B};
        if (Arrays.asList(jugadores).contains(jugador)) {
            return false;
        } else {
            return true;
        }
    }

    //////////////////////////////////////////////////////////////////////// 
    /* Salida: (boolean)
     *  Creado por : Christian Vivas Santiago christian130@gmail.com
     * Fecha Creación: 05-07-2018
	 * Fecha Modificacion: 06-09-2019
     * Descripcion:    *
     * Modificaciones: RevisarTablero(int[][] board) * 
     */
    public boolean importarTablero(int[][] board) {
        if (board.length != 3) {
            return false;
        }
        if (this.RevisarTablero(board)) {
            this.Board = board;
            return true;
        } else {
            return false;
        }
    }

    //////////////////////////////////////////////////////////////////////// 
    /* Salida: (boolean)
     *  Creado por : Christian Vivas Santiago christian130@gmail.com
     * Fecha Creación: 05-07-2018
	 * Fecha Modificacion: 06-09-2019
     * Descripcion:    *
     * Modificaciones: RevisarTablero(int[][] board) * 
     */
    public int[][] exportarTablero() {
        return this.Board;
    }

    //////////////////////////////////////////////////////////////////////// 
    /* Salida: (boolean)
     *  Creado por : Christian Vivas Santiago christian130@gmail.com
     * Fecha Creación: 05-07-2018	
	 * Fecha Modificacion: 10-07-2018 
     * Descripcion: favor remitirse en la seccion adicional de la explicacion de esta clase en la parte superior de la misma   *
     * Modificaciones:   * 
     */
    public boolean estaDisponible(int positionX, int positionY) {
        if (!this.revisarCuadricula(positionX, positionY)) {
            return false;

        } else {
           // List<Integer> lista = new ArrayList<Integer>(); 
            //lista.add(this.Board[positionX][positionY]);
            

            if (this.Board[positionX][positionY]==0) {
                return true;
            } else {
                return false;
            }
        }

    }
    //////////////////////////////////////////////////////////////////////// 

    /* Salida: (boolean)
     *  Creado por : Christian Vivas Santiago christian130@gmail.com
     * Fecha Creación: 05-07-2018	
	 * Fecha Modificacion: 10-07-2018 
     * Descripcion: favor remitirse en la seccion adicional de la explicacion de esta clase en la parte superior de la misma   *
     * Modificaciones:   * 
     */
    public int obtenerGanador() {
        for (int[][] columna : columnas) {
            int cpa = 0, cpb = 0;
            for (int[] columna02 : columna) {
                int cuadricula;
                cuadricula = this.Board[columna02[0]][columna02[1]];
                if (cuadricula == this.JUGADOR_A) {
                    cpa++;
                } else if (cuadricula == this.JUGADOR_B) {
                    cpb++;
                }

            }
            if (cpa == 3) {
                return this.JUGADOR_A;
            } else if (cpb == 3) {
                return this.JUGADOR_B;
            }
        }
        return 0;
    }

    //////////////////////////////////////////////////////////////////////// 
    /* Salida: (boolean)
     *  Creado por : Christian Vivas Santiago christian130@gmail.com
     * Fecha Creación: 05-07-2018	
	 * Fecha Modificacion: 10-07-2018 
     * Descripcion: favor remitirse en la seccion adicional de la explicacion de esta clase en la parte superior de la misma   *
     * Modificaciones:   * 
     */
    public int obtenerCuadricula(int positionx, int positiony) {

        /*int valor=this.Board[positionx][positiony];
         if (valor!=null){
             return valor;
         }*/
        return this.Board[positionx][positiony];
    }
    //////////////////////////////////////////////////////////////////////// 

    /* Salida: (boolean)
     *  Creado por : Christian Vivas Santiago christian130@gmail.com
     * Fecha Creación: 05-07-2018	
	 * Fecha Modificacion: 10-07-2018 
     * Descripcion: favor remitirse en la seccion adicional de la explicacion de esta clase en la parte superior de la misma   *
     * Modificaciones:   * 
     */
    public boolean seAcabo() {
        if (!(this.obtenerGanador() == 0)) {
            return true;
        }
        int ctaken = 0;
        for (int[] forzar : this.Board) {
            for (int forzar02 : forzar) {
                if (forzar02 == 1) {
                    ctaken++;
                }
            }
        }
        if (ctaken == 9) {
            return true;
        } else {
            return false;
        }

    }

    //////////////////////////////////////////////////////////////////////// 
    /* Salida: (boolean)
     *  Creado por : Christian Vivas Santiago christian130@gmail.com
     * Fecha Creación: 05-07-2018	
	 * Fecha Modificacion: 10-07-2018 
     * Descripcion: favor remitirse en la seccion adicional de la explicacion de esta clase en la parte superior de la misma   *
     * Modificaciones:   * 
     */
    public int calificaMovimientos(int Jugador, int positionx, int positiony) {
        if (!this.estaDisponible(positionx, positiony)) {
            return -1;
        } else if (!this.revisarJugador(Jugador)) {
            return -1;
        }
        int total = 0;
        aa:
        for (int mmgvo = 0; mmgvo < columnas.length; mmgvo++) {
            int[] buscar = {positionx, positiony};
            //List<Integer[][]> buscar= Arrays.asList({{positionx, positiony}});
            //List<int[][][]> columnasList = new ArrayList<int[][][]>();
            //columnasList.add(columnas);
            bb:
            for (int v=0;v<columnas[mmgvo].length;v++){
                        int[] name = columnas[mmgvo][v];
                        System.out.println(String.valueOf(buscar[0]==name[0] && buscar[1]==name[1]));
                        List<int[]> naming= new ArrayList<int[]>();
                        naming.add(name);
                        if (!(name==buscar)){
                            continue aa;
                        }
                        /*if (!(naming.contains(buscar))){
                            naming.clear();
                              continue aa;
                              //continue bb;
                        } */
            }
            //columnasList.get(mmgvo).contains(buscar);
            //Arrays.asList(columnas[mmgvo]);
            /*if (!(Arrays.asList(columnas[mmgvo]).contains(buscar))) {
                continue;
            }*/
            int cop = 0, cme = 0;
            for (int[] fuerza : columnas[mmgvo]) {
                int tilex = fuerza[0];
                int tiley = fuerza[1];
                int cuadricula = this.Board[tilex][tiley];
                if (cuadricula == Jugador) {
                    cme++;
                } else if (cuadricula > 0 && cuadricula != Jugador) {
                    cop++;
                }
            }
            if ((cme == 2) && (cop == 0)) {
                total += 10;
                break;
            }
            if ((cme == 1) && (cop == 0)) {
                total += 2;
                break;
            }
            if (!(cme > 0) && !(cop > 0) && (cop == 0) && (cme == 0)) {
                total += 1;
                break;
            }

        }

        return total;
    }

    //////////////////////////////////////////////////////////////////////// 
    /* Salida: (boolean)
     *  Creado por : Christian Vivas Santiago christian130@gmail.com
     * Fecha Creación: 05-07-2018	
	 * Fecha Modificacion: 10-07-2018 
     * Descripcion: favor remitirse en la seccion adicional de la explicacion de esta clase en la parte superior de la misma   *
     * Modificaciones:   * 
     */
    public int getOpponent(int Jugador) {
        if (!this.revisarJugador(Jugador)) {
            return 0;
        } else {
            if (Jugador == this.JUGADOR_A) {
                return this.JUGADOR_B;
            } else {
                return this.JUGADOR_A;
            }
        }

    }
//////////////////////////////////////////////////////////////////////// 

    /* Salida: (boolean)
     *  Creado por : Christian Vivas Santiago christian130@gmail.com
     * Fecha Creación: 05-07-2018	
	 * Fecha Modificacion: 10-07-2018 
     * Descripcion: favor remitirse en la seccion adicional de la explicacion de esta clase en la parte superior de la misma   *
     * Modificaciones:   si precisa de una explicacion de la misma favor enviar correo a christian130@gmail.com * 
     */
    /**
     *
     * @param Jugador
     * @param stopoponent
     * @param bestrating
     * @return
     */
    public int[] getBestMove(int Jugador, boolean stopoponent, bestRatingClass bestrating) {
        int[] obestpost = null;

        if (!this.revisarJugador(Jugador)) {
            return null;
        } else if (this.seAcabo()) {
            return null;
        }
        if (stopoponent) {
            //bestrating.setBestRating(0);
            obestpost = this.getBestMove(this.getOpponent(Jugador), false, bestrating);
        }

        List<int[]> arrayBest;
        arrayBest = new ArrayList<>();
        arrayBest.clear();
        int rating = 0;
        bestrating.setBestRating(0);
        for (int b = 0; b < this.Board.length; b++) {
            for (int c = 0; c < this.Board[b].length; c++) {
                rating = this.calificaMovimientos(Jugador, b, c);
                if (rating != -1) {
                    if (rating > bestrating.getBestRating()) {
                        int[] alcaraban = {b, c};
                        arrayBest.add(alcaraban);
                        System.out.println("entre al rating mejor"+alcaraban[0]);
                        //arrayBest[][]={{b,c}};
                        bestrating.setBestRating(rating);
                    } else if (rating == bestrating.getBestRating()) {
                        int[] alcaraban = {b, c};
                        arrayBest.add(alcaraban);
                    }
                }
            }
        }
        if ((stopoponent) && (bestrating.getBestRating() >= 10) ) {
            // Random randomGenerator = new Random();
            // int randNumber = randomGenerator.nextInt(arrayBest.size());
            //int[] obestpost = arrayBest.get(randNumber);

            return obestpost;
        } else {
            if (arrayBest.size() > 0) {
                Random randomGenerator = new Random();
                int randNumber = randomGenerator.nextInt(arrayBest.size());
                return arrayBest.get(arrayBest.size()-1);
            } else {
                return null;
            }
        }

    }

    //////////////////////////////////////////////////////////////////////// 
    /* Salida: (boolean)
     *  Creado por : Christian Vivas Santiago christian130@gmail.com
     * Fecha Creación: 05-07-2018	
	 * Fecha Modificacion: 10-07-2018 
     * Descripcion: favor remitirse en la seccion adicional de la explicacion de esta clase en la parte superior de la misma   *
     * Modificaciones:   si precisa de una explicacion de la misma favor enviar correo a christian130@gmail.com * 
     */
    public boolean jugar(int Jugador, int positionX, int positionY) {
        if (!this.revisarJugador(Jugador)) {
            return false;
        } else if (!this.estaDisponible(positionX, positionY)) {
            return false;
        } else if (this.seAcabo()) {
            return false;
        }
        this.Board[positionX][positionY] = Jugador;
        return true;
    }

    public class bestRatingClass {

        private int bestRating;

        public void setBestRating(int bestRating) {
            this.bestRating = bestRating;
        }

        public int getBestRating() {
            return bestRating;
        }
    }
    /*public static void main(String[] args)
	{
		System.out.println(String.valueOf(columnas[0][1][0]));
	}*/
}
