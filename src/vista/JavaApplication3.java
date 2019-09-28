/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Arrays;
import controlador.Lavieja;
import controlador.Lavieja.bestRatingClass;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public void jugar(Lavieja lavieja, Lavieja.bestRatingClass bestrating) throws IOException, NullPointerException {
        // Random randomGenerator = new Random();
        // int randNumber = randomGenerator.nextInt(0);
        //System.out.println(String.valueOf(randNumber));
        // System.exit(0);

        //lavieja.jugar(0, 0, 0)
        //System.out.println(String.valueOf(!lavieja.revisarCuadricula(1, 1)));
        if (!(lavieja.seAcabo())) {

        }
        /* if (lavieja.seAcabo()) {
            System.err.println("----------se acabo-----");
        }else{
            jugar(lavieja, bestrating);
        }*/
    }

    public static void main(String[] args) throws IOException {
        Lavieja lavieja = new Lavieja("nuevojuego");
        Lavieja.bestRatingClass bestrating = lavieja.new bestRatingClass();
        JavaApplication3 application3 = new JavaApplication3();

        while (!lavieja.seAcabo()) {

            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                String jugadaX = br.readLine();
                String jugadaY = br.readLine();
                lavieja.jugar(lavieja.JUGADOR_A, Integer.valueOf(jugadaX), Integer.valueOf(jugadaY));
                List<int[]> resultado = new ArrayList<int[]>();
                int counter = 0;

                int[] resultados = lavieja.getBestMove(lavieja.JUGADOR_B, true, bestrating);
                System.out.println("longitud de los resultados" + resultados.length);
                System.err.println("comienzo a jugar por" + String.valueOf(resultados[0]) + String.valueOf(resultados[1]));

                //System.err.println(String.valueOf(lavieja.getBestMove(lavieja.JUGADOR_B, true, bestrating)[1]));
                lavieja.jugar(lavieja.JUGADOR_B, Integer.valueOf(resultados[0]), Integer.valueOf(resultados[1]));
            } catch (IOException iOException) {
                System.err.println("----------se acabo-----");
                break;
            } catch (NullPointerException nullPointerException) {
                System.err.println("----------se acabo-----");
                break;
            }

        }

        //String jugadaX2 = br.readLine();
        //String jugadaY2 = br.readLine();

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
