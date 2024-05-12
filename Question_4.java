package task12;

import java.util.LinkedList;
import java.util.List;

public class Question_4{

    public static void main(String[] args) {

        //Declaring LinkedList
        List<Integer> l = new LinkedList<>();
        //Adding Elements in LinkedList
        l.add(111);
        l.add(222);
        l.add(333);
        l.add(444);
        l.add(555);

        //Declaring the Array
        int [] ar = new int[l.size()];
        //Loop to insert the Elements from List to Array one by one
        for (int i = 0; i < l.size(); i++) {
            ar[i] = l.get(i);
        }
        //Printing the Elements from Array
        for (int x : ar){
            System.out.println("Element of Array : " + x);
        }
    }
}
