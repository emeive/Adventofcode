package dia3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class mochilas {

    public static void main(String[] args) throws FileNotFoundException {
        int puntos = 0;
        int caracter = 0;
        Scanner entrada = new Scanner(new File("src/dia3/mochilas"));
        while (entrada.hasNextLine()) {
            String linea = entrada.nextLine();
            String[] mochilas = linea.split("");
            TreeSet<String> parteA = new TreeSet<>();
            TreeSet<String> parteB = new TreeSet<>();

            for (int i = 0; i < mochilas.length ; i++) {
                if (i < mochilas.length/2) parteA.add(mochilas[i]);
                else parteB.add(mochilas[i]);
            }
            parteA.retainAll(parteB);
            caracter = parteA.last().charAt(0);
            if (caracter < 91 ) puntos = puntos + (caracter-38)  ;
            else puntos = puntos + (caracter-96);

        }
        System.out.println(puntos);
    }
}
