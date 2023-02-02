class ReverseNumber {
    public int reverse(int x) {
        int y, rem;
        int rev = 0;
        // finding absolute value of x
        if (x < 0) {
            y = -x;
        } else {
            y = x;
        }
        // storing last digit to rev until first digit is reached
        while (y != 0) {
            rem = y % 10;
            rev = rev * 10 + rem;
            y /= 10;
        }
        // change to negative if given value of x was negative
        if (x < 0) {
            return -rev;
        }
        return rev;
    }
}