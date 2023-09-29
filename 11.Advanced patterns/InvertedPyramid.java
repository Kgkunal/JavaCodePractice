public class InvertedPyramid {

    // function declaration
    public static void printHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // star
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Half pyramid");
        printHalfPyramid(50);
    }
}
