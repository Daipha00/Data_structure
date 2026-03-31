//Given an integer x, return true if x is a palindrome, and false otherwise.

public class Palindrome {
    public static void main(String[] args){
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(122));
    }

            public boolean isPalindrome(int x) {
        // edge cases
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reversedHalf = 0;

        // reverse only half
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x = x / 10;
        }

        // even digits OR odd digits
        return x == reversedHalf || x == reversedHalf / 10;
    }
   
    }
