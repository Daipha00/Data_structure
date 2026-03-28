//Given two strings s and t, return true if t is an anagram of s and false otherwise

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
           String s = "cat";
           String t = "tachjj";

           Anagram anagram = new Anagram();
           boolean is_Anagram = anagram.isAnagram(s, t);

           System.out.println(is_Anagram);
    }

    public boolean isAnagram(String s, String t){
            if(s.length() != t.length()) return false;

            char[] a = s.toCharArray();
            char[] b = t.toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            return Arrays.equals(a, b);

            
    }
}
