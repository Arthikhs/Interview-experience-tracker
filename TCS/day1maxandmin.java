import java.util.Scanner;

public class day1maxandmin {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("enter the size number of aray:");
    int n = scan.nextInt();
    int [] arr = new int[n];
    System.out.println("enter the number of array:");
    for(int i =0;i<arr.length;i++){
      arr[i] = scan.nextInt();
      

    }
    int max = arr[0];
    for(int i =0;i<arr.length;i++){
      if(arr[i]< max){
        max = arr[i];
      }
    }
    scan.close();
    System.out.println(max);

    
  
    

  }

  
}