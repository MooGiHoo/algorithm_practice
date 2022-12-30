package Array;

import java.io.*;
import java.util.*;

public class temporary_class_leader {
    public static int solution(int n, int[][] arr){
        int answer = 0;
        int[] grade = new int[n+1];
        for(int i=0; i<n; i++) {
            int count = 0;
            for(int j=0; j<n; j++) {
                int target = arr[i][j];
                for(int k=0; k<n; k++) {
                    if(j!=k&&target==arr[k][j]) {
                        count++;
                        break;
                    }
                }
            }
            grade[i+1] = count;
        }
        for(int x : grade) {
            System.out.print(x + " ");
        }
        return answer;
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

