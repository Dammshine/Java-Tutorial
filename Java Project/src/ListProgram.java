
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListProgram {
    public static void main(String[] args) {
        // List is an interface
        // ArrayList is an implementation
        List<Integer> grades = new ArrayList<Integer>();
        grades.add(1);
        grades.add(5);
        grades.add(10);
        grades.add(1,7);

        if (!grades.isEmpty()) {
            System.out.println(grades.get(1));
        }

        /**
         * Index Of
         */
        System.out.println(grades.indexOf(1));
        System.out.println(grades.indexOf(-1));
        
        /**
         * Contains
         */
        System.out.println(grades.contains(3));

        /**
         * Remove and clear
         */
        grades.remove(1);
        grades.clear();


        // Convert array to a list
        List<Integer> graddd = Arrays.asList(4, 66, 2, 4, -2, -3);
        System.out.println(graddd.toString());
        System.out.println(Arrays.toString(graddd.toArray()));

        // Iterating through the array
        for (int i = 0; i < graddd.size(); i++) {
            System.out.println(graddd.get(i));
            graddd.set(i, 2 * graddd.get(i));
        }

        for (int i : graddd) {
            System.out.println(i);
        }
        
        /**
         * Sort, reverse
         */
        Collections.sort(graddd);
        System.out.println(graddd.toString());



        // Nested forEach loop
        List<List<Integer>> matrix = new ArrayList<List<Integer>>();
        matrix.add(Arrays.asList(1,2,3,4));
        matrix.add(Arrays.asList(5,6,7,8));
        matrix.add(Arrays.asList(9,10,11,12));
        for (List<Integer> line : matrix) {
            for (Integer i : line) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}
