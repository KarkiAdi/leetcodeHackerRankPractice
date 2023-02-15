/* A string conversion function, ExCamel, needs to be written.
This function forms a return string, OutString, from a given string, InString, by:
1 separating the original words (a word is assumed to start with a capital letter)
2 converting all characters to lower case.
The following shows a pair of example values for the string values InString and OutString.
 InString : "MyUserInput"
 OutString : "my user input"
You may assume that InString always starts with a capital letter. */

public class ExCamel {
    public static String ExCamel1(String inString) {
        char nextChar;
        String outString = "";
        for (int index = 0; index < inString.length(); index++) {
            nextChar = inString.charAt(index);
            if (nextChar >= 'A' && nextChar <= 'Z') {
                if (index > 0) {
                    outString += " ";
                }
                nextChar = Character.toLowerCase(nextChar);
            }
            outString += nextChar;
        }
        return outString;
    }

    public static void main(String[] args) {
        System.out.println(ExCamel1("MyMotherIsGreat I Love Her"));
    }

}
