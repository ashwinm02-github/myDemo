package com.myApp.MyDemo.Models;

import java.util.*;

public class Test3 {
    public static void main(String []a )
    {
        String arr[] = {"ate", "tea", "utc", "cut","abcd","bcad"};
        Map<Integer, List<String>> map = new HashMap<>();
        for(String s:arr)
        {
            int len = s.length();
            List<String> list = new ArrayList<>();
            if(map.containsKey(len))
            {
                list = map.get(len);
                list.add(s);
            }
            else
            {
                list.add(s);
                map.put(len,list);
            }
        }

        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {

            List <String> listEle = entry.getValue();
            char[] c = listEle.get(0).toCharArray();
            Arrays.sort(c);
            String def = c.toString();
            for(int i =1;i<listEle.size();i++)
            {

                char [] cc = listEle.get(i).toCharArray();
                Arrays.sort(cc);
                String comp = cc.toString();
                if(comp.equals(def))
                {
                    System.out.println(def);
                }

            }
        }
    }
}
