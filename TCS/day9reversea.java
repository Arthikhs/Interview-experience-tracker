
import java.util.Scanner;

public class day9reversea {
  public static void main(String[] args) {
     Scanner Scan = new Scanner(System.in);
    System.out.println("enter the siZe of array:");
    int n = Scan.nextInt();
    System.out.println("enter the number of array:");
    int [] arr =  new int[n];
    for(int i =0;i<arr.length;i++){
       arr[i] = Scan.nextInt();
    }

    for(int i = arr.length-1;i>=0;i--){
      System.out.println(arr[i]);
    }
    Scan.close();
  }}