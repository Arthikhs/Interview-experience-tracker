

import java.util.Arrays;

public class movetozeroend { 
    public static void main(String[]args){
        int [] arr = {1,2,5,3,5,0,2,3,5};
        int j= 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
                j++;
            }
        }
         System.out.println(Arrays.toString(arr));
    }
    
}
