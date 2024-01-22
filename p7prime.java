interface myInterface {
    void nthPrime(int n);
}

class p7prime {
    public static void main(String[] quark) {
        myInterface x = (n) -> {
            int count = 0;
            System.out.print(2 + " ");
            int p = 3;
            while (count != n-1) {
                if (prime(p)) {
                    count++;
                    System.out.print(p + " ");
                }
                p += 2;
            }
        };

        x.nthPrime(100);
    }

    public static boolean prime(int n) {
        if (n == 1 || (n % 2 == 0 && n != 2)) {
            return false;
        } else if (n == 2) {
            return true;
        } else {
            int sq = (int) Math.sqrt(n);
            for (int i = 3; i <= sq; i += 2) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
