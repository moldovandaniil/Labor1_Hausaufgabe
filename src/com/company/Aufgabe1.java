package com.company;

import java.util.ArrayList;
import java.util.List;

public class Aufgabe1 {

    //function for checking the not passed students
    public static List<Integer> notEnough(List<Integer> array)
    {
        List<Integer> notPassed = new ArrayList<Integer>();
        for(int i = 0; i < array.size(); i++)
        {
            if(array.get(i) < 40)
            {
                notPassed.add(array.get(i));
            }
        }

        return notPassed;
    }

    //arithmetic media of all the grades
    public static double arithmeticMedia(List<Integer> array)
    {
        double sum = 0;
        double numOfStud = 0;
        for(int i : array)
        {
            sum = sum + i;
            numOfStud++;
        }

        return sum/numOfStud;
    }


    //rounded marks
    public static List<Integer> roundedMarks(List<Integer> array)
    {
        List<Integer> rounded = new ArrayList<Integer>();

        for(int i : array)
        {
            if(i>37)
            {
                if(i % 5 > 2)
                {
                    i=(i/5)*5 + 5;
                    rounded.add(i);
                    continue;
                }
                rounded.add(i);
                continue;
            }
            rounded.add(i);


        }
        return rounded;
    }


    //max rounded number
    public static int roundedMax(List<Integer> array)
    {
        int max = 0;
        List<Integer> rounded = new ArrayList<Integer>();

        for(int i : array)
        {
            if(i>37)
            {
                if(i % 5 > 2)
                {
                    i=(i/5)*5 + 5;
                    rounded.add(i);
                    continue;
                }
                rounded.add(i);
                continue;
            }
            rounded.add(i);

        }
        for (int i : rounded)
        {
            if (i>max)
                max = i;
        }
        return max;
    }
}
