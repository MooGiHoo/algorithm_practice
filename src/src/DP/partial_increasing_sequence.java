package DP;

import java.io.*;
import java.util.*;

public class partial_increasing_sequence {
    static int[] dy;
    public static int solution(int[] arr){
        int answer = 0;
        dy[0] = 1;
        dy = new int[arr.length];
        for(int i=1; i<arr.length; i++) {
            int max=0;
            for(int j=i-1; j>=0; j--) {
                if(arr[j]<arr[i] && dy[j] > max) max = dy[j];
            }
            dy[i] = max+1;
            answer = Math.max(dy[i], answer);
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
        dy = new int[n];
        System.out.println(solution(arr));
    }
}










