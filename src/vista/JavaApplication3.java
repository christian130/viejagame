/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Arrays;
import controlador.Lavieja;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Christian
 */
public class JavaApplication3 {

    public boolean revisarCuadricula(int abcisa, int ordenada) {
        int[] arreglo = {0, 1, 2};
        boolean jk = false;
        /*if (Arrays.asList(arreglo).contains(abcisa)){
			
		}*/
        for (int g = 0; g < arreglo.length; g++) {
            if (!(abcisa == arreglo[g])) {
                jk = false;
            }
        }
        for (int g1 = 0; g1 < arreglo.length; g1++) {
            if (!(ordenada == arreglo[g1])) {
                jk = false;
            }
        }
        for (int g1 = 0; g1 < arreglo.length; g1++) {
            if ((ordenada == arreglo[g1]) || (abcisa == arreglo[g1])) {
                jk = true;
            }
        }
        return jk;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       // Random randomGenerator = new Random();
       // int randNumber = randomGenerator.nextInt(0);
        //System.out.println(String.valueOf(randNumber));
       // System.exit(0);
        Lavieja lavieja = new Lavieja("nuevojuego");

        //lavieja.jugar(0, 0, 0)
        //System.out.println(String.valueOf(!lavieja.revisarCuadricula(1, 1)));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String jugadaX = br.readLine();
        String jugadaY = br.readLine();
        lavieja.jugar(lavieja.JUGADOR_A, Integer.valueOf(jugadaX), Integer.valueOf(jugadaY));
        List<int[]> resultado = new ArrayList<int[]>();
        int counter = 0;
        System.err.println(String.valueOf(lavieja.getBestMove(lavieja.JUGADOR_B, false, 0)[0]));
        System.err.println(String.valueOf(lavieja.getBestMove(lavieja.JUGADOR_B, false, 0)[1]));
        /* while (!lavieja.seAcabo()) {
            resultado.add(lavieja.getBestMove(lavieja.JUGADOR_B, false, 0));            
            
            lavieja.jugar(lavieja.JUGADOR_B, resultado.get(counter)[0], resultado.get(counter)[1]);
            String jugadaX2 = br.readLine();
            String jugadaY2 = br.readLine();
            lavieja.jugar(lavieja.JUGADOR_A, Integer.valueOf(jugadaX2), Integer.valueOf(jugadaY2));
            System.out.println("aun no se ha acabado la maquina va por"+resultado.get(counter)[0]+resultado.get(counter)[1]); 
            counter++;
        }*/

    }

}
