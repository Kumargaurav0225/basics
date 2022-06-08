package misc;

public class PalindromeString {
    public static void main(String[] args) {
        String s1 = "aabaa";
        String s2 = "abc";

        boolean result1 = checkPalindrome(s1);
        System.out.println("Result :"+result1);

        boolean result2 = checkPalindrome(s2);
        System.out.println("Result :"+result2);
    }

    private static boolean checkPalindrome(String str) {
        int start =0;
        int end = str.length()-1;

        while (start<end){
            if (str.charAt(start) != str.charAt(end))
                return false;

            start++;
            end--;
        }
        return true;
    }
}
