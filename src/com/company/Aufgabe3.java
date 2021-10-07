package com.company;

import java.util.ArrayList;
import java.util.List;

public class Aufgabe3 {

    public static List<Integer> sum(List<Integer> first, List<Integer> second)
    {
        List<Integer> arrSum = new ArrayList<Integer>();
        for(int i = 0; i < first.size(); i++)
        {
            arrSum.add(first.get(i)+second.get(i));
        }
        return arrSum;
    }

    public static List<Integer> diff(List<Integer> first, List<Integer> second)
    {
        List<Integer> arrSum = new ArrayList<Integer>();
        for(int i = 0; i < first.size(); i++)
        {
            arrSum.add(first.get(i)-second.get(i));
        }
        return arrSum;
    }

    public static List<Integer> mul(List<Integer> first, int second)
    {
        List<Integer> arrSum = new ArrayList<Integer>();
        for(int i = 0; i < first.size(); i++)
        {
            arrSum.add(first.get(i)*second);
        }
        return arrSum;
    }

    public static List<Integer> div(List<Integer> first, int second)
    {
        List<Integer> arrSum = new ArrayList<Integer>();
        for(int i = 0; i < first.size(); i++)
        {
            arrSum.add(first.get(i)/second);
        }
        return arrSum;
    }

}
