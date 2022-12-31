package two_pointers;

import java.io.*;
import java.util.*;

public class sum_of_consecutive_num {
    public static int solution(int n, int[] arr){
        int answer = 0;
        int sum = 0;
        int lt = 1, rt = 1;
        while(rt<=n) {
            if(sum == n) {
                answer++;
                sum = sum - arr[lt++] + arr[rt++];
            }
            else if(sum >n) {
                sum -= arr[lt++];
            }
            else {
                sum += arr[rt++];
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        for(int i=1; i<=n; i++) {
            arr[i] = i;
        }
        System.out.println(solution(n ,arr));
    }
}

