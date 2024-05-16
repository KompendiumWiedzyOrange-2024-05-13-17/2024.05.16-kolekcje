package com.comarch.szkolenia.kolekcje.listy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        System.out.println(list.size());
        list.add("Janusz");
        list.add("Wiesiek");
        list.add("Karol");
        list.add("Mateusz");

        System.out.println(list.size());

        list.remove(0);

        System.out.println(list.size());

        System.out.println(list.get(0));

        System.out.println(list.contains("Janusz"));

        ((ArrayList<String>) list).trimToSize();
    }
}
