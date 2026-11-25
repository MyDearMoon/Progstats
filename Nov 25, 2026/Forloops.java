public class Forloops {
    public static void main(String[] args) {
        for (int val = 0; val < 5; ++val) {
            System.out.println(val - 2);
        }

        System.out.printf("%n%n");

        for (int val = 0; val <= 5; ++val) {
            System.out.println(val + 2);
        }

        System.out.printf("%n%n");

        for (int val = 1, ctr = 0; val < 4; ctr += 2, val++) {
            System.out.println(ctr);
        }

        System.out.printf("%n%n");

        // Nested loop

        for (int customer = 1; customer <= 20; ++customer) {
            for (int color = 1; color <= 3; ++color) {
                System.out.println(color);
            }
        }
    }
}