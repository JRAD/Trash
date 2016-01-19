package com.junk;

import java.io.Console;
import java.util.HashMap;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {


    }

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