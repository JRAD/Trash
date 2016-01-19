package com.junk;

import java.io.Console;
import java.util.HashMap;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
        boolean results = IsUnique("tiger`");
        System.out.print(results);
    }

    /*
     * returns true if all letters are unique in input
     */
    public static boolean IsUnique(String input)
    {
        HashMap charmap = new HashMap();
        for (int i = 0; i < input.length(); i++)
        {
            charmap.putIfAbsent(input.charAt(i),i);
        }

        return charmap.size() == input.length();
    }

    /*
     * returns the count of pairs that are k apart
     */
    public void KDifference()
    {
        int [] sample = {1,7,5,9,2,12,3};
        int k = 2;
        HashMap results = new HashMap();
        int count = 0;

        HashMap hashMap = new HashMap();
        for (int i = 0; i < sample.length; i++)
        {
            hashMap.put(i, sample[i]);
        }

        for (int item: sample )
        {
            if(hashMap.containsValue(item + k))
            {
                count++;
            }
        }

        System.out.print(count);
    }
}