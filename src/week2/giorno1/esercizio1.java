package week2.giorno1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class esercizio1 {

    private static final Logger logger=LoggerFactory.getLogger(esercizio1.class);
    private static int[] valoriCasuali = new int[]{1, 5, 7, 8, 3};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = -1;
        while (x != 0) {
            try {
                System.out.println("inserisci un numero");
                x = scanner.nextInt();
                if (x != 0) {
                    System.out.println("inserisci una posizione");
                    int y = scanner.nextInt();
                    valoriCasuali[y] = x;
                    System.out.println(Arrays.toString(valoriCasuali));
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("posizione non concessa");
                logger.error("posizione non concessa");
            } catch (InputMismatchException e) {
                System.out.println("numero non valido");
                logger.error("numero non valido");
                scanner.nextLine();
            }

        }
    }
}

