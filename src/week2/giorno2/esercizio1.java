package week2.giorno2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> setParole = new HashSet<>();
        Set<String> paroleDuplicate = new HashSet<>();
        System.out.println("inserisci numeri di elementi da inserire");
        int lunghezza = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < lunghezza; i++) {
            System.out.println("inserisci un parola");
            String p = scanner.nextLine();
            if (!setParole.add(p)) {
                paroleDuplicate.add(p);
            }
        }
        System.out.println(setParole);
        System.out.println(setParole.size());
        System.out.println(paroleDuplicate);
    }
}
