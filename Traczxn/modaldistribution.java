package traczxn;
import java.util.*;
public class modeldistribution {
    

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] ranks = new int[n];

        for (int i = 0; i < n; i++) {
            ranks[i] = scanner.nextInt();
        }

        int[] medals = new int[n];

        for (int i = 0; i < n; i++) {
            medals[i] = Math.max(1, ranks[i]);
        }

        for (int i = 1; i < n; i++) {
            if (ranks[i] > ranks[i - 1]) {
                medals[i] = Math.max(medals[i], medals[i - 1] + 1);
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (ranks[i] > ranks[i + 1]) {
                medals[i] = Math.max(medals[i], medals[i + 1] + 1);
            }
        }

        for (int i = 0; i < n; i++) {

            System.out.print(medals[i]);

            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        scanner.close();
    }
}