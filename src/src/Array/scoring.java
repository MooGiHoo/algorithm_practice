package Array;

import java.io.*;
import java.util.*;

public class scoring {
    public static int solution(int n, int[] arr){
        int answer = 0;
        boolean flag = false;
        int num = 1;
        for(int i=0; i<n; i++) {
            if(arr[i]==1&&flag) {
                num++;
                answer += num;
            }
            else if(arr[i]==1&&!flag) {
                answer += 1;
                flag = true;
            }
            else {
                flag = false;
                num = 1;
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
        System.out.println(solution(n, arr));
    }
}


