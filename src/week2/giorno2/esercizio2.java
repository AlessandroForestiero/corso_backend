package week2.giorno2;

import java.util.*;
import java.lang.Math;

public class esercizio2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> l = creaListaOrdinata(10);
        System.out.println(l);
        System.out.println(creaListaInversa(l));
        System.out.println(l);
        stampaParioDispari(l,false);
    }

    public static List<Integer> creaListaOrdinata(int n) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lista.add((int) (Math.random() * 100));
        }
        Collections.sort(lista);
        return lista;
    }

    public static List<Integer> creaListaInversa(List<Integer> lista) {
        List<Integer> nuovaLista = new ArrayList<>();
        nuovaLista.addAll(lista);
        Collections.reverse(lista);
        nuovaLista.addAll(lista);
        return nuovaLista;
    }

    public static void stampaParioDispari(List<Integer> lista, boolean a) {
        if (a == true) {
            for (int i = 0; i < lista.size(); i += 2) {
                System.out.println(lista.get(i));
            }
        } else {
            for (int i = 1; i < lista.size(); i += 2) {
                System.out.println(lista.get(i));
            }
        }

    }

    ;
}
