import java.util.Arrays;

public class EqualString {
    public static void main(String[] args){
            String s1 = "abcd";
            String s2 = "dcba";

            EqualString equalString1 = new EqualString();
            boolean equalString = equalString1.equalString(s1, s2);

            System.out.println(equalString);
    }

    public boolean equalString(String s1, String s2){
           if(s1.length() != s2.length()) return false;

          char[] even1 = {s1.charAt(0), s1.charAt(2)};
          char[] odd1  = {s1.charAt(1), s1.charAt(3)};
          
          char[] even2 = {s2.charAt(0), s2.charAt(3)};
          char[] odd2 = {s2.charAt(1), s2.charAt(3)};

          Arrays.sort(even1);
          Arrays.sort(odd1);

          Arrays.sort(even2);
          Arrays.sort(odd2);

          return Arrays.equals(even1,even2) && Arrays.equals(odd1, odd2);
         

    }
}
