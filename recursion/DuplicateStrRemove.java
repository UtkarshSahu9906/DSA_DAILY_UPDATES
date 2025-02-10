package recursion;

public class DuplicateStrRemove {

    public static void main(String[] args) {
        boolean[] map =new boolean[26];
        StringBuilder newStr =new StringBuilder();
        duplicateStrRemove("utkarshsahu", 0, newStr, map);

    }

    static void  duplicateStrRemove(String str, int index, StringBuilder newString, boolean[] map) {
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(index);
        if (map[currentChar - 'a']) {
            duplicateStrRemove(str, index + 1, newString, map);

        }

         else {
            map[currentChar - 'a'] = true;
             duplicateStrRemove(str, index, newString.append(currentChar), map);
        }
    }

        
   
}

