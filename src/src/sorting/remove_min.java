package sorting;

import java.util.Arrays;

public class remove_min {
    public static int[] solution(int[] arr) {
        if(arr.length<=1) {
            int[] err = {-1};
            return err;
        }
        int[] answer = new int[arr.length-1];
        Arrays.sort(arr);
        for(int i=1; i<arr.length; i++) {
            answer[i-1] = arr[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] arr1 = {4,3,2,1};
        int[] arr2 = {10};
        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
    }
}
