package medium;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class JavaDequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();

        // Holding the in-row unique "Unique values only"
        HashSet<Integer> uniqueInRowNumebrs = new HashSet<>();

        int n = in.nextInt();
        int m = in.nextInt();
        // Max unique numbers amount in a set of m numbers. Default = 1
        int maxUniqueNumbersAmountInSet = 1;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.addLast(num);
            uniqueInRowNumebrs.add(num);

            // As the min-value of m is 1
            if (i >= m - 1) {

                // Updating the amount of unique numbers
                if (uniqueInRowNumebrs.size() > maxUniqueNumbersAmountInSet) {
                    maxUniqueNumbersAmountInSet = uniqueInRowNumebrs.size();
                }

                // Checking next number
                int numberToRemove = (Integer) deque.remove();
                if (!deque.contains(numberToRemove)) {
                    uniqueInRowNumebrs.remove(numberToRemove);
                }
            }
        }

        // Final output
        System.out.println(maxUniqueNumbersAmountInSet);
    }
}
