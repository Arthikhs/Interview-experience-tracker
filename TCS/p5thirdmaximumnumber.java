

package TCS;
import java.util.Scanner;
public class p5thirdmaximumnumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
       int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num != first) {
                third = second;
                second = num;
            }
            else if (num > third && num != first&& num != second) {
                third =  num;
            }
        }

        System.out.println("Second Largest: " + third);
    }
}
   