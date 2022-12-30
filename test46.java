import java.util.FormatFlagsConversionMismatchException;
import java.util.Scanner;
public class test46{
    public static void main(String args[]){
        int[] Arr = {10,9,8,7,6,5,4,3,2,1,0};
        
        int target = 2;
        int targetIndex =0;
        int search_count = 0;

        for (int i=0; i<Arr.length;i++) {
            if(Arr[i] == 2) {
                targetIndex = i;
            }
            search_count ++ ;
        }
        System.out.println("The position is " + targetIndex);
        System.out.println("search_count "+search_count);
    }
}