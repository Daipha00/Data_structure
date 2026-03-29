//Given an array group, str[], group the anagrams together you can return the answer in any order.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public static void main(String[] args){
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};

        GroupAnagram groupAnagram = new GroupAnagram();     
    }

    public List<List<String>> groupAnagrams(String[] str){
        Map<String, List<String>> map = new HashMap<>();

        for(String s: str){
            int[] chars = new int[26];

            for (char c: s.toCharArray()){
                chars[c-'a']++;
            }

           String key = Arrays.toString(chars);

           map.putIfAbsent(key, new ArrayList<>());
           map.get(key).add(s);
        }

        return new ArrayList<>(map.values());

    }
}
