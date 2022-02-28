package com.WinstonStatue;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        String[] array = {"gaming", "Risk of Reiner", "Zech Herod", "MLA formating","e"};

        ArrayList<String> list = new ArrayList<>(List.of(array));

        System.out.println(firstLetter(list));
        System.out.println(min(list));
    }

    static String firstLetter(ArrayList<String> letters){
        StringBuilder returner = new StringBuilder();
        for (String word: letters){
            returner.append(word.charAt(0));
        }
        return returner.toString();
    }

    static String min(ArrayList<String> val){
        String shortest = "";
        int shortLength = Integer.MAX_VALUE;
        for(String word: val){
            if(word.length() < shortLength){
                shortest = word;
                shortLength = word.length();
            }
        }
        return shortest;
    }

    static String
}
