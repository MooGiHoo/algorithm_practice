package Array;

import java.io.*;
import java.util.*;

public class peaks {
    public static int solution(int n, int[][] arr){
        int answer = 0;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                int target = arr[i][j];
                if(target>arr[i-1][j]&&target>arr[i][j-1]&&target>arr[i+1][j]&&target>arr[i][j+1]) {
                    answer++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n+2][n+2];
        StringTokenizer st;
        for(int i=1; i<=n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(solution(n, arr));
    }
}

