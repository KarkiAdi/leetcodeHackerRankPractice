/* You must prompt user to give a password, until a proper
validation is met.
A password has a fixed format, consisting of three groups 
of four alphanumeric characters, separated by the hyphen 
character '-'.
An example of a password is:
 "FxAf-3haV-Tq49"
 Each password must:
• be 14 characters long
• be organised as three groups of four alphanumeric 
characters (treat lower/upper case as different characters). 
The groups are separated by hyphen characters
• not include any duplicated characters, except for the 
hyphen characters. */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PasswordValidation {
    public static void main(String args[]) {
        boolean returnFlag = true;
        Scanner input = new Scanner(System.in);
        String userPassword;
        do {
            System.out.print("Enter a valid password: ");
            userPassword = input.next();
            HashSet<Object> uniqueAlphaCharacters = new HashSet<Object>();
            if (userPassword.length() == 14) {
                if (userPassword.charAt(4) == '-' && userPassword.charAt(9) == '-') {
                    for (int i = 0; i < 14; i++) {
                        if (i != 4 && i != 9) {
                            String currentChar = String.valueOf(userPassword.charAt(i));
                            int charAscii = userPassword.charAt(i);
                            if (!uniqueAlphaCharacters.contains(currentChar)) {
                                if ((charAscii >= 65 && charAscii <= 90) || (charAscii >= 97 && charAscii <= 122)
                                        || (charAscii >= 48 && charAscii <= 57)) {
                                    uniqueAlphaCharacters.add(currentChar);
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }

            }
            if (uniqueAlphaCharacters.size() == 12) {
                returnFlag = false;
            }
        } while (returnFlag);
    }
}
