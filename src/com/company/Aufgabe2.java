package com.company;

import java.util.List;

public class Aufgabe2 {

    public static int maxNum(List<Integer> array)
    {
        int max = 0;
        for(int i : array)
        {
            if (i>max)
                max = i;
        }
        return max;
    }

    public static int minNum(List<Integer> array)
    {
        int min = array.get(0);
        for(int i : array)
        {
            if (i < min)
                min = i;
        }
        return min;
    }


    public static int maxSum(List<Integer> array)
    {
        int sum = 0;
        int except = minNum(array);
        for(int i : array)
        {
            if(i != except)
            {
                sum += i;
            }
        }
        return sum;

    }


    public static int minSum(List<Integer> array)
    {
        int sum = 0;
        int except = maxNum(array);
        for(int i : array)
        {
            if(i != except)
            {
                sum += i;
            }
        }
        return sum;

    }

}
