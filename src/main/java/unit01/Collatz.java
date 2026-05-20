package unit01;

public class Collatz {
    public static String sequence(int n) {
        if (n < 1) return "";
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            sb.append(" ").append(n);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] testValues = {-1, 0, 1, 2, 3, 4, 5, 13};
        for (int n : testValues) {
            System.out.println("sequence(" + n + ") = \"" + sequence(n) + "\"");
        }
    }
}