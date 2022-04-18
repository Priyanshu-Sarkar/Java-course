package exercise;

public class qnine {
    public static void main(String[] args) {
        int D, d;
        D = 36;
        d = 24;
        System.out.println(hcf(D, d));
    }

    public static int hcf(int D, int d) {
        int r = divide(D, d);
        if (r != 0) {
            return hcf(d, r);
        }
        return d;
    }

    public static int divide(int Divident, int divisor) {
        int remainder = Divident % divisor;
        return remainder;
    }
}
