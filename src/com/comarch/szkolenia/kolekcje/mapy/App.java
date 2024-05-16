package com.comarch.szkolenia.kolekcje.mapy;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(15, "Karol");
        mapa.put(30, "Janusz");
        mapa.put(40, "Mateusz");
        mapa.put(40, "Wiesiek");

        System.out.println(mapa.get(40));

        System.out.println(mapa.size());

        System.out.println(mapa);
    }
}
