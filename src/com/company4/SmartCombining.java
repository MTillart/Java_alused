package com.company4;

import java.util.ArrayList;

public class SmartCombining {
    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(4);
        list1.add(3);

        list2.add(5);
        list2.add(10);
        list2.add(4);
        smartCombine(list1, list2);

        System.out.println(list1);
    }

    public static void smartCombine(ArrayList<Integer> first, ArrayList<Integer> second){
        int i=0;
        while (i< second.size()){
            i++;
            for (int nr : second) {
                if (first.contains(nr)){
                    continue;
            }else {
                    first.add(nr);
                }
            }
        }

    }
}
