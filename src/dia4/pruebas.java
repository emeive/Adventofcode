package dia4;

import java.util.HashSet;
import java.util.TreeSet;

public class pruebas {

    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();

        a.add(5);
        a.add(6);
        a.add(7);

        b.add(6);

        boolean h = a.containsAll(b);
        System.out.println(h);


    }
}
