package TCS;
import java.util.Scanner;
public class p6twosum {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n < 2) {
       System.out.println("Invalid array");
        scan.close();
        
        return;
               }
         int [] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = scan.nextInt();

        } 

        
        
        boolean found = false;
        int target = scan.nextInt();
       for(int i =0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==target){
                System.out.println(i+" "+j);
                 found = true;
                
            }
            
        }
       }
       if(!found){
       System.out.println("no soution");
       }
                    scan.close();
    }
}