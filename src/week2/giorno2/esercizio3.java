package week2.giorno2;

import java.util.*;

public class esercizio3 {
    public static void main(String[] args) {
        ;
    }
    private HashMap<String, Integer> rubrica = new HashMap<>();

    public void aggiungiContatto(String nome, int numero) {
        this.rubrica.put(nome, numero);
    }

    public void rimuoviContatto(String nome) {
        this.rubrica.remove(nome);
    }

    public void ricercaPersona(int numero) {
        Set<String> keys = rubrica.keySet();
        for (String c : keys) {
            System.out.println(rubrica.get(c));
        }
    }
}



