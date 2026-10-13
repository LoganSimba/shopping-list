package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {

    public static void main(String[] args) {
        //print what we want in our shopping list
        System.out.println("Spaghetti");
        System.out.println("Canned salmon");
        System.out.println("Tomatoe Sauce");
        System.out.println("Rice");
        System.out.println("Beans");
        System.out.println("Stew Beef");
        System.out.println("Chicken breast");
        System.out.println("Cereals");
        System.out.println("Milk");
        System.out.println("Eggs");

        List<String> arr = new ArrayList<>();
        arr.add("Spaghetti");
        arr.add("rice");

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i) + " you have to use .get() ");
        }
    }
}

