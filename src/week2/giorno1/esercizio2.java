package week2.giorno1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;
public class esercizio2 {
    private static final Logger logger=LoggerFactory.getLogger(esercizio2.class);
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try {
            System.out.println("inserisci numero kilometri percorso");
            int x = scanner.nextInt();
            System.out.println("inserisci carburante consumato");
            int y = scanner.nextInt();
            System.out.println(x/y);
        }
        catch (ArithmeticException  e) {
            System.out.println("non posso dividere per zero");
            logger.error("non posso dividere per zero");
        }
        catch (InputMismatchException e){
            System.out.println("devi inserire un numero");
            logger.error("devi inserire un numero");
        }
    }
}
