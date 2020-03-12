package com.myApp.MyDemo.Models;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String a[]) {
//       int ar [] = {1,3,6,4};int fuel=3;
//        int temp=0,i=ar.length-1;
//        int count=0;
//        while(temp!=fuel && i!=0){
//            for(int j=0;j<=i;j++){
//                if(temp<fuel){
//                temp=temp+Math.abs(ar[i]-ar[j]);
//                System.out.println(temp);
//                count++;}
//                else{
//                    break;}
//            }i--;temp=0;
//            //System.out.println(temp);
//        }
//
//              System.out.println(count/2);
        aman();
    }

    public static void aman() {
        String arr[] = {"ate", "tea", "utc", "cut"};
        List<String> check = new ArrayList<>();
        Map<Integer,String[]> map = new HashMap<>();
        Set<String[]> result = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int k = 1; k < arr.length; k++) {
                if (arr[i].length() == arr[k].length()) {
                    if (i != k) {
                        char[] c = arr[i].toCharArray();
                        char[] cc = arr[k].toCharArray();
                        Arrays.sort(c);
                        String sorted1 = new String(c);
                        Arrays.sort(cc);
                        String sorted2 = new String(cc);

                        if (sorted1.equals(sorted2) && Collections.frequency(check, arr[i]) <= 0 && Collections.frequency(check, arr[k]) <= 0) {
                            String[] sarr = new String[2];
                            sarr[0] = arr[i];
                            sarr[1] = arr[k];
                            check.add(sarr[0]);
                            check.add(sarr[1]);
                            if(map.containsKey(sarr[0].length()))
                            {
                                String [] tarr = map.get(sarr[0].length());

                            }
                            System.out.println("SARR" + Arrays.toString(sarr));
                            result.add(sarr);
                        }

                    }
                }
            }
        }
    }
}
