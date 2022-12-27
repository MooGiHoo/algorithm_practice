package Array;

import java.io.*;
import java.util.*;

public class visible_student {
    public static int solution(int n, int[] arr){
        int answer = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            int target = arr[i];
            if(target>max) {
                answer++;
                max = target;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(n ,arr));
    }
}

