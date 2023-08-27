package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class Contar_Caracteres {

    public static void main(String[] args) {

        final String archivo = "C:\\Users\\LuzRd\\Desktop\\divina_comedia_sp.txt";
        Scanner scan;
        String palabra;
        int longitud;
        int histograma[] = new int[9]; // para los contadores

        try {
            scan = new Scanner(new File(archivo));

            while (scan.hasNext()){
                palabra = scan.next();

                for (int i = 0; i<palabra.length(); i++) {
                        longitud = palabra.length();
                        if (!Character.isDigit(i)){
                            if (longitud >= 2 && longitud <= 10){
                                switch (longitud){
                                    case 2: histograma[0] ++;
                                        break;
                                    case 3: histograma[1] ++;
                                        break;
                                    case 4: histograma[2] ++;
                                        break;
                                    case 5: histograma[3] ++;
                                        break;
                                    case 6: histograma[4] ++;
                                        break;
                                    case 7: histograma[5] ++;
                                        break;
                                    case 8: histograma[6] ++;
                                        break;
                                    case 9: histograma[7] ++;
                                        break;
                                    case 10: histograma[8] ++;
                                        break;
                                    default:
                                        // System.out.println("ES MENOR A DOS CARACTERES. ES MAYOR A 10 CARACTERES. ES UN NUMERO.");
                                }
                            }
                        }

                }
                }
            } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("HISTOGRAMA");
        for (int i = 0; i<histograma.length; i++){
            System.out.println("Palabras con " + (i+2) + " caracteres = " + histograma[i] + " veces.");
        }
    }
}



