package dia5;

import jdk.jshell.spi.ExecutionControl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Freighter {

    private static void readInitialStatus() throws FileNotFoundException {
        Scanner inputFile = new Scanner(new File("src/dia5/freighter"));
        while (inputFile.hasNextLine()){
            String line = inputFile.nextLine();
            Stream<String> level = Arrays.stream(line.split(" ")).sequential();
            System.out.println(Arrays.toString(new Stream[]{level}));
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        readInitialStatus();
    }
}
