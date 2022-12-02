import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class day01 {
    public static void main(String[] args) throws FileNotFoundException {

        boolean finFcihero = false;
        int suma = 0;
        int masCalorias = 0;

        Scanner entrada = new Scanner(new File("src/calorias"));
        while (entrada.hasNextLine() && !finFcihero){
            String linea = entrada.nextLine();
            if (linea.length() != 0) {
                int number = Integer.parseInt(linea);
                suma += number;
                System.out.println(number);
            }else {
                if (suma > masCalorias) masCalorias = suma;
                suma = 0;
            }
        }

        entrada.close();
        System.out.println("El duende con mas calorias es: " + masCalorias);



    }
}