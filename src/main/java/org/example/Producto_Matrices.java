package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Producto_Matrices {

    static final String matrizA = "C:\\Users\\LuzRd\\Desktop\\a.mat";
    static final String matrizB = "C:\\Users\\LuzRd\\Desktop\\b.mat";
    static int cantRenMA, cantRenMB, cantColMA, cantColMB;

    public static void main(String[] args) {

        try {
            FileInputStream fileA = new FileInputStream(matrizA);
            FileInputStream fileB = new FileInputStream(matrizB);

            cantRenMA = fileA.read();
            cantRenMB = fileB.read();

            /*System.out.println("Renglon a =" + cantRenMA);
            System.out.println("Renglon b =" + cantRenMB);*/

            cantColMA = fileA.read();
            cantColMB = fileB.read();

            int[][] matA = new int[cantRenMA][cantColMA];
            int[][] matB = new int[cantRenMB][cantColMB];
            int[][] matC = new int[cantRenMA][cantColMB];

           /* System.out.println("Columna a =" + cantColMA);
            System.out.println("columna b =" + cantColMB);*/

            for (int i = 0; i< matA.length; i++){
                for (int j = 0; j< matA.length; j++){
                    matA[i][j] = fileA.read();
                }
            }
            for (int i = 0; i< matB.length; i++){
                for (int j = 0; j< matB.length; j++){
                    matB[i][j] = fileB.read();
                }
            }
            fileA.close();
            fileB.close();

            if (cantColMA == cantRenMB){
                for (int i = 0; i< matA.length; i++){
                    for (int j =0; j< matB[0].length; j++){
                        for (int k = 0; k < matA[0].length; k++){
                            matC[i][j] = (matA[i][k]) * (matB[k][j]);
                        }
                    }
                }
            }

            for (int[] ints : matC) {
                for (int m = 0; m < matC.length; m++) {
                    System.out.print(ints[m]);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
