package com.quest.study_programs;

public class LongestSubstring {
    public static void main(String args[])
    {
        String[] arr = {"flower", "flow", "fly" };


        System.out.println(findstem(arr));
    }

    public static String findstem(String[] arr) {


        String first = arr[0];
        int len = first.length();

        String res = "";

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {

                String substring = first.substring(i, j);
                int k = 1;
                for (k = 1; k < arr.length; k++) {

                    if (!arr[k].contains(substring))
                        break;
                }
                    if (k == arr.length && res.length() < substring.length())
                        res = substring;
                }
            }

        return res;
    }
}
