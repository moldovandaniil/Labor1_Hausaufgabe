package com.company;

import java.util.ArrayList;
import java.util.List;
import com.company.Aufgabe1;
import com.company.Aufgabe2;
import com.company.Aufgabe3;

public class Main {

    public static void main(String[] args) {

        //aufgabe 1 test
        List<Integer> test = new ArrayList<Integer>();
        test.add(36);
        test.add(48);
        test.add(9);
        System.out.println(Aufgabe1.notEnough(test));
        System.out.println(Aufgabe1.arithmeticMedia(test));
        System.out.println(Aufgabe1.roundedMarks(test));
        System.out.println(Aufgabe1.roundedMax(test));

        //aufgabe 2 test
        System.out.println(Aufgabe2.minNum(test));
        System.out.println(Aufgabe2.maxNum(test));
        System.out.println(Aufgabe2.minSum(test));
        System.out.println(Aufgabe2.maxSum(test));

        //aufgabe 3 test


    }










}
