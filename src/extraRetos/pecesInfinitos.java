package extraRetos;
import java.time.*;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class pecesInfinitos {
    public static void main(String[] args) throws InterruptedException {
        long startime = System.currentTimeMillis();
        int dias = 80;
        int ponenHuevo = 0;

        int[] estadoInicial = {4,3,4,5,2,1,1,5,5,3,3,1,5,1,4,2,2,3,1,5,1,4,1,2,3,4,1,4,1,5,2,1,1,3,3,5,1,1,1,1,4,5,1,2,1,2,1,1,1,5,3,3,1,1,1,1,2,4,2,1,2,3,2,5,3,5,3,1,5,4,5,4,4,4,1,1,2,1,3,1,1,4,2,1,2,1,2,5,4,2,4,2,2,4,2,2,5,1,2,1,2,1,4,4,4,3,2,1,2,4,3,5,1,1,3,4,2,3,3,5,3,1,4,1,1,1,1,2,3,2,1,1,5,5,1,5,2,1,4,4,4,3,2,2,1,2,1,5,1,4,4,1,1,4,1,4,2,4,3,1,4,1,4,2,1,5,1,1,1,3,2,4,1,1,4,1,4,3,1,5,3,3,3,4,1,1,3,1,3,4,1,4,5,1,4,1,2,2,1,3,3,5,3,2,5,1,1,5,1,5,1,4,4,3,1,5,5,2,2,4,1,1,2,1,2,1,4,3,5,5,2,3,4,1,4,2,4,4,1,4,1,1,4,2,4,1,2,1,1,1,1,1,1,3,1,3,3,1,1,1,1,3,2,3,5,4,2,4,3,1,5,3,1,1,1,2,1,4,4,5,1,5,1,1,1,2,2,4,1,4,5,2,4,5,2,2,2,5,4,4};
        List<int[]> paquetes = new LinkedList<>();
        Set<int[]> provisionales = new HashSet<>();

        for (int i = 0; i <estadoInicial.length ; i++) {
            int[] conjunto = {1, 7 - estadoInicial[i], 1, 0};
            paquetes.add(conjunto);

        }

        for (int i = 0; i < estadoInicial.length; i++) {
            int[] familia = paquetes.get(i);   //tengo el vector  [ peces del grupo, contador, true ]


            familia[1] = familia[1] ++;
            familia[1] = familia[1] % 7;


        }





        long end = System.currentTimeMillis();
        System.out.println("tiempo " + (end - startime));
    }





}
