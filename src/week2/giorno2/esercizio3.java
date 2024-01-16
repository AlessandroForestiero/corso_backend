package week2.giorno2;

import java.util.*;

public class esercizio3 {
    private HashMap<String, Integer> rubrica = new HashMap<>();

    public void aggiungiContatto(String nome, int numero) {
        this.rubrica.put(nome, numero);
    }

    public void rimuoviContatto(String nome) {
        this.rubrica.remove(nome);
    }

    public String ricercaPersona(int numero) {
        List<String> keys = new ArrayList<>();
        return "";
    }
}


