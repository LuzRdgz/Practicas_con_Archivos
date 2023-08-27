package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

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

            System.out.println("Renglon a =" + cantRenMA);
            System.out.println("Renglon b =" + cantRenMB);

            cantColMA = fileA.read();
            cantColMB = fileB.read();

            System.out.println("Columna a =" + cantColMA);
            System.out.println("columna b =" + cantColMB);

            fileA.close();
            fileB.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
