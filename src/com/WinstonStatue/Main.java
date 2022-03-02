package com.WinstonStatue;


import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        String[] array = {"gaming", "Risk of Reiner", "Zech Herod", "MLA formating","d","a","c","b"};

        ArrayList<String> list = new ArrayList<>(List.of(array));

        //System.out.println(firstLetter(list));
        //System.out.println(min(list));
        lessThanTwo(list);
        //sortCheatMethod(list);
        sort(list);
    }

    public static String firstLetter(ArrayList<String> letters){
        StringBuilder returner = new StringBuilder();
        for (String word: letters){
            returner.append(word.charAt(0));
        }
        return returner.toString();
    }

    public static String min(ArrayList<String> val){
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

    public static ArrayList<String> lessThanTwo(ArrayList<String> two){
        for(int i = 0;i<two.size();i++){
            if(two.get(i).length() > 2){
                two.remove(i);
                i--;
            }
        }
        return two;
    }

    public static void sortCheatMethod(ArrayList<String> words){
        Collections.sort(words);
        System.out.println(words);
    }

    public static void sort(ArrayList<String> words){
        String temp;
        for(int i = 0;i<words.size();i++){
            System.out.println(words);
            int selected = 0;
            for(int e = i+1; e<words.size(); e++){
                if((int)words.get(e).charAt(0) > (int)words.get(i).charAt(0)){
                    selected = e;
                }
                System.out.println(selected);
            }
            //System.out.println(selected);
            temp = words.get(i);
            words.set(i,words.get(selected));
            words.set(selected, temp);
        }
        System.out.println(words);
    }
}
