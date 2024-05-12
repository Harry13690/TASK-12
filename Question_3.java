package task12;

import java.util.TreeMap;

public class Question_3 {

    public static void main(String[] args) {

        //Declaring TreeMap
        TreeMap<String, Integer> tm = new TreeMap<String, Integer>();

        //Adding the Key and Values
        tm.put("Harry", 1);
        tm.put("Ash", 2);
        tm.put("Serena", 3);
        tm.put("Ben Tennyson", 4);
        tm.put("Shinchan", 5);
        tm.put("Zekrom", 6);
        tm.put("Rayquaza", 7);

        //Getting the Key using ForEach Loop
        for ( String s : tm.keySet() ) {
            System.out.println("\n" +"Employee Name : " + s);
        }
    }
}

