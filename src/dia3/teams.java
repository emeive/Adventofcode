package dia3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class teams {
    public static void llenarConjunto(String[] datos, TreeSet<String> mochila){
        Collections.addAll(mochila, datos);
    }
    public static void main(String[] args) throws FileNotFoundException {
        long startime = System.currentTimeMillis();

        TreeSet<String> mochila1 = new TreeSet<>();
        TreeSet<String> mochila2 = new TreeSet<>();
        TreeSet<String> mochila3 = new TreeSet<>();
        int i= 1, puntos = 0, caracter =0;

        Scanner entrada = new Scanner(new File("src/dia3/mochilas"));
        while (entrada.hasNextLine()) {
            System.out.println("i = " + i);
            String linea = entrada.nextLine();
            String[] artilujios = linea.split("");

            if (i <= 3){
                if (i == 1) llenarConjunto(artilujios, mochila1);
                if (i == 2) llenarConjunto(artilujios, mochila2);
                if (i==3 ) {
                    llenarConjunto(artilujios, mochila3);

                    System.out.println("entro");
                    mochila1.retainAll(mochila2);
                    mochila1.retainAll(mochila3);
                    System.out.println("caracter comun " + mochila1.first());
                    caracter = mochila1.first().charAt(0);
                    System.out.println(caracter);
                    if (caracter < 91) puntos = puntos + (caracter - 38);
                    else puntos = puntos + (caracter - 96);

                    mochila1.clear();
                    mochila2.clear();
                    mochila3.clear();
                    i = 0;
                    }
                    i++;
                }

        }
        System.out.println(puntos);
        long end = System.currentTimeMillis();
        System.out.println("tiempo " + (end - startime));
    }
}

