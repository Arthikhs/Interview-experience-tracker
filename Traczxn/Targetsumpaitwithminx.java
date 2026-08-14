



package traczxn;
import java.util.Scanner;
    import java.util.*;
public class Targetsumpaitwithminx {
    public static void main(String[]args){
    


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
     
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        Arrays.sort(arr);

for (int i = 1; i < n; i++) {
    for (int j = i + 1; j < n; j++) {
        if (arr[i] + arr[j] == m) {
            System.out.println(arr[i] + " " + arr[j]);
        
        }
    }
}
sc.close();
    }
}
