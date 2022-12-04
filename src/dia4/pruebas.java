package dia4;

import java.util.TreeSet;

public class pruebas {

    public static void main(String[] args) {
        TreeSet<Integer> a = new TreeSet<>();
        TreeSet<Integer> b = new TreeSet<>();

        a.add(5);
        a.add(6);
        a.add(7);

        b.add(7);

        a.retainAll(b);
        System.out.println(a);


    }
}
