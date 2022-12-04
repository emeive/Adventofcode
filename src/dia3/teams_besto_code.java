package dia3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;


public class teams_besto_code {
    public static void llenarConjunto(String[] datos, TreeSet<String> mochila){
        Collections.addAll(mochila, datos);
    }

    public static String[] llenarMochila(Scanner entrada){
        String linea = entrada.nextLine();
        return linea.split("");
    }

    public static void main(String[] args) throws FileNotFoundException {
        long startime = System.currentTimeMillis();
        TreeSet<String> mochila1 = new TreeSet<>();
        TreeSet<String> mochila2 = new TreeSet<>();

        int i= 1, puntos = 0, caracter =0;

        Scanner entrada = new Scanner(new File("src/dia3/mochilas"));
        while (entrada.hasNextLine()) {
            llenarConjunto(llenarMochila(entrada), mochila1);
            llenarConjunto(llenarMochila(entrada), mochila2);
            mochila1.retainAll(mochila2);
            mochila2.clear();
            llenarConjunto(llenarMochila(entrada), mochila2);
            mochila1.retainAll(mochila2);
            caracter = mochila1.first().charAt(0);

            if (caracter < 91) puntos = puntos + (caracter - 38);
            else puntos = puntos + (caracter - 96);

            mochila1.clear();
            mochila2.clear();
        }
        System.out.println(puntos);
        long end = System.currentTimeMillis();
        System.out.println("tiempo " + (end - startime));
    }
}

