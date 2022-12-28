package Array;

import java.io.*;
import java.util.*;

public class get_rank {
    public static String solution(int n, int[] arr){
        StringBuilder sb = new StringBuilder();
        int[] grade = new int[n];
        for(int i=0; i<n; i++) {
            int place = 1;
            for(int j=0; j<n; j++) {
                if(i!=j) {
                    if(arr[i]<arr[j]) place++;
                }
            }
            grade[i] = place;
            sb.append(grade[i]).append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(n, arr));
    }
}

