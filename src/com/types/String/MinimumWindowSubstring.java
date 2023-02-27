package com.types.String;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {


    boolean containsAllCharInString(Map<Character, Integer> tMap, String source, String searchString) {
        boolean flag = true;

        if (source.length() < searchString.length())
            return false;

        for (Map.Entry<Character, Integer> entry : tMap.entrySet()) {
            Integer curCount = entry.getValue();
            Character character = entry.getKey();
            long count = source.chars().filter(x -> x == character).count();

            if (Long.valueOf(count).intValue() < curCount) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public String minWindow(String s, String t) {
        if (s==null || t ==null)
            return null;

        int l=0, r=1;
        String minString = "";

        Map<Character, Integer> tMap = new HashMap<>();
        for (char c: t.toCharArray()) {
            Integer i = tMap.get(c);
            Integer count = i != null ? i+1 : 1;
            tMap.put(c, count);
        }
        while (l < r && r != s.length()+1) {

            String temp = s.substring(l,r);
            if (containsAllCharInString(tMap, temp, t)) {
                if (minString.length() == 0 || temp.length() <= minString.length()) {
                    minString = temp;
                }
                l++;
            } else
                r++;

        }


        return minString;
    }

    public static void main(String[] args) {
        // System.out.println(new MinimumWindowSubstring().minWindow("acbbaca", "aba")); //"baca"
        System.out.println(new MinimumWindowSubstring().minWindow("cabwefgewcwaefgcf", "cae")); //"cwae"
    }
}
