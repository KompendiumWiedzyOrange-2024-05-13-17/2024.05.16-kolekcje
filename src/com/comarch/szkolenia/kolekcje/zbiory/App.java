package com.comarch.szkolenia.kolekcje.zbiory;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();

        set.add("Janusz");
        set.add("Wiesiek");
        set.add("Tomek");
        set.add("Zbyszek");
        set.add("Karol");

        System.out.println(set);

        set.add("Karol");

        System.out.println(set);

        set.remove("Karol");

        System.out.println(set);

        for(String s : set) {
            System.out.println(s);
        }
    }
}
