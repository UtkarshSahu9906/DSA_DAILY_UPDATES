
import javax.print.DocFlavor;

public class PalindromeString {

    public static void main(String[] args) {

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

    }

    
        static  boolean isPalindrome(String s) {
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                    str.append(s.charAt(i));
                } else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    str.append(s.charAt(i));
                } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                    char changedChar = (char) (s.charAt(i) + 32);
                    str.append(changedChar);
                }
            }
    
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(str.length() - j - 1)) {
    
                } else if (str.charAt(j) != str.charAt(str.length() - j - 1)) {
                    return false;
                }
    
            }
            return true;
        }
    }
