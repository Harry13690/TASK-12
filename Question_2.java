package task12;

import java.util.ArrayList;

public class Question_2 {

    public static void main(String[] args) {
        //Declaring ArrayList
        ArrayList<Integer> al = new ArrayList<Integer>();

        //Adding the Elements in ArrayList
        al.add(234);
        al.add(566);
        al.add(987);
        al.add(675);
        al.add(435);

        System.out.println("\n" + "Before the Removal of Elements : " + al);

        //Loop to remove the elements by index
        for (int i = al.size() - 1; i >= 0 ; i--) {
             al.remove(i);
        }
        System.out.println("\n" + "After the Removal of Elements : " + al);
    }
}
//We can also Use "clear" or "removeAll" Method to Remove all
              //al.clear  or  removeAll