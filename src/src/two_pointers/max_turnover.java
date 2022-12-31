package two_pointers;

import java.io.*;
import java.util.*;

public class max_turnover {
    public static int solution(int k, int[] arr){
        int answer= Integer.MIN_VALUE;
        int sum = 0;
        int lt = 0, rt = 0;
        while(rt<arr.length) {
            if((rt-lt)==k) {
                answer = Integer.max(answer, sum);
                sum -= arr[lt++];
                sum += arr[rt++];
            }
            else {
                sum += arr[rt++];
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(k, arr));
    }
}


