package medium.one_dimensional_array;

import java.util.Scanner;

public class OneDArrayPartTwo {
    public static boolean canWin(int leap, int[] game) {
        // Starting at the begining of the game arr
        return isLegalMove(leap, game, 0);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }

    public static boolean isLegalMove(int leap, int[] game, int index) {

        // Checking the cases
        if (index >= game.length) return true;
        else if (index < 0 || game[index] != 0) return false;

        // Updating the current index's value to 1
        game[index] = 1;

        // Recursive calling the function on the 3 cases we have [index + leap, index + 1, index -1]
        return isLegalMove(leap, game, index + leap) ||
                isLegalMove(leap, game, index + 1) ||
                isLegalMove(leap, game, index - 1);
    }
}
