package dia1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class dia1_2 {
    public static void main(String[] args) throws FileNotFoundException {

        TreeSet<Integer> duendes = new TreeSet<Integer>();
        int suma = 0;
        int masCalorias = 0;

        Scanner entrada = new Scanner(new File("src/Dia_01/calorias"));
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

        /*for (int i = 0; i < 3; i++) {
            masCalorias = masCalorias + duendes.pollLast();
        }*/
        while (!duendes.isEmpty()){
            System.out.println(duendes.pollLast());
        }
    }
}
