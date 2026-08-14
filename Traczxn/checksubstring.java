package traczxn;
import java.util.Scanner;

public class checksubstring {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        if(s1.contains(s2)){
            System.out.println(1);

        }
        else{
            System.out.println(-1);

        }
scan.close();

    }
    
}
