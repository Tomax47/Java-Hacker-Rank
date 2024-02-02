package easy;

import java.util.Scanner;

// EOF : End Of File in Java
public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 1;
        while (scan.hasNext()) {
            System.out.println(count+" "+scan.nextLine());
            count++;
        }
    }
}
