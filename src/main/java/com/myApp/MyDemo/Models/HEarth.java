package com.myApp.MyDemo.Models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HEarth {
    public static void main(String[] args) {
       Integer a [] = {1,2,3,4,5,6,7,8,9};
        List<Integer> list = Arrays.asList(a);
        Collections.sort(list);
        

        System.out.println( Collections.max(list));
        System.out.println(Collections.min(list));
    }
}
