
package Traczxn;
import java.util.Scanner;

public class substringfrequency  {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String sub = scan.nextLine();
        int count = 0;
        int index = 0;
        while((index=str.indexOf(sub,index))!=-1){
            count++;
            index++;
        }
    System.out.println(count);
scan.close();

    }
    
}
