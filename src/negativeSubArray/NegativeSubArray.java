package negativeSubArray;
import java.util.*;
public class NegativeSubArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        int count = 0;
        for(int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < length; i++) {
            int sum = 0;
            for(int j = i; j >= 0; j--) {
                sum += arr[j];
                if(sum < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }

}
