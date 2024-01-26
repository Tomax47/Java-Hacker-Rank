package easy;

import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1 =sc.next();
            int x =sc.nextInt();

            if (inputCheck(s1, x)) {
                printOutput(s1, getNumber(x));
            }

        }
        System.out.println("================================");

    }

    public static boolean inputCheck(String s, int n) {
        //String of a max length of 10 chars, and 0 =< int >= 999
        return ((s.length() <= 10) && (n >= 0 && n <= 999));
    }


    public static String getNumber(int n) {
        // Filling up zeros to the left, till the number is a 3-digits one
        String numberString = String.valueOf(n);

        if (numberString.length() < 3) {
            while (numberString.length() < 3) {
                numberString = "0" + numberString;
            }
        }

        return numberString;
    }

    public static void printOutput(String s1, String x) {

        // s1 is the string, and x is the number that we turned into a string

        System.out.print(s1);
        for (int i = s1.length(); i < 15; i++) {
            System.out.print(" ");
        }
        System.out.println(x);
    }
}
