public class Multiples {
    public static void main(String[] args) {
        int total = 0;
        for (int x = 0; x < 1000; x++) {
            if (x%3 == 0 || x%5 == 0) {
                total += x;
            }
        }

        System.out.println(total);
    }
}