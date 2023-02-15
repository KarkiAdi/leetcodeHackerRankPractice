public class ValidateRegistration {
    public static boolean Validate(String mark) {
        char currentChar;
        if (mark.length() >= 6 && mark.length() <= 9) {
            for (int index = 0; index < mark.length(); index++) {
                currentChar = mark.charAt(index);
                if ((index >= 0 && index <= 2) || index > 4) {
                    if (currentChar >= 'A' && currentChar <= 'Z') {
                        continue;
                    }
                } else if (currentChar >= '0' && currentChar <= '9') {
                    continue;
                }
                return false;
            }
        } else {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Validate("ABC10BBF"));
    }

}
