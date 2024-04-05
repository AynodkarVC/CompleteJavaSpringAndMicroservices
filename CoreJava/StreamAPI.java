package clases.CoreJava;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                System.out.println(nums.get(i));
            }
        }

        for (int n : nums){
            System.out.println(n);
        }
//        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
//       for (int i = 0; i < arr.length; i++) {
//           arr[i] = in.nextInt();
//       }
//        for (int j : arr){
//            System.out.println(j);
//        }

    }
}
