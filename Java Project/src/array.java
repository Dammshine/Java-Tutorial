import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int[] grades = {9, 9, 7, 4, 3, 1, 4, 2, 5, 3};
        System.out.println(Arrays.toString(grades));
        /* int[][][] grades2 = {{{2,3,3}, {2,3}, {9, 9, 7, 4, 3, 1, 4, 2, 5, 3}}};
        System.out.println(Arrays.deepToString(grades2)); */

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < grades.length; i++) {
            int x = input.nextInt();
            grades[i] = x;
        }
        System.out.println(Arrays.toString(grades));

    }
}
