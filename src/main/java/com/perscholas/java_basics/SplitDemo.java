package com.perscholas.java_basics;
import java.util.Arrays;

public class SplitDemo {
    public static void main(String[] args) {
        /*
         *The split() method divides the string at the specified regex and
         *  returns an array of substrings. The syntax of the string split() method is:
         * string.split(String regex, int limit)
         * regex - the string is divided at this regex (can be strings)
         * limit (optional) - controls the number of resulting substrings
         *
         */
        String vowels = "a::b::c::d:e";
        String[] result = vowels.split("::");
        System.out.println(Arrays.toString(result));
    }
}
