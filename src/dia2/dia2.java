package dia2;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.Year;
import java.util.*;

public class dia2 {
    public static void main(String[] args) throws FileNotFoundException {
        int puntos = 0;
        char jugada;
        Scanner entrada = new Scanner(new File("src/dia2/guiaEstrategia"));
        while (entrada.hasNextLine()) {
            String linea = entrada.nextLine();
            String rondas[] = linea.split(" ");

            String miJugada = rondas[1];
            String jugadaRival = rondas[0];

            if (miJugada.equals("Z")){
                puntos += 6;
                if (jugadaRival.equals("A")) puntos +=2;
                else if (jugadaRival.equals("B")) puntos+=3;
                else puntos++;

            } else if (miJugada.equals("Y")){
                puntos+= 3;
                if (jugadaRival.equals("A")) puntos ++;
                else if (jugadaRival.equals("B")) puntos+=2;
                else puntos+=3;


            } else{
                if (jugadaRival.equals("A")) puntos +=3;
                else if (jugadaRival.equals("B")) puntos++;
                else puntos+=2;


            }
            System.out.println(puntos);
        }
        System.out.println(puntos);

    }
}

