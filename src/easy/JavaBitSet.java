package easy;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {
    private static BitSet b1;
    private static BitSet b2;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String primaryInput = scan.nextLine();
        String[] arr = primaryInput.split("\\s");

        b1 = new BitSet(Integer.parseInt(arr[0]));
        b2 = new BitSet(Integer.parseInt(arr[0]));

        b1.set(0, b1.size() - 1, false);
        b2.set(0, b1.size() - 1, false);

        for (int i = 0; i < Integer.parseInt(arr[1]); i++) {
            String input = scan.nextLine();
            String[] inputsArray = input.split("\\s");
            processInput(inputsArray);
        }

        scan.close();
    }

    public static void processInput(String[] arr) {
        String command = arr[0];

        // Commands
        if (command.equals("SET")) {
            // Perform a SET operation
            if (arr[1].equals("1")) {
                b1.set(Integer.parseInt(arr[2]), true);
            } else if ( arr[1].equals("2")) {
                b2.set(Integer.parseInt(arr[2]), true);
            }

            System.out.println(calculateActiveBits(b1)+" "+calculateActiveBits(b2));

        } else if (command.equals("FLIP")) {
            // Perform a FLIP operation
            if (arr[1].equals("1")) {
                b1.flip(Integer.parseInt(arr[2]));
            } else if ( arr[1].equals("2")) {
                b2.flip(Integer.parseInt(arr[2]));
            }

            System.out.println(calculateActiveBits(b1)+" "+calculateActiveBits(b2));

        } else if (command.equals("AND")) {
            if (arr[1].equals("1")) {
                b1.and(b2);
            } else if ( arr[1].equals("2")) {
                b2.and(b1);
            }

            System.out.println(calculateActiveBits(b1)+" "+calculateActiveBits(b2));

        } else if (command.equals("OR")) {
            if (arr[1].equals("1")) {
                b1.or(b2);
            } else if ( arr[1].equals("2")) {
                b2.or(b1);
            }

            System.out.println(calculateActiveBits(b1)+" "+calculateActiveBits(b2));

        } else if (command.equals("XOR")) {
            if (arr[1].equals("1")) {
                b1.xor(b2);
            } else if ( arr[1].equals("2")) {
                b2.xor(b1);
            }

            System.out.println(calculateActiveBits(b1)+" "+calculateActiveBits(b2));
        }
    }

    public static int calculateActiveBits(BitSet b) {
        int n = 0;
        for (int i = 0; i < b.size(); i++) {
            if (b.get(i) == true) {
                n++;
            }
        }

        return n;
    }
}
