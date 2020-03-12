package com.myApp.MyDemo.Models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test4 {
    static boolean b = false;
   public  static void neg(int n)
    {
        String s = String.valueOf(Math.abs(n));
        List<String> myList = new ArrayList<String>(Arrays.asList(s.split("")));
        int count=0;
        for(String str : myList)
        {
            if(Integer.parseInt(str)>=5)
            {
                myList.add(count,"5");
                break;
            }
            count++;
        }

result(myList);
    }
    public static void result(List<String> list)
    {
        String listString = "";

        for (String sg : list)
        {
            listString += sg;
        }
        System.out.println(Integer.parseInt(listString));
        if(b)
        {
            System.out.println(Integer.parseInt(listString) * -1);
        }
    }

    public static void main(String[] args) {

        int n = -999;
        if (n < 0) {
            b = true;
            neg(n);

        } else {
            String s = String.valueOf(n);
            List<String> myList = new ArrayList<String>(Arrays.asList(s.split("")));
            int count = 0;
            for (String str : myList) {
                if (Integer.parseInt(str) <= 5) {
                    myList.add(count, "5");
                    break;
                }
                count++;
            }
            result(myList);
        }
    }
}
