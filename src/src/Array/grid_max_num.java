package Array;

import java.io.*;
import java.util.*;

public class grid_max_num {
    public static int solution(int n, int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for(int j=0; j<n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            max = Integer.max(max, sum1);
            max = Integer.max(max, sum2);
        }
        int sum3 = 0;
        for(int i=0; i<n; i++) {
            sum3 += arr[i][i];
        }
        max = Integer.max(max, sum3);
        int k = n-1;
        int sum4 = 0;
        for(int i=0; i<n; i++) {
            sum4 += arr[k--][i];
        }
        max = Integer.max(max, sum4);
        return max;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        StringTokenizer st;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(solution(n, arr));
    }
}

