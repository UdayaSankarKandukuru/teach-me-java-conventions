package powerpackage;

public class powerfinder {
    public static int power(int base, int pow) {
        int ans = 1;
        for (int i = 0; i<pow; i++) {
            ans *= base;
        }
        return ans;
    }
}
