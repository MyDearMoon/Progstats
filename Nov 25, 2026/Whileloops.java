public class Whileloops {
    public static void main(String[] args) {
        int val = 0;
        while (val < 5) {
            System.out.println(val - 2);
            val++;
        }

        System.out.printf("%n%n");

        val = 0;
        while (val <= 5) {
            System.out.println(val + 2);
            val++;
        }

        System.out.printf("%n%n");

        val = 1;
        int ctr = 0;
        while (val < 4) {
            System.out.println(ctr);
            ctr += 2;
            val++;
        }

        System.out.printf("%n%n");

        // Nested loop
        int customer = 1;
        while (customer <= 20) {
            int color = 1;
            while (color <= 3) {
                System.out.println(color);
                color++;
            }

            customer++;
        }
    }
}
