package extraRetos;
import java.time.*;
import java.util.*;


public class pecesMap {

    public static int contadorInicial(int[] v, int num){
        int total = 0;

        for (int i = 0; i < v.length; i++) {
            if (v[i] == num) total++;
        }
        return total;
    }


    public static void main(String[] args) throws InterruptedException {
        long startime = System.currentTimeMillis();
        int dias =  80;


        long end = System.currentTimeMillis();
        System.out.println("tiempo " + (end - startime));
    }





}
