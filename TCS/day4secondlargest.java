import java.util.Scanner;

public class day4secondlargest {
  public static void main(String[] args) {
    Scanner Scan = new Scanner(System.in);
    System.out.println("enter the siZe of array:");
    int n = Scan.nextInt();
    System.out.println("enter the number of array:");
    int [] arr =  new int[n];
    for(int i =0;i<arr.length;i++){
       arr[i] = Scan.nextInt();
    }
    int largest = Integer.MIN_VALUE;
    int secondlargest = Integer.MIN_VALUE;
    for(int i =0;i<arr.length;i++){
      if(arr[i]>largest){
        secondlargest= largest;
        largest = arr[i];
      }
      else if(arr[i]>secondlargest&&arr[i]!=largest)
      {
        secondlargest = arr[i];
      }
    }
    Scan.close();
    System.out.println(secondlargest);


  }
  
  
}