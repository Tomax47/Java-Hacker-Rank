package easy;

import java.util.*;

public class JavaList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read length of arr
        int n = scan.nextInt();
        scan.nextLine();
        String numbersString = scan.nextLine();

        String[] numbers = numbersString.split("\\s");
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(numbers[i]));
        }

        int q = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < q; i++) {
            String query = scan.nextLine();
            String input = scan.nextLine();
            processQuery(arr, query, input);
        }

        for (int number : arr) {
            System.out.print(number+" ");
        }
    }

    public static void processQuery(List<Integer> arr, String query, String input) {

        String[] inputs = input.split("\\s");

        if (query.equals("Insert")) {
            arr.add(Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1]));
        } else if (query.equals("Delete")) {
            arr.remove(Integer.parseInt(inputs[0]));
        }
    }
}