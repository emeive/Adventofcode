package dia4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class superpuestosBestocode {

    public static void main(String[] args) throws FileNotFoundException {
        long startime = System.currentTimeMillis();

        int superpuesto = 0;
        TreeSet<Integer> zonaElfo1 = new TreeSet<>();
        TreeSet<Integer> zonaElfo2 = new TreeSet<>();

        Scanner entrada = new Scanner(new File("src/dia4/camp"));
        while (entrada.hasNextLine()) {
            String linea = entrada.nextLine();
            String v[] = linea.split("[,-]");

            int cero = Integer.parseInt(v[0]);
            int uno = Integer.parseInt(v[1]);
            int dos = Integer.parseInt(v[2]);
            int tres = Integer.parseInt(v[3]);


            if ( (cero == dos && uno == tres)        ){

            }


        }
        System.out.println("Supuer: " + superpuesto);
        long end = System.currentTimeMillis();
        System.out.println("tiempo " + (end - startime));
    }
}
//<Integer>
