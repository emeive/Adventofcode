import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;

public class day_01_part2 {
    public static void main(String[] args) throws FileNotFoundException {

        Set<Integer> duendes = new TreeSet<Integer>();
        int suma = 0;
        int masCalorias = 0;

        Scanner entrada = new Scanner(new File("src/calorias"));
        while (entrada.hasNextLine()) {
            String linea = entrada.nextLine();
            if (linea.length() != 0) {
                int number = Integer.parseInt(linea);
                suma += number;
            } else {
                duendes.add(suma);
                suma = 0;
            }
        }
        int ultimo = ((TreeSet<Integer>) duendes).pollLast();
        System.out.println(ultimo);
        ultimo = ultimo + ((TreeSet<Integer>) duendes).pollLast();
        System.out.println(ultimo);
        ultimo = ultimo+  ((TreeSet<Integer>) duendes).pollLast();
        System.out.println(ultimo);

    }
}
