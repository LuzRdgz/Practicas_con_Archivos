package org.example;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Contar_Caracteres {

    public static void main(String[] args) {

        final String archivo = "C:\\Users\\LuzRd\\Desktop\\divina_comedia_sp.txt";
        Scanner scan;
        String palabra;
        int longitud;
        int [] histograma = new int[9];

        try {
            scan = new Scanner(new File(archivo));

            while (scan.hasNext()) {
                palabra = scan.next();

                for (int i = 0; i < palabra.length(); i++) {
                    longitud = palabra.length();
                    if (!Character.isDigit(i)) {
                        if (longitud >= 2 && longitud <= 10) {
                            switch (longitud) {
                                case 2 -> histograma[0]++;
                                case 3 -> histograma[1]++;
                                case 4 -> histograma[2]++;
                                case 5 -> histograma[3]++;
                                case 6 -> histograma[4]++;
                                case 7 -> histograma[5]++;
                                case 8 -> histograma[6]++;
                                case 9 -> histograma[7]++;
                                case 10 -> histograma[8]++;
                                default -> {
                                }
                            }
                        }
                    }
                }
            }
           scan.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("HISTOGRAMA");
        for (int i = 0; i<histograma.length; i++){
            System.out.println("Palabras con " + (i+2) + " caracteres = " + histograma[i] + " palabras.");
        }
    }
}



