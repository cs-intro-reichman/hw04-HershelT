import java.util.Arrays;

public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
//        System.out.println(capVowelsLowRest("aeiouhhsdfsfshdAEIOU"));
//        System.out.println(camelCase("  I LIKE TO EAT APPLE AND BANNAS  "));
//        System.out.println(Arrays.toString(allIndexOf("hello world", 'd')));
    }

    public static String capVowelsLowRest (String strings) {
        // Write your code here:
        char[] vowels = new char[]{'a','e','i','o','u'};
        String newString = "";
        boolean passes = false;
        for (int i = 0; i < strings.length(); i++){
            for (int j = 0;j<vowels.length;j++){
                if (strings.charAt(i) == (char)(vowels[j] + 32)) {
                    newString += (char) (strings.charAt(i)+32);
                    passes = true;
                    break;
                }
                else if (strings.charAt(i) == vowels[j]){
                    newString += (char) (strings.charAt(i) - 32);
                    passes = true;
                    break;
                }
            }
            if (!passes && strings.charAt(i) < 97 && strings.charAt(i) != ' ') {
                newString += (char) (strings.charAt(i) + 32);
            }
            else if (!passes) {
                newString += strings.charAt(i);
            }
            passes = false;
        }
        return newString;
    }

    public static String camelCase (String string) {
        String newString = "";
        boolean first = true;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i)== ' ') {
                while (string.charAt(i) == ' ' && i <string.length()-1) {
                    i++;
                }
                if (string.charAt(i) == ' ') continue;
                else if (string.charAt(i) < 97) {
                    if (first) newString += (char) (string.charAt(i)+32);
                    else newString+=string.charAt(i);
                }
                else if (string.charAt(i)>96) {
                    if (first) newString += string.charAt(i);
                    else newString+=(char) (string.charAt(i)-32);
                }
            }
            else {
                if (string.charAt(i) < 97) newString+=(char) (string.charAt(i)+32);
                else newString+= string.charAt(i);
            }
            first = false;
        }
        return newString;
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        int indexCount = 0;
        for (int i = 0; i < string.length();i++) {
            if (string.charAt(i) == chr) {
                indexCount++;
            }
        }
        int[] indexList =  new int[indexCount];
        int step = 0;
        for (int j = 0; j < string.length(); j++){
            if (string.charAt(j) == chr) {
                indexList[step] = j;
                step++;
            }
        }

        return indexList;
    }
}
