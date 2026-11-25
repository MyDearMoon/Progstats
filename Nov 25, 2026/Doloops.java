public class Doloops {
    public static void main(String[] args) {
        int val = 0;
        do {
            System.out.println(val - 2);
            val++;
        } while (val < 5);

        System.out.printf("%n%n");

        val = 0;
        do {
            System.out.println(val + 2);
            val++;
        } while (val <= 5);

        System.out.printf("%n%n");

        val = 1;
        int ctr = 0;
        do {
            System.out.println(ctr);
            ctr += 2;
            val++;
        } while (val < 4);

        System.out.printf("%n%n");

        // Nested loop
        int customer = 1;
        do {
            int color = 1;
            do {
                System.out.println(color);
                color++;
            } while (color <= 3);

            customer++;
        } while (customer <= 20);
    }
}
