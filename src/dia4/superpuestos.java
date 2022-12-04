package dia4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class superpuestos {
    public static void creaVector(String[] v,TreeSet<Integer> zona1, TreeSet<Integer> zona2){
        int inicio,fin;
        inicio = Integer.parseInt(v[0]);
        fin = Integer.parseInt(v[1]);
        for (int i = inicio; i <= fin ; i++) {
            zona1.add(i);
        }
        inicio = Integer.parseInt(v[2]);
        fin = Integer.parseInt(v[3]);
        for (int i = inicio; i <= fin ; i++) {
            zona2.add(i);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        long startime = System.currentTimeMillis();

        int superpuesto = 0;
        TreeSet<Integer> zonaElfo1 = new TreeSet<>();
        TreeSet<Integer> zonaElfo2 = new TreeSet<>();

        Scanner entrada = new Scanner(new File("src/dia4/camp"));
        while (entrada.hasNextLine()) {
            String linea = entrada.nextLine();
            String v[] = linea.split("[,-]");
            creaVector(v, zonaElfo1, zonaElfo2);
            zonaElfo1.retainAll(zonaElfo2);
            if (zonaElfo1.size() > 0 ){
                superpuesto++;
                }
            zonaElfo1.clear();
            zonaElfo2.clear();
            }
        System.out.println("Supuer: " + superpuesto);
        long end = System.currentTimeMillis();
        System.out.println("tiempo " + (end - startime));
    }
}

