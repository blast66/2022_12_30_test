import java.util.Scanner;
public class test45{
    public static void main(String args[]){
        int[] Arr = {8,7,10,5,6,4,1,3,2,0,11,12,13} ;
        int[] flag = new int [Arr.length];
        int index = 0;
        int flag_count = 1;
        int num1 = 0;
        int med = 0;

        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();

        for (int i=0; i<Arr.length; i++){
            int flag_1 = Integer.MAX_VALUE;
            int flag_2 = 0;
            for (int j=0; j<Arr.length; j++) {
                if(Arr[j] < flag_1 && flag[j] == 0){
                    flag_1 = Arr[j];
                    flag_2 = j;
                    index = j;
                    
                }
            }
            System.out.println();
            flag[flag_2] = flag_count;
            flag_count++ ; 

            if (num1 == flag[index]) {
                System.out.println("input number: " + num1);
                System.out.println("index: " + (i+1));
                System.out.println("count: " + flag_count);
                break;
            }
        }

    }
}