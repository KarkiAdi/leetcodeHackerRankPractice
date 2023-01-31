def mySqrt(self, x):
        n = 1
        while n < x / n:
            n += 1
            
        if n == x / n:
            return n
        else:
            return n - 1