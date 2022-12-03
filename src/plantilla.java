import java.io.File;
import java.io.FileNotFoundException;
import java.time.Year;
import java.util.*;


public class plantilla {
    public static void main(String[] args) throws FileNotFoundException {
        long startime = System.currentTimeMillis();

        Scanner entrada = new Scanner(new File("src/dia2/guiaEstrategia"));
        while (entrada.hasNextLine()) {
            String linea = entrada.nextLine();
            //String split[] = linea.split(" ");
        }







        long end = System.currentTimeMillis();
        System.out.println("tiempo " + (end - startime));
    }
}

