/*  A string represents a series of whole numbers, separated 
by commas. For example: "12,13,451,22"
Assume that:
-> the comma character ',' is used as a separator
-> the string contains only the characters '0' to '9', '+', 
'-', and the comma character ','
A procedure Parse will:
• take the string as a parameter
• extract each number in turn
• returns the number.
*/
public class StringToNum {
    public int Parse(String strNum) {
        if (strNum.length() == 0) {
            return 0;
        }
        int intNum = 0;
        for (int i = 0; i < strNum.length(); i++) {
            char currentChar = strNum.charAt(i);
            switch (currentChar) {
                case ('0'):
                    intNum = intNum * 10 + 0;
                    break;
                case ('1'):
                    intNum = intNum * 10 + 1;
                    break;
                case ('2'):
                    intNum = intNum * 10 + 2;
                    break;
                case ('3'):
                    intNum = intNum * 10 + 3;
                    break;
                case ('4'):
                    intNum = intNum * 10 + 4;
                    break;
                case ('5'):
                    intNum = intNum * 10 + 5;
                    break;
                case ('6'):
                    intNum = intNum * 10 + 6;
                    break;
                case ('7'):
                    intNum = intNum * 10 + 7;
                    break;
                case ('8'):
                    intNum = intNum * 10 + 8;
                    break;
                case ('9'):
                    intNum = intNum * 10 + 9;
                    break;
            }
        }
        if (strNum.charAt(0) == '-') {
            intNum = -intNum;
            return intNum;
        }
        return intNum;
    }
}
