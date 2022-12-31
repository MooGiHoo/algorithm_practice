package two_pointers;

import java.io.*;
import java.util.*;

public class continuous_subsequence {
    public static int solution(int k, int[] arr){
        int answer = 0;
        int lt = 0;
        int sum = 0;
        for(int rt = 0; rt<arr.length; rt++) {
            sum += arr[rt];
            if(sum==k) answer++;
            while(sum>=k) {
                sum -= arr[lt++];
                if(sum==k) answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(m, arr));
    }
}

