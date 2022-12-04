package dia4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class campamento {
    public static void main(String[] args) throws FileNotFoundException {
        long startime = System.currentTimeMillis();
        int contenido = 0;

        Scanner entrada = new Scanner(new File("src/dia4/camp"));
        while (entrada.hasNextLine()) {
            String linea = entrada.nextLine();
            String[] v = linea.split("[,-]");

            if ((Integer.parseInt(v[0]) <= Integer.parseInt(v[2]) && Integer.parseInt(v[1]) >= Integer.parseInt(v[3]))
                    || (Integer.parseInt(v[2]) <= Integer.parseInt(v[0]) && Integer.parseInt(v[3]) >= Integer.parseInt(v[1]))) {
                contenido++;
            }
        }
        System.out.println(contenido);
        long end = System.currentTimeMillis();
        System.out.println("tiempo " + (end - startime));
    }
}

