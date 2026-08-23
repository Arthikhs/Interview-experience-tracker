package Traczxn;
import java.util.*;
public class Largestnumberoformed {
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] arr = new String[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        for (String s : arr) {
            System.out.print(s);
        }

        sc.close();
    }
}