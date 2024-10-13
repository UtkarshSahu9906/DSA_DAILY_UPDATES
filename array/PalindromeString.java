
import javax.print.DocFlavor;

public class PalindromeString {

    public static void main(String[] args) {
        String s = Palindrome("abcddcba");
        System.out.println(s);
        System.out.println(checkStr(s));

    }

    static String Palindrome(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                str += s.charAt(i);
            } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                char changedChar = (char) (s.charAt(i) + 32);
                str += changedChar;
            }
        }

        return str;
    }

    static boolean checkStr(String str) {
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == str.charAt(str.length() - j - 1)) {

            } else if (str.charAt(j) != str.charAt(str.length() - j - 1)) {
                return false;
            }

        }
        return true;
    }
}
