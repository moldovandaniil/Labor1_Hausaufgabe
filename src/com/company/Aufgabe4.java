package com.company;

import java.util.List;

public class Aufgabe4 {

    public static int cheapest(List<Integer> arr)
    {
        int min = arr.get(0);
        for (int i : arr)
        {
            if (i<min)
                min=i;
        }
        return min;
    }

    public static int expensive(List<Integer> tast, List<Integer> usb)
    {
        int max1 = 0;
        int max2 = 0;
        for(int i : tast)
        {
            if(max1<i)
                max1=i;
        }

        for(int i : usb)
        {
            if(max2<i)
                max2=i;
        }

        if(max1>max2)
            return max1;
        return max2;
    }


    public static int byBudget(List<Integer> usb, int budget)
    {
        int max1 = 0;

        for(int i : usb)
        {
            if(max1<i && i<=budget)
                max1=i;
        }

        return max1;

    }



}
